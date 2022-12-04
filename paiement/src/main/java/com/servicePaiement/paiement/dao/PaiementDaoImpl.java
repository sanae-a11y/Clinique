package com.servicePaiement.paiement.dao;

import com.servicePaiement.paiement.model.Paiement;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PaiementDaoImpl implements PaiementDao {
    public static List<Paiement> paiements = new ArrayList<>();

    static {
        paiements.add(new Paiement(1, new String("Lafortune"), 145, new String("12/23"), 12345678, 1000));
        paiements.add(new Paiement(2, new String("Doha"), 148, new String("01/26"), 75612894, 2560));
        paiements.add(new Paiement(3, new String("Chaimae"), 562, new String("04/22"), 20489637, 100));
        paiements.add(new Paiement(4, new String("Gamal"), 784, new String("06/24"), 67103589, 250));
        paiements.add(new Paiement(5, new String("inconnu"), 238, new String("07/25"), 10549637, 1000));
    }


    @Override
    public List<Paiement> findAll() {
        return paiements;
    }

    @Override
    public Paiement findById(int id) {
        for (Paiement paiement: paiements){
            if (paiement.getId() == id){
                return paiement;
            }
        }
        return null;
    }

    @Override
    public Paiement save(Paiement paiement) {
        paiements.add(paiement);
        return paiement;
    }
}
