package com.company.Awarie;

import com.company.Awarie.ReakcjaNaAwarieZasilania;
import com.company.Elektrownia;

import java.io.Serial;
import java.io.Serializable;

public class Sposob2ReakcjaNaAwarieZasilania implements ReakcjaNaAwarieZasilania, Serializable {

    private static final long serialVersionUID = 1234670990255762299L;

    @Override
    public void ReakcjeNaAwarieZasilania(Elektrownia e) {

        System.out.println("Procedura dla: awaria w jednym bloku");
        e.setMocChwilowa(e.getMocChwilowa() -100);
        System.out.println("Zmniejszono moc jednego bloku");
    }

}
