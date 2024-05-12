package org.example.klasy;

import org.example.constants.MaxIndex;

public class Kraj {
    public static final int MaxIndex = 10;
    private int Id_Kraj;
    private String Nazwa;

    public Kraj(int id, String nazwa) {
        this.Id_Kraj = id;
        this.Nazwa = nazwa;
    }

    @Override
    public String toString() {
        return String.valueOf(Id_Kraj);
    }

    public String getId_Kraj() {
        return toString();
    }

    public String getNazwa() {
        return Nazwa;
    }
}