package com.company.AtakTerro;

import com.company.AtakTerro.ReakcjeNaAtakTerrorystyczny;
import com.company.Elektrownia;

import java.io.Serializable;

public class Sposob2ReakcjaNaAtakTerrorystyczny implements ReakcjeNaAtakTerrorystyczny, Serializable {

    private static final long serialVersionUID = 1234670990255712290L;

    @Override
    public void ReakcjaNaAtakTerrorystyczny(Elektrownia e) {
        System.out.println("Procedura dla: Reakcja na atak terrorystyczny");
        e.setMocChwilowa(0);
        System.out.println("Ustawiono moc chwilowa na :\n" +e.getMocChwilowa());
        System.out.println("Procedura 1: Zabezpieczenie strategicznych pomieszczeń");
        System.out.println("Procedura 2: Powiadomienie pracownikow o ewakuacji");
        System.out.println("Procedura 3: Zaloz ubrania ochronne");
        System.out.println("Procedura 4: Otworz schron chroniący przed promieniowaniem");
        System.out.println("Procedura 5: Zawiadomienie służb ratunkowych");


    }
}
