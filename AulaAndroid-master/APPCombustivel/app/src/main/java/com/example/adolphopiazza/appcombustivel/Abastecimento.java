package com.example.adolphopiazza.appcombustivel;

import io.realm.RealmObject;

/**
 * Created by 5103789 on 27-Nov-17.
 */

public class Abastecimento extends RealmObject {

    private String data;
    private String posto;
    private double kilometros;
    private double litros;

    public Abastecimento() {}

    Abastecimento (String data, String posto, double km, double lt) {
        this.data = data;
        this.posto = posto;
        this.kilometros = km;
        this.litros = lt;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}
