package org.example.klasy;

import org.example.constants.Wartosci_Losowe;

public class Kategoria {
    public static final int Maxrekord = Wartosci_Losowe.kategorieKosmetyczne.length;
    private int ID_Kategori;
    private String Nazwa_Kategori;
    private String Opis_Kategori;

    public Kategoria(int id, String nazwa, String opis) {
        this.ID_Kategori = id;
        this.Nazwa_Kategori = nazwa;
        this.Opis_Kategori = opis;
    }

    @Override
    public String toString() {
        return String.valueOf(ID_Kategori);
    }

    public String getID_Kategori() {
        return toString();
    }

    public String getNazwa_Kategori() {
        return Nazwa_Kategori;
    }

    public String getOpis_Kategori() {
        return Opis_Kategori;
    }
}
