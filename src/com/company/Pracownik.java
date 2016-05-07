package com.company;

/**
 * Created by User on 2016-04-09.
 */
public class Pracownik {
    private String imie;
    private String nazwisko;
    private Double placa;
    private char plec;
    private int dzial;

    public Pracownik(String imie, String nazwisko, Double placa, char plec, int dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.placa = placa;
        this.plec = plec;
        this.dzial = dzial;
    }

    @Override
    public String toString() {
        return "pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", placa=" + placa +
                ", plec=" + plec +
                ", dzial=" + dzial +
                '}';
    }

    public boolean czyPracujeWDziale(Pracownik pracownik, int dzial) {

        if (pracownik.dzial == dzial) return true;
        else return false;

    }
}