package com.serviceEnregistrement.enregistrement.dao;


import com.serviceEnregistrement.enregistrement.modele.Patient;

import java.util.List;

public interface PatientDao {
    public  List<Patient> findAll();
    public Patient findById(int id);
    public Patient save(Patient pat);

}
