package com.example.animale;



import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Animale implements Serializable {

    @SerializedName("caine")
    private List<Caini> caine;

    @SerializedName("pisica")
    private List<Pisici> pisica;

    public Animale(List<Caini> caine, List<Pisici> pisica) {
        this.caine = caine;
        this.pisica = pisica;
    }

    public List<Caini> getCaine() {
        return caine;
    }

    public List<Pisici> getPisica() {
        return pisica;
    }

}

