package org.example.klasy;

import javax.xml.crypto.Data;

public class Klienci {
    private int ID_Klienta;
    private String Imie;
    private String Nazwisko;
    private String Numer_Telefonu;
    private String Email;

    public Klienci(int id, String imie, String nazwisko, String numerTelefonu, String email) {
        this.ID_Klienta = id;
        this.Imie = imie;
        this.Nazwisko = nazwisko;
        this.Numer_Telefonu = numerTelefonu;
        this.Email = email;
    }
    @Override
    public String toString() {
        return String.valueOf(ID_Klienta);
    }

    public String getID_Klienta() {
        return toString();
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getNumer_Telefonu() {
        return Numer_Telefonu;
    }

    public String getEmail() {
        return Email;
    }
}

