package com.company;

import java.security.SecureRandom;
import java.util.Scanner;
import com.company.uslugodawcy.DostawcaGazu;
import com.company.uslugodawcy.DostawcaWegla;
import com.company.uslugodawcy.DystrybutorPradu;
import com.company.uslugodawcy.OdbiorcaOdpadow;
import com.company.Gracz;
import com.company.Symulator;


import java.io.*;

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
        boolean f = true;
        while(f) {
            for(int i = 0; i < (gracz.getListaElektrowni()).size(); i++){
                (gracz.getListaElektrowni()).get(i).ObliczDochod(gracz.getListaElektrowni().get(i));
            }

            Symulator.menuWyboru(gracz);
        }

        System.out.println(gracz.toString());

    }

}


