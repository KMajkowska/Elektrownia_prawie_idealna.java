package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

import com.company.AtakTerro.ReakcjeNaAtakTerrorystyczny;
import com.company.Awarie.ReakcjaNaAwarieZasilania;
import com.company.uslugodawcy.DostawcaGazu;
import com.company.uslugodawcy.DostawcaWegla;
import com.company.uslugodawcy.DystrybutorPradu;
import com.company.uslugodawcy.OdbiorcaOdpadow;
import com.company.Gracz;
import com.company.Symulator;


import java.io.*;

import static com.company.Symulator.*;

public class Main {

    public static void main(String[] args) {

        Gracz gracz = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - wczytaj gracza  \n2 - Stwórz nowego gracza");
        int a = scan.nextInt();
        switch (a){
            case 1:
                gracz = Serializacja.odczyt();
                break;
            case 2:
                 gracz = new Gracz();
                 break;
            default:
                System.out.println("Niewłasciwy wybór");
        }
        while(true) {
            for (int i = 0; i < gracz.getListaElektrowni().size(); i++) {
                gracz.getListaElektrowni().get(i).setMocChwilowa(100);
                gracz.getListaElektrowni().get(i).setCzyPracuje(true);
            }
            for (int i = 0; i < (gracz.getListaElektrowni()).size(); i++) {
                (gracz.getListaElektrowni()).get(i).ObliczDochod();
            }
            boolean f = true;
            while (f) {
                int numer;
                while (f) {
                    if (gracz.getListaElektrowni().isEmpty()) {
                        System.out.println("Wybierz opcję:" + "\n" +
                                "1 - Zakup elektrowni" + "\n" +
                                "2 (i inne) - Przejdz do nastepnego dnia + \n");

                        numer = scan.nextInt();
                        switch (numer) {
                            case 1:
                                gracz.zakupElektrowni();
                                break;
                            default:
                                f = false;
                        }
                    } else {
                        System.out.println("Wybierz opcję:" + "\n" +
                                "1 - Zakup elektrowni" + "\n" +
                                "2 - Wybierz reakcję na awarie zasilania" + "\n" +
                                "3 - Wybierz reakcję na atak terrorystyczny" + "\n" +
                                "4 - Sprzedaj elektrownie" + "\n" +
                                "5 (i inne) - Przejdz do nastepnego dnia + \n");
                        numer = scan.nextInt();
                        switch (numer) {
                            case 1:
                                gracz.zakupElektrowni();
                                break;
                            case 2:
                                ReakcjaNaAwarieZasilania reakcjaAwaria = zmienRekacjeAwaria();
                                WyborElektrowni(gracz).ustawReakcjeNaAwarie(reakcjaAwaria);
                                break;
                            case 3:
                                ReakcjeNaAtakTerrorystyczny reakcjaAtak = zmienReakcjeAtak();
                                WyborElektrowni(gracz).ustawReakcjeNaAtak(reakcjaAtak);
                                break;
                            case 4:
                                gracz.SprzedajElektrownie();
                                break;
                            default:
                                f = false;
                        }
                    }
                }
            }
            for (int i = 0; i < gracz.getListaElektrowni().size(); i++) {
                rozneWydarzeniaLosowe(gracz.getListaElektrowni().get(i));
            }
        }

    }

}

