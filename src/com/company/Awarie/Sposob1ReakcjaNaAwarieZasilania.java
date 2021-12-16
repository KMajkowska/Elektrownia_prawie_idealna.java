package com.company.Awarie;
import java.util.Random;
import com.company.Awarie.ReakcjaNaAwarieZasilania;
import com.company.Elektrownia;

import java.io.Serializable;

public class Sposob1ReakcjaNaAwarieZasilania implements ReakcjaNaAwarieZasilania , Serializable {
    private static final long serialVersionUID = 1234670990555762290L;


    @Override
    public void ReakcjeNaAwarieZasilania(Elektrownia e) {

        //jak zmenijszymy np do 25% moc to jest wieksza szansa urzadzenia w elektrwnowni sie nie posypia i ze nie bedzie kolejnego zwarcia itp.

        Random generator = new Random();

        int wybor = generator.nextInt(4)+1;

        switch(wybor)
        {

            case 1:
            case 2:
            case 3:

                e.setMocChwilowa(75);
                System.out.println("Z powodu awarii elektrownia obni¿y³a swoj¹ moc chwilow¹ do 75%");

                break;

            case 4:

                e.setMocChwilowa(0);
                System.out.println("Z powodu awarii elektrownia obni¿y³a swoj¹ moc chwilow¹ do 0%");

                break;
        }
    }

}
