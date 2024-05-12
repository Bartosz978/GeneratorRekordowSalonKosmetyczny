package org.example.klasy;

public class PracownikSalonu {
    private int Pracownik_Salonu_ID;
    private int ID_Salonu;
    private int Id_Pracownik;
    private int ID_Zmiany;

    public PracownikSalonu(int id, int salonId, int pracownikId, int zmianaId) {
        this.Pracownik_Salonu_ID = id;
        this.ID_Salonu = salonId;
        this.Id_Pracownik = pracownikId;
        this.ID_Zmiany = zmianaId;
    }
}