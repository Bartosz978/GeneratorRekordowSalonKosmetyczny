package org.example;

public class Klienci_Salonu {
    private int Id_Klienta_Salontu;
    private int ID_Salonu;
    private int ID_Klienta;


    public Klienci_Salonu(int id, int salonId, int klientId) {
        this.Id_Klienta_Salontu = id;
        this.ID_Salonu = salonId;
        this.ID_Klienta = klientId;
    }
}
