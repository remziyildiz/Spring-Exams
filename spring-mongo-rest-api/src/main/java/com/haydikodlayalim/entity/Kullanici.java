package com.haydikodlayalim.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document
public class Kullanici{
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public HashMap getOzellikleri() {
        return ozellikleri;
    }

    public void setOzellikleri(HashMap ozellikleri) {
        this.ozellikleri = ozellikleri;
    }

    @Id
    private String id;
    private String adi;
    private String soyadi;
    private HashMap ozellikleri;


}