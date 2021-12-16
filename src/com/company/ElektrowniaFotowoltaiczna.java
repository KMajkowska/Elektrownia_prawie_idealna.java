package com.company;


import com.company.AtakTerro.Sposob1ReakcjaNaAtakTerrorystyczny;
import com.company.Awarie.Sposob1ReakcjaNaAwarieZasilania;
import com.company.Dochod.DochodFotowoltaiczna;
import com.company.Wytwarzanie.ZamianaEnegiiPromieniowaniaSlonecznego;
import com.company.uslugodawcy.DystrybutorPradu;

import java.io.Serializable;

public class ElektrowniaFotowoltaiczna extends Elektrownia {


	private String ZuzyciePaneli;
	

	public ElektrowniaFotowoltaiczna(String Miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, Wlasciciel wlasciciel,
			boolean czyPracuje, float ZuzyciePaneli, DystrybutorPradu Dystrybutor)
	{
		super(Miasto, MocChwilowa, MocMaksymalna, LiczbaPracownikow, czyPracuje, wlasciciel, Dystrybutor);
		
		this.ZuzyciePaneli = ZuzyciePaneli;

		reakcjaNaAwarieZasilania = new Sposob1ReakcjaNaAwarieZasilania();
		reakcjeNaAtakTerrorystyczny = new Sposob1ReakcjaNaAtakTerrorystyczny();
		wytwarzanieEnergiiElektrycznej = new ZamianaEnegiiPromieniowaniaSlonecznego();
		obliczDochodElektrowni = new DochodFotowoltaiczna();
	}

	
	//Metody typu get i metody typu set
	public String getZuzyciePaneli() 
	{
		return ZuzyciePaneli;
	}

	public void setZuzyciePaneli(String zuzyciePaneli) 
	{
		ZuzyciePaneli = zuzyciePaneli;
	}

	//Metody klasy
	public void WymienPanele()
	{
		
		this.setZuzyciePaneli("0%");
	}

	@Override
	public String toString() {
		return "ElektrowniaFotowoltaiczna: " + super.toString() +
				"\nZuzyciePaneli: " + ZuzyciePaneli + '\'';
	}

	@Override
	public float ObliczDochod(Elektrownia e) {
		return obliczDochodElektrowni.ObliczDochod(this);
	}
}
