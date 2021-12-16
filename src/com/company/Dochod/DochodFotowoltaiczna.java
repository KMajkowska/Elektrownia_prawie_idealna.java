package com.company.Dochod;

import com.company.Elektrownia;

import com.company.Elektrownia;

public class DochodFotowoltaiczna implements ObliczDochodElektrowni {
    public float ObliczDochod(Elektrownia e){
        return 0.5f * e.getMocChwilowa();
    }
}
