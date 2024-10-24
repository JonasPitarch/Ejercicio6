package com.jonas;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Artistes {
    private String nom;
    private String genere;
    private List<String> cançons;


    public Artistes() {
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public List<String> getCançons() {
        return cançons;
    }

    public void setCançons(List<String> cançons) {
        this.cançons = cançons;
    }
}

