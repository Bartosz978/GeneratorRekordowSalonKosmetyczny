package org.example.klasy;

public class Pracownicy {
    private int Id_Pracownik;
    private String Imie;
    private String Nazwisko;
    private String Pesel;
    private String Numer_Telefonu;
    private String Email;
    private int ID_Stanowiska;

    public Pracownicy(int id, String imie, String nazwisko, String pesel, String numerTelefonu, String email, int stanowiskoId) {
        this.Id_Pracownik = id;
        this.Imie = imie;
        this.Nazwisko = nazwisko;
        this.Pesel = pesel;
        this.Numer_Telefonu = numerTelefonu;
        this.Email = email;
        this.ID_Stanowiska = stanowiskoId;
    }


    public String toString(int c) {
        return String.valueOf(c);
    }

    public String getId_Pracownik() {
        return toString(this.Id_Pracownik);
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getPesel() {
        return Pesel;
    }

    public String getNumer_Telefonu() {
        return Numer_Telefonu;
    }

    public String getEmail() {
        return Email;
    }

    public String getID_Stanowiska() {
        return toString(this.ID_Stanowiska);
    }
}
