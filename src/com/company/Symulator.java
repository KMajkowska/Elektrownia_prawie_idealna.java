package com.company;

import com.company.AtakTerro.ReakcjeNaAtakTerrorystyczny;
import com.company.AtakTerro.Sposob1ReakcjaNaAtakTerrorystyczny;
import com.company.AtakTerro.Sposob2ReakcjaNaAtakTerrorystyczny;
import com.company.Awarie.ReakcjaNaAwarieZasilania;
import com.company.Awarie.Sposob1ReakcjaNaAwarieZasilania;
import com.company.Awarie.Sposob2ReakcjaNaAwarieZasilania;
import com.company.uslugodawcy.OdbiorcaOdpadow;
import com.company.Gracz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Symulator {
    private static int a = 0;
    private static Scanner scan = new Scanner(System.in);
    List<Elektrownia> listaElektrowni = new ArrayList<>();
    Gracz gracz = null;

     public static ReakcjeNaAtakTerrorystyczny zmienReakcjeAtak() {
        int numer;
        System.out.print("Ustaw reakcję na atak terrorystyczny (ryzyko kradzieży i utraty 1000 jednostek  posiadanego dochodu):" + "\n" +
                "1 - Zamknij elektrownie i ewakuuj pracowników (ryzyko 0%)" + "\n" +
                "2 - Zaplac 500 za ochronę (ryzyko 25%)" + "\n" +
                "3 - Zmniejsz moc o 50% (ryzyko 50%)" + "\n");
        numer = scan.nextInt();
        switch (numer) {
            case 1:
                return new Sposob1ReakcjaNaAtakTerrorystyczny();
            case 2:
                return new Sposob2ReakcjaNaAtakTerrorystyczny();
            case 3:
//                return new Sposob3ReakcjaNaAtakTerrorystyczny();
            default:
                return null;
        }
    }

    public static ReakcjaNaAwarieZasilania zmienRekacjeAwaria() {
        int numer;
        System.out.print("Ustaw reakcję na awarie zasilania (ryzyko zwarcia i utraty 500 jednostek  posiadanego dochodu):" + "\n" +
                "1 - Zmniejsz moc chwilową do 50% (ryzyko 0%)" + "\n" +
                "2 - Zmniejsz moc chwilową do 75% (ryzyko 25%)" + "\n");
        numer = scan.nextInt();
        switch (numer) {
            case 1:
                return new Sposob1ReakcjaNaAwarieZasilania();
            case 2:
                return new Sposob2ReakcjaNaAwarieZasilania();
            default:
                return null;
        }
    }

    //1 dzien wartosc pocatkowa

    //kolejne
    //uruchom interfejs oblicz dochod
    //dodaj do inta dochod w grczu
    //wyswietlenie dochodu na poczatek dnia

    public static void menuWyboru(Gracz gracz) {
        boolean f = true;
        Scanner scan = new Scanner(System.in);
        int numer;
        while (f) {
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
                    f=false;
            }
        }
    }

    public static void AtakTerrorystyczny() {
        Random random = new Random();
        int numer;
        switch (numer = random.nextInt(1,10)) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                System.out.println("");
                break;


        }
    }
    public static void rozneWydarzeniaLosowe () {
        Random random = new Random();
        int numer;
        switch (numer = random.nextInt(1,10)) {
            case 1:
                System.out.println("Elektrownia została zaatakowana przez terrorystów");
                AtakTerrorystyczny();
                break;
            case 2:
                System.out.println("W elektrowni doszło do awarii zasilania");
                break;
            case 3:
                System.out.println("");
                break;
            default:
                break;

        }

        }
        public static Elektrownia WyborElektrowni(Gracz gracz) {
            gracz.show();
            System.out.println("Wybierz numer elektrownii");
            a = scan.nextInt();
            return gracz.getListaElektrowni().get(a);
        }

}

