package com.example.animale;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Caini implements Serializable {

    @SerializedName("img")
    private String img;

    @SerializedName("rasa")
    private String rasa;

    @SerializedName("varsta")
    private int varsta;

    @SerializedName("nume")
    private String nume;

    @SerializedName("descriere")
    private String descriere;

    public Caini(String img, String rasa, int varsta, String nume, String descriere) {
        this.img = img;
        this.rasa = rasa;
        this.varsta = varsta;
        this.nume = nume;
        this.descriere = descriere;
    }

    public String getImg() {
        return img;
    }

    public String getRasa() {
        return rasa;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getDescriere() {
        return descriere;
    }
}
