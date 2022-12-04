package com.serviceDiagnostic.diagnostic.modele;

import org.springframework.stereotype.Service;

@Service
public class Diagnostic {

    private int id ;
    private String maladie ;
    private String traitement ;
    int  idSymptome;


    public Diagnostic() {
    }

    public Diagnostic(int id, String maladie, String traitement) {
        this.id = id;
        this.maladie = maladie;
        this.traitement = traitement;
    }

    public Diagnostic(int id, String maladie, String traitement, int  idSymptome) {
        this.id = id;
        this.maladie = maladie;
        this.traitement = traitement;
        this.idSymptome = idSymptome;
    }


    public int getIdSymptome() {
        return idSymptome;
    }

    public void setIdSymptome(int idSymptome) {
        this.idSymptome = idSymptome;
    }

    public int getId() {
        return id;
    }

    public String getMaladie() {
        return maladie;
    }

    public String getTraitement() {
        return traitement;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
    }

    public void setTraitement(String traitement) {
        this.traitement = traitement;
    }

    @Override
    public String toString() {
        return "Diagnostic{" +
                "id=" + id +
                ", maladie='" + maladie + '\'' +
                ", traitement='" + traitement + '\'' +
                ", idSymptome=" + idSymptome +
                '}';
    }
}
