package com.company;

public class Main {

    public static void main(String[] args) {
        Pracownik p1 = new Pracownik("jakub", "modrzejewski", 1500.3, 'm', 4);
        Pracownik p2 = new Pracownik("michal", "modrzejewski", 1500.0, 'm', 5);
        System.out.println(p1);
        System.out.println(p2);
    }

}