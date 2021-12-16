package com.company.Awarie;

import com.company.Awarie.ReakcjaNaAwarieZasilania;
import com.company.Elektrownia;

import java.io.Serial;
import java.io.Serializable;

public class Sposob2ReakcjaNaAwarieZasilania implements ReakcjaNaAwarieZasilania, Serializable {

    private static final long serialVersionUID = 1234670990255762299L;

    @Override
    public void ReakcjeNaAwarieZasilania(Elektrownia e) {

        e.setMocMaksymalna(80);

        e.setMocChwilowa(50);

        System.out.println("Z powodu awarii elektrownia obnizyla swoja moc maksymalna do 80% oraz moc chwilowa do 50%");

    }

}
