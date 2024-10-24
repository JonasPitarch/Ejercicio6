package com.jonas;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Escenari {
    private String nom;
    private String horari;
    private List<String> artistes_programats;  // Cambia el nombre aquí para que coincida con el JSON

    // Constructor por defecto
    public Escenari() {
    }

    // Constructor con parámetros
    public Escenari(String nom, String horari, List<String> artistes_programats) {
        this.nom = nom;
        this.horari = horari;
        this.artistes_programats = artistes_programats;
    }

    // Getters y setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String gethorari() {
        return horari;
    }

    public void setHorari(String horari) {
        this.horari = horari;
    }

    public List<String> getartistes_programats() {
        return artistes_programats;
    }

    public void setArtistes_programats(List<String> artistes_programats) {
        this.artistes_programats = artistes_programats;
    }
}
