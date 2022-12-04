package com.servicePaiement.paiement.web.controller;


import com.netflix.discovery.EurekaClient;

import com.servicePaiement.paiement.dao.PaiementDao;
import com.servicePaiement.paiement.model.Paiement;
import com.servicePaiement.paiement.model.Diagnostic;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.*;

@RefreshScope
@RestController
public class paiementController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private PaiementDao paiementDao;

    @RequestMapping( value ="/p", method = RequestMethod.GET)
    public List <Paiement> listepaiement() {
        return paiementDao.findAll();

    }

    @GetMapping(value="/p/{id}")
    public Paiement afficherpaie (@PathVariable int id){
        return paiementDao.findById( id);
    }

   // communication

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/Paiements/{id}")
    public Paiement afficherUnPaiement(@PathVariable int id) {

        Diagnostic list = restTemplate.getForObject("http://diagnostic/Diagnostics/"+id, Diagnostic.class);
        System.out.println("RESPONSE " + list);
        Paiement paie = paiementDao.findById(id);
        paie.setIdDiagnostic(list.getId());
        return paie;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/Paiements")
    public List<Paiement> listePaiement() {

        Diagnostic[] list = restTemplate.getForObject("http://diagnostic/Diagnostics", Diagnostic[].class);
        System.out.println("RESPONSE " + list);

        List<Paiement> paiements = paiementDao.findAll();

        int i=0;
        for (Paiement paiement : paiements) {

            paiement.setIdDiagnostic(list[i].getId());
            i++;
        }

        return paiements;

    }
}


