package com.serviceEnregistrement.enregistrement.dao;


import com.serviceEnregistrement.enregistrement.modele.Patient;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Repository
public class PatientDaoImp implements PatientDao {

    public static List<Patient> patDatabase = new ArrayList<>();

    static {
        patDatabase.add(new Patient(1, new String("NGAKAM "), new String("Lafortune "),new String("+212658945625 "),new String("Feminin "),50,new String("Casablanca "), (float) 1.3,new String("AB ")));
        patDatabase.add(new Patient(2, new String("FADLI "), new String("Doha "),new String("+212689314577 "),new String("Feminin "),15,new String("Rabat "), (float) 1.5,new String("A+ ")));
        patDatabase.add(new Patient(3, new String("KHALID "), new String("Chaimae "),new String("+212615489634 "),new String("Feminin "),46,new String("Fes "), (float) 1.9,new String("B- ")));
        patDatabase.add(new Patient(4, new String("GOMINA "), new String("Gamal "),new String("+212658945675 "),new String("Masculin "),89,new String("Tanger "), (float) 1.6,new String("O+ ")));
        patDatabase.add(new Patient(5, new String("ALI "), new String("Baba "),new String("+212658947815 "),new String("Masculin "),23,new String("Oudja "), (float) 1.4,new String("O- ")));
    }


    @Override
    public List<Patient> findAll() {
        return patDatabase;
    }

    @Override
    public Patient findById(int id) {
        for (Patient pat: patDatabase){
            if (pat.getId() == id){
                return pat;
            }
        }
        return null;
    }



    @Override
    public Patient save(Patient pat) {
        patDatabase.add(pat);
        return pat;
    }
}
