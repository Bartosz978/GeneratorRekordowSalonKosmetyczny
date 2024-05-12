package org.example.klasy;

public class Salon {
    private int ID_Salonu;
    private String Email;
    private String Telefon;
    private String Godziny_Otwarcia;
    private String Godziny_Zamkniecia;
    private int ID_Menadzera;
    private int ID_Ulica;
    private int ID_Miasta;
    private int ID_WOJEWODZTWA;
    private int ID_Kraju;

    public Salon(int id, String email, String telefon, String otwarcia, String zamkniecia, int menadzerId, int ulicaId, int miastoId, int wojewodztwoId, int krajId) {
        this.ID_Salonu = id;
        this.Email = email;
        this.Telefon = telefon;
        this.Godziny_Otwarcia = otwarcia;
        this.Godziny_Zamkniecia = zamkniecia;
        this.ID_Menadzera = menadzerId;
        this.ID_Ulica = ulicaId;
        this.ID_Miasta = miastoId;
        this.ID_WOJEWODZTWA = wojewodztwoId;
        this.ID_Kraju = krajId;
    }
}