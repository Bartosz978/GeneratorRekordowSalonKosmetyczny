package org.example.klasy;

public class Miasto {
    private int Id_Miasta;
    private String Nazwa_Miasta;
    public static final int MaxIndex = 10;
    public Miasto(int id, String nazwa) {
        this.Id_Miasta = id;
        this.Nazwa_Miasta = nazwa;
    }

    @Override
    public String toString() {
            return String.valueOf(Id_Miasta);
    }

    public String getId_Miasta() {
        return toString();
    }

    public String getNazwa_Miasta() {
        return Nazwa_Miasta;
    }
}
