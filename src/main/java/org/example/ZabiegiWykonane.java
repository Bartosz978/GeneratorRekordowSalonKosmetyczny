package org.example;

public class ZabiegiWykonane {
    private int Id_Zabiegu;
    private String Komplikacje;
    private String Data;
    private double Cena;
    private int Pracownik_Salonu_ID;
    private int ID_Zmiany;
    private int ID_Salon_Uslugi;
    private int ID_Klienci_Salonu;

    public ZabiegiWykonane(int id, String komplikacje, String data, double cena, int pracownikSalonuId, int zmianaId, int salonUslugiId, int klientSalonuId) {
        this.Id_Zabiegu = id;
        this.Komplikacje = komplikacje;
        this.Data = data;
        this.Cena = cena;
        this.Pracownik_Salonu_ID = pracownikSalonuId;
        this.ID_Zmiany = zmianaId;
        this.ID_Salon_Uslugi = salonUslugiId;
        this.ID_Klienci_Salonu = klientSalonuId;
    }
}