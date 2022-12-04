package com.serviceEnregistrement.enregistrement.controller;

import com.netflix.discovery.EurekaClient;
import com.serviceEnregistrement.enregistrement.dao.PatientDao;
import com.serviceEnregistrement.enregistrement.modele.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RefreshScope
@RestController

public class patientController {


    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private PatientDao patientDao;


    /*Recuperer tous les patients */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/Patients", method = RequestMethod.GET)
    public List<Patient> listePatients(){
        return patientDao.findAll();
    }

    /* Recuperer un patient par son id */
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/Patients/{id}")
     public Patient afficherUnPatient(@PathVariable int id){
         return patientDao.findById(id);
     }





}
