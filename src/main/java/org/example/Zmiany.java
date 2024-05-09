package org.example;

public class Zmiany {
    private int ID_Zmiany;
    private int Ilosc_Pracownikow;
    private String Godzina_Rozpoczecia;
    private String Godzina_Zakonczenia;

    public Zmiany(int id, int iloscPracownikow, String rozpoczecie, String zakonczenie) {
        this.ID_Zmiany = id;
        this.Ilosc_Pracownikow = iloscPracownikow;
        this.Godzina_Rozpoczecia = rozpoczecie;
        this.Godzina_Zakonczenia = zakonczenie;
    }
}
