package org.example;

import org.example.constants.Wartosci_Losowe;
import org.example.file.Filesavecss;
import org.example.generate.Generuj;
import org.example.klasy.Kraj;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

      // Filesavecss.SavetoCSS(Generuj.returnKategoria(),"co.csv");
     //  Filesavecss.SavetoCSS(Generuj.returnKlienta(6000),"klient.csv");
       // System.out.println(Wartosci_Losowe.generujOpis());
        Filesavecss.SavetoCSS(Generuj.returnMiasto(),"miasta.csv");
    }
}