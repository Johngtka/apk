package com.company;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        String waluta[] = {"usd", "eur", "gbp", "chf", "jpy"};
        int liczba[] = {1, 1, 1, 1, 100};
        double sprzedaz[] = {2.8685, 4.1244, 4.6290, 2.7730, 3.0959};
        double zakup[] = {2.8245, 4.0704, 4.5850, 2.7290, 3.0239};

        ObjectOutputStream zapisz = null;
        try{
            zapisz = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("kantor.bin"), 512));
            for(int k=0; k< waluta.length; k++){
                kantor kantor = new kantor(waluta[k],liczba[k], sprzedaz[k], zakup[k]);
                zapisz.writeObject(kantor);
            }



        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
        finally {
            if (zapisz !=null) zapisz.close();
        }









    }
}