package com.serviceConsultation.consultation.DAO;

import com.serviceConsultation.consultation.modele.Symptome;


import java.util.List;

public interface SymptomeDao {
    public List<Symptome> findAll();
    public Symptome findById(int id);
    public Symptome save(Symptome symp);

}
