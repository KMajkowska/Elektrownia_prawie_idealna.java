package com.company;

import com.company.AtakTerro.Sposob1ReakcjaNaAtakTerrorystyczny;
import com.company.AtakTerro.Sposob2ReakcjaNaAtakTerrorystyczny;
import com.company.Awarie.Sposob1ReakcjaNaAwarieZasilania;
import com.company.Awarie.Sposob2ReakcjaNaAwarieZasilania;
import com.company.Wytwarzanie.SpalaniePaliwKopalnych;
import com.company.uslugodawcy.DostawcaGazu;
import com.company.uslugodawcy.DystrybutorPradu;

import java.io.Serializable;

public class ElektrowniaGazowa extends ElektrowniaNaPaliwoStale  {

	private float IloscGazuWMagazynie;
	private com.company.uslugodawcy.DostawcaGazu DostawcaGazu;
	private float MaxPojemnoscMagazynu;

	public ElektrowniaGazowa(String Miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, Wlasciciel wlasciciel, boolean czyPracuje, String RodzajPaliwa, float ZuzyciePaliwa, int LiczbaBlokow, DystrybutorPradu Dystrubutor, float IloscGazuWMagazynie, DostawcaGazu DostawcaGazu, float MaxPojemnoscMagazynu) {
		super(Miasto, MocChwilowa, MocMaksymalna, LiczbaPracownikow, wlasciciel, czyPracuje, RodzajPaliwa, ZuzyciePaliwa, LiczbaBlokow, Dystrubutor);

		this.IloscGazuWMagazynie = IloscGazuWMagazynie;
		this.DostawcaGazu = DostawcaGazu;
		this.MaxPojemnoscMagazynu = MaxPojemnoscMagazynu;

		reakcjaNaAwarieZasilania = new Sposob2ReakcjaNaAwarieZasilania();
		reakcjeNaAtakTerrorystyczny = new Sposob2ReakcjaNaAtakTerrorystyczny();
		wytwarzanieEnergiiElektrycznej = new SpalaniePaliwKopalnych();
	}


	public float getIloscGazuWMagazynie() { return IloscGazuWMagazynie; }

	public void setIloscGazuWMagazynie(float iloscGazuWMagazynie)  { IloscGazuWMagazynie = iloscGazuWMagazynie; }

	public DostawcaGazu getDostawcaGazu() {	return DostawcaGazu; }

	public void setDostawcaGazu(DostawcaGazu dostawcaGazu) { DostawcaGazu = dostawcaGazu; }

	public float getMaxPojemnoscMagazynu() {
		return MaxPojemnoscMagazynu;
	}

	public void setMaxPojemnoscMagazynu(float maxPojemnoscMagazynu) {
		MaxPojemnoscMagazynu = maxPojemnoscMagazynu;
	}

	@Override
	public String toString() {
		return "ElektrowniaGazowa:" + super.toString() +
				"\nIloscGazuWMagazynie: " + IloscGazuWMagazynie +
				"\nDostawcaGazu: " + DostawcaGazu.toString() +
				"\nMaksymalna pojemność magazynu: " + MaxPojemnoscMagazynu;
	}

	@Override
	public float ObliczDochod(Elektrownia e) {
		return 0;
	}
}
