package com.servicePaiement.paiement.model;


public class Patient {
    int id;
    String nom;
    String prenom;
    String telephone;
    String sexe;
    int  age;
    String adresse;
    Float taille;
    String groupe_sanguin;

    public Patient() {
    }

    public Patient(int id, String nom, String prenom, String telephone, String sexe, int age, String adresse, Float taille, String groupe_sanguin) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.sexe = sexe;
        this.age = age;
        this.adresse = adresse;
        this.taille = taille;
        this.groupe_sanguin = groupe_sanguin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String  sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Float getTaille() {
        return taille;
    }

    public void setTaille(Float taille) {
        this.taille = taille;
    }

    public String getGroupe_sanguin() {
        return groupe_sanguin;
    }

    public void setGroupe_sanguin(String groupe_sanguin) {
        this.groupe_sanguin = groupe_sanguin;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", sexe='" + sexe + '\'' +
                ", age=" + age +
                ", adresse='" + adresse + '\'' +
                ", taille=" + taille +
                ", groupe_sanguin='" + groupe_sanguin + '\'' +
                '}';
    }
}
