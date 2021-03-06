package com.company.Dochod;

import com.company.Elektrownia;
import com.company.ElektrowniaAtomowa;

import java.io.Serializable;

public class DochodAtomowa implements ObliczDochodElektrowni, Serializable {

    int cenaZaWode = 100;

    @Override
    public float ObliczDochod(Elektrownia e) {

        return ((ElektrowniaAtomowa) e).getLiczbaReaktorow() * 10 * e.getMocChwilowa() * e.getDystrybutor().getCenaSkupu()
                - ((ElektrowniaAtomowa) e).getZuzycieWody()*cenaZaWode;
    }
}
