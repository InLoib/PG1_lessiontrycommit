package org.campus02.zinsen.app;

public class a_Zinsberechnung {
	int kapital;

	public a_Zinsberechnung(int kapital) {
		super();
		this.kapital = kapital;
	}

	public double rechnung (int tage, double zinssatz){
		double zinsen = kapital * tage * zinssatz / 36000;
		return zinsen;
	}
	
}
