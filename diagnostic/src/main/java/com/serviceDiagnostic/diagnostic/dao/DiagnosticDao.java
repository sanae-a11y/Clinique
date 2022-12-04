package com.serviceDiagnostic.diagnostic.dao;



import com.serviceDiagnostic.diagnostic.modele.Diagnostic;

import java.util.List;

public interface DiagnosticDao {
    public List<Diagnostic> findAll();
    public Diagnostic findById(int id);
    public Diagnostic save(Diagnostic symp);

}
