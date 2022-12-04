package com.servicePaiement.paiement.model;

import java.util.Arrays;


public class Symptome {
    int id;
    String[] symptomes;
    int  idPatient;

    /* constructeur rempli */

    public Symptome(String[] symptomes, int id) {
        this.symptomes = symptomes;
        this.id = id;
    }


    public Symptome(String[] symptomes, int id, int  idPatient) {
        this.symptomes = symptomes;
        this.id = id;
        this.idPatient = idPatient;
    }
    /* constructeur vide */

    public Symptome() {
    }

    /* setters */

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public void setSymptomes(String[] symptomes) {
        this.symptomes = symptomes;
    }

    public void setId(int id) {
        this.id = id;
    }
    /* getters */

    public String[] getSymptomes() {
        return symptomes;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Symptome{" +
                "symptomes=" + Arrays.toString(symptomes) +
                ", id=" + id +
                ", idPatient=" + idPatient +
                '}';
    }
}
