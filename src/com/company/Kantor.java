package com.company;

import java.io.Serializable;

public class Kantor implements Serializable {
    private final String waluta;
    private final int liczba;
    private final double kurssprzedaz;
    private final double kusrzakup;

    public Kantor(String waluta, int liczba, double sprzedaz, double zakup) {
        this.waluta = waluta;
        this.liczba = liczba;
        kurssprzedaz = sprzedaz;
        kusrzakup = zakup;
    }
}
