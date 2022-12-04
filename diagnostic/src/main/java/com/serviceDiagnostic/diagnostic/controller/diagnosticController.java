package com.serviceDiagnostic.diagnostic.controller;

import com.netflix.discovery.EurekaClient;
import com.serviceDiagnostic.diagnostic.dao.DiagnosticDao;
import com.serviceDiagnostic.diagnostic.dao.DiagnosticDaoImp;
import com.serviceDiagnostic.diagnostic.modele.Diagnostic;
import com.serviceDiagnostic.diagnostic.modele.Symptome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RefreshScope
@RestController
public class diagnosticController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiagnosticDao diagnosticDao;


    @RequestMapping( value ="/d", method = RequestMethod.GET)
    public List <Diagnostic> listediagnostic() {
        return diagnosticDao.findAll();

    }

    @GetMapping(value="/d/{id}")
    public Diagnostic afficherdiag (@PathVariable int id){
        return diagnosticDao.findById( id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/Diagnostics/{id}")
    public Diagnostic afficherUnDiagnostic(@PathVariable int id) {

        Symptome list = restTemplate.getForObject("http://consultation/Symptomes/"+id, Symptome.class);
        System.out.println("RESPONSE " + list);
        Diagnostic diag = diagnosticDao.findById(id);
        diag.setIdSymptome(list.getId());
        return diag;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/Diagnostics")
    public List<Diagnostic> listeDiagnostic() {

        Symptome[] list = restTemplate.getForObject("http://consultation/Symptomes", Symptome[].class);
        System.out.println("RESPONSE " + list);

        List<Diagnostic> diagnostics = diagnosticDao.findAll();

        int i=0;
        for (Diagnostic diagnostic : diagnostics) {

            diagnostic.setIdSymptome(list[i].getId());
            i++;
        }

        return diagnostics;

    }
}