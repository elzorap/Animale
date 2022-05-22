package com.example.animale;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Pisici implements Serializable {

    @SerializedName("img")
    private String img;

    @SerializedName("rasa")
    private String rasa;

    @SerializedName("varsta")
    private int varsta;

    @SerializedName("nume")
    private String nume;

    public Pisici(String img, String rasa, int varsta, String nume) {
        this.img = img;
        this.rasa = rasa;
        this.varsta = varsta;
        this.nume = nume;
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

}

