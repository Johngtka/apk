package com.company;

import java.io.Serializable;

public class kantor implements Serializable {
    String waluta;
    int liczba;
    double kurssprzedaz;
    double kusrzakup;

    public kantor(String waluta, int liczba, double sprzedaz, double zakup) {
        this.waluta = waluta;
        this.liczba = liczba;
        kurssprzedaz = sprzedaz;
        kusrzakup = zakup;
    }
}
