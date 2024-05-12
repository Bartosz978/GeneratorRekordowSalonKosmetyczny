package org.example.generate;

import org.example.constants.Wartosci_Losowe;
import org.example.klasy.*;

public class Generuj {
    public static StringBuilder returnKategoria(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<Kategoria.Maxrekord;i++){
            Kategoria kategoria = new Kategoria(1+i, Wartosci_Losowe.kategorieKosmetyczne[i],Wartosci_Losowe.generujOpis());
            stringBuilder.append(kategoria.getID_Kategori()).append(";").append(kategoria.getNazwa_Kategori()).append(";").append(kategoria.getOpis_Kategori()).append("\n");
        }

        return  stringBuilder;
    }
    public static StringBuilder returnKlienta(int iloscRekordow){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<iloscRekordow;i++){
Klienci klienci = new Klienci(i+1,Wartosci_Losowe.imiona[Wartosci_Losowe.LosujzTablciy(Wartosci_Losowe.imiona)],Wartosci_Losowe.nazwiska[Wartosci_Losowe.LosujzTablciy(Wartosci_Losowe.nazwiska)],Wartosci_Losowe.generujTelefon(),Wartosci_Losowe.generujEmail());
        stringBuilder.append(klienci.getID_Klienta()).append(";").append(klienci.getImie()).append(";").append(klienci.getNazwisko()).append(";").append(klienci.getNumer_Telefonu()).append(";").append(klienci.getEmail()).append("\n");
        }
        return  stringBuilder;
    }
    public static StringBuilder returnKraje(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i< Kraj.MaxIndex;i++){
            Kraj kraj = new Kraj(i+1,Wartosci_Losowe.countries[i]);
            stringBuilder.append(kraj.getId_Kraj()).append(";").append(kraj.getNazwa()).append("\n");
        }
        return  stringBuilder;
    }
    public static StringBuilder returnMiasto(){
    StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i< Miasto.MaxIndex;i++){
            for (int j=0;j< Miasto.MaxIndex;j++)
            {
                Miasto miasto = new Miasto(i*Miasto.MaxIndex+j+1,Wartosci_Losowe.cities[i][j]);
                stringBuilder.append(miasto.getId_Miasta()).append(";").append(miasto.getNazwa_Miasta()).append("\n");

            }

        }
    return  stringBuilder;
    }
    public static StringBuilder returnStanowsisko(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i< Stanowisko.Max_Index;i++){
            Stanowisko stanowisko = new Stanowisko(i+1,Wartosci_Losowe.Stanowiska[Wartosci_Losowe.LosujzTablciy(Wartosci_Losowe.Stanowiska)],Wartosci_Losowe.generujOpis());
            stringBuilder.append(stanowisko.getID_Stanowiska()).append(";").append(stanowisko.getNazwa_Stanowiska()).append(";").append(stanowisko.getOpis()).append("\n");
        }
        return  stringBuilder;
    }
    public  static  StringBuilder returnPracownicy(int iloscRekordow){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<iloscRekordow;i++) {

        }
        return  stringBuilder;
    }
}
