package com.example.animale;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Response implements Serializable {
    @SerializedName("animale")
    Animale animale;

    public Animale getAnimale() {
        return animale;
    }

    public void setAnimale(Animale animale) {
        this.animale = animale;
    }
}
