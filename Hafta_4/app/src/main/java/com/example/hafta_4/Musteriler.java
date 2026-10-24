package com.example.hafta_4;

import java.io.Serializable;

public class Musteriler implements Serializable {
    private String isim;
    private int yas;

    public Musteriler(){

    }
    public Musteriler(String isim, int yas){
        this.isim=isim;
        this.yas=yas;
    }

    public String getIsim(){
        return isim;
    }

    public int getYas(){
        return yas;
    }
}
