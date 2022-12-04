package com.servicePaiement.paiement.dao;

import com.servicePaiement.paiement.model.Paiement;

import java.util.List;

public interface PaiementDao {
    public List<Paiement> findAll();
    public Paiement findById(int id);
    public Paiement save(Paiement paiement);
}
