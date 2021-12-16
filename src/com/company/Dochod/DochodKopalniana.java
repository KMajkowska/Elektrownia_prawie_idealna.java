package com.company.Dochod;

import com.company.Elektrownia;

public class DochodKopalniana implements ObliczDochodElektrowni {
    public float ObliczDochod(Elektrownia e){
        return 0.6f * e.getMocChwilowa();
    }
}