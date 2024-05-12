package org.example.klasy;

import org.example.constants.Wartosci_Losowe;

public class Stanowisko {
    public static int Max_Index = Wartosci_Losowe.Stanowiska.length;
    private int ID_Stanowiska;
    private String Nazwa_Stanowiska;
    private String Opis;

    public Stanowisko(int id, String nazwa, String opis) {
        this.ID_Stanowiska = id;
        this.Nazwa_Stanowiska = nazwa;
        this.Opis = opis;
    }

    @Override
    public String toString() {
        return String.valueOf(ID_Stanowiska);
    }

    public String getNazwa_Stanowiska() {
        return Nazwa_Stanowiska;
    }

    public String getOpis() {
        return Opis;
    }

    public String getID_Stanowiska() {
        return toString();
    }
}
