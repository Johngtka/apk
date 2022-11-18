package com.company;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Kantor[] kantors = {
                new Kantor("usd", 1, 2.8685, 2.8245),
                new Kantor("eur", 1, 4.1244, 4.0704),
                new Kantor("gbp", 1, 4.6290, 4.5850),
        };
        try (ObjectOutputStream zapisz = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("kantor.bin"), 512))) {
            for (Kantor kantor : kantors) {
                zapisz.writeObject(kantor);
            }
        }
    }
}