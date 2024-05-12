package org.example.klasy;

public class Uslugi {
    private int ID_Uslugi;
    private String Nazwa_Uslugi;
    private String Opis_Uslugi;
    private int ID_Kategori;

    public Uslugi(int id, String nazwa, String opis, int kategoriaId) {
        this.ID_Uslugi = id;
        this.Nazwa_Uslugi = nazwa;
        this.Opis_Uslugi = opis;
        this.ID_Kategori = kategoriaId;
    }
}
