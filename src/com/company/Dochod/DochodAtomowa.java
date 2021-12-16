package com.company.Dochod;

import com.company.Elektrownia;

public class DochodAtomowa implements ObliczDochodElektrowni {
    public float ObliczDochod(Elektrownia e){
        return 0.55f * e.getMocChwilowa();
    }
}
