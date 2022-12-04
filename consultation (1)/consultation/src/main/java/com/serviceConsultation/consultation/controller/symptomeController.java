package com.serviceConsultation.consultation.controller;


import com.netflix.discovery.EurekaClient;
import com.serviceConsultation.consultation.DAO.SymptomeDao;
import com.serviceConsultation.consultation.modele.Patient;
import com.serviceConsultation.consultation.modele.Symptome;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
public class symptomeController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;


    @Autowired
    private SymptomeDao symptomeDao;

   @RequestMapping( value ="/s", method = RequestMethod.GET)
    public List <Symptome> listesymptomes() {
        return symptomeDao.findAll();

    }

    @GetMapping(value="/s/{id}")
    public Symptome affichersymp (@PathVariable int id){
        return symptomeDao.findById( id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
   @RequestMapping("/Symptomes/{id}")
    public Symptome afficherUnSymptome(@PathVariable int id) {

        Patient list = restTemplate.getForObject("http://enregistrement/Patients/"+id, Patient.class);
        System.out.println("RESPONSE " + list);
        Symptome symp = symptomeDao.findById(id);
        symp.setIdPatient(list.getId());
        return symp;
    }

    // Communication avec autre microservice
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/Symptomes")
    public List<Symptome> listeSymptomes() {

        Patient[] list = restTemplate.getForObject("http://enregistrement/Patients", Patient[].class);
        System.out.println("RESPONSE " + list);
        List<Symptome> symtomes = symptomeDao.findAll();

        int i=0;
        for (Symptome symtome : symtomes) {
            symtome.setIdPatient(list[i].getId());
            i++;
        }


        return symtomes;

    }


}
