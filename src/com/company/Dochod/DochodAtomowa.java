package com.company.Dochod;

import com.company.Elektrownia;
import com.company.ElektrowniaAtomowa;

public class DochodAtomowa implements ObliczDochodElektrowni {
//    public float ObliczDochod(Elektrownia e){
//        return 0.55f * e.getMocChwilowa();
//
    int cenaZaWode;

    @Override
    public float ObliczDochod(Elektrownia e) {

        return ((ElektrowniaAtomowa) e).getLiczbaReaktorow() * e.getMocChwilowa() * e.getDystrybutor().getCenaSkupu()
                - ((ElektrowniaAtomowa) e).getZuzycieWody()*cenaZaWode;
    }
}
