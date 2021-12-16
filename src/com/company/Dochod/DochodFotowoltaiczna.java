package com.company.Dochod;

import com.company.Elektrownia;

import com.company.Elektrownia;
import com.company.ElektrowniaAtomowa;
import com.company.ElektrowniaFotowoltaiczna;

public class DochodFotowoltaiczna implements ObliczDochodElektrowni {
//    public float ObliczDochod(Elektrownia e){
//        return 0.5f * e.getMocChwilowa();
//    }

    @Override
    public float ObliczDochod(Elektrownia e) {

        return ((ElektrowniaFotowoltaiczna) e).getZuzyciePaneli() * e.getMocChwilowa() * e.getDystrybutor().getCenaSkupu
    }
}
