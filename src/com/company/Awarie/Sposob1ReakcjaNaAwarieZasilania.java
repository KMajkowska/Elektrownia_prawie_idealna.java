package com.company.Awarie;

import com.company.Awarie.ReakcjaNaAwarieZasilania;
import com.company.Elektrownia;

import java.io.Serializable;

public class Sposob1ReakcjaNaAwarieZasilania implements ReakcjaNaAwarieZasilania , Serializable {
    private static final long serialVersionUID = 1234670990555762290L;


    @Override
    public void ReakcjeNaAwarieZasilania(Elektrownia e) {

        //jak zmenijszymy np do 25% moc to jest wieksza szansa urzadzenia w elektrwnowni sie nie posypia i ze nie bedzie kolejnego zwarcia itp.
    }
}
