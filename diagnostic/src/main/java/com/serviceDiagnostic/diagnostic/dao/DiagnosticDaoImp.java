package com.serviceDiagnostic.diagnostic.dao;

import com.serviceDiagnostic.diagnostic.modele.Diagnostic;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Repository
public class DiagnosticDaoImp implements DiagnosticDao {

    public static List<Diagnostic> diagDatabase = new ArrayList<>();

    static {
        diagDatabase.add(new Diagnostic(1, new String("CORONA"), new String("Suivre le traitement du corona virus à la lettre")));
        diagDatabase.add(new Diagnostic(2, new String("PALUDISME"), new String("Suivre le traitement du paludisme à la lettre")));
        diagDatabase.add(new Diagnostic(3, new String("RHUME"), new String("Suivre le traitement du rhume à la lettre")));
        diagDatabase.add(new Diagnostic(4, new String("ECZEMA"), new String("Suivre le traitement de l'eczema à la lettre")));
        diagDatabase.add(new Diagnostic(5, new String("MAL GASTRIQUE"), new String("Suivre le traitement du mal gastrique à la lettre")));

    }


    @Override
    public List<Diagnostic> findAll() {
        return diagDatabase;
    }

    @Override
    public Diagnostic findById(int id) {
        for (Diagnostic diag: diagDatabase){
            if (diag.getId() == id){
                return diag;
            }
        }
        return null;
    }

    @Override
    public Diagnostic save(Diagnostic diag) {
        diagDatabase.add(diag);
        return diag;
    }
}
