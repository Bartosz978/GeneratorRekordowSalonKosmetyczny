package org.example;

public class Salo_Uslug {
    private int ID_Salonu_Uslugi;
    private int ID_Salonu;
    private int ID_Uslugi;

    public Salo_Uslug(int id, int salonId, int uslugaId) {
        this.ID_Salonu_Uslugi = id;
        this.ID_Salonu = salonId;
        this.ID_Uslugi = uslugaId;
    }
}