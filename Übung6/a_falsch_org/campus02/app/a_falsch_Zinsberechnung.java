package a_falsch_org.campus02.app;

public class a_falsch_Zinsberechnung {
	int kapital;

	public a_falsch_Zinsberechnung(int kapital) {
		super();
		this.kapital = kapital;
	}

	public double rechnung (int tage, double zinssatz){
		double zinsen = kapital * tage * zinssatz / 36000;
		return zinsen;
	}
	
}
