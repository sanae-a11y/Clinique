package com.servicePaiement.paiement.model;

public class Paiement {
    private int id;
    private String nomPorteurCarte;
    private int ccv;
    private String dateExp;
    private int numCarte;
    private int montant;
    private int idDiagnostic;

    /* Constructeur vide */



    public Paiement() {
    }

    /* Constructeur avec paramètres*/

    public Paiement(int id, String nomPorteurCarte, int ccv, String dateExp, int numCarte, int montant) {
        this.id = id;
        this.nomPorteurCarte = nomPorteurCarte;
        this.ccv = ccv;
        this.dateExp = dateExp;
        this.numCarte = numCarte;
        this.montant = montant;
    }

    /*Getters */

    public int getIdDiagnostic() {
        return idDiagnostic;
    }

    public void setIdDiagnostic(int idDiagnostic) {
        this.idDiagnostic = idDiagnostic;
    }

    public int getId() {
        return id;
    }

    public String getNomPorteurCarte() {
        return nomPorteurCarte;
    }

    public int getCcv() {
        return ccv;
    }

    public String getDateExp() {
        return dateExp;
    }

    public int getNumCarte() {
        return numCarte;
    }

    public int getMontant() {
        return montant;
    }

    /* Setters */

    public void setId(int id) {
        this.id = id;
    }

    public void setNomPorteurCarte(String nomPorteurCarte) {
        this.nomPorteurCarte = nomPorteurCarte;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public void setDateExp(String dateExp) {
        this.dateExp = dateExp;
    }

    public void setNumCarte(int numCarte) {
        this.numCarte = numCarte;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    /* Methode toString */

    @Override
    public String toString() {
        return "Paiement{" +
                "id=" + id +
                ", nomPorteurCarte='" + nomPorteurCarte + '\'' +
                ", ccv=" + ccv +
                ", dateExp='" + dateExp + '\'' +
                ", numCarte=" + numCarte +
                ", montant=" + montant +
                ", idDiagnostic=" + idDiagnostic +
                '}';
    }
}
