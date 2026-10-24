package com.example.ders2026;

public class Musteriler {
    public int musteriId;
    public String ad;
    public double odenecek;

    public Musteriler(int musteriId, String ad, double odenecek){
        this.musteriId=musteriId;
        this.ad=ad;
        this.odenecek=odenecek;
    }

    public int getMusteriId(){
        return this.musteriId;
    }

    public String getAd(){
        return this.ad;
    }
    public double getOdenecek(){
        return this.odenecek;
    }

}
