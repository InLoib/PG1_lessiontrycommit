package Übung5;

public class a_Bruch {

	private int zaehler;
	private int nenner;

	//Das ist der Konstruktor:
	public a_Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	//die Get-Methode für:
	public int getZaehler(){
		return zaehler;
	}
	
	//die Get-Methode für:
	public int getNenner(){
		return nenner;
	}
	
	//das Programm, dass Bruch in Dezimal rechnen soll:
	public double toDecimal(){
		return zaehler * 1.0 / nenner;
	}

	public void print(){
		System.out.println(zaehler +" / " + nenner);
	}
	
	public a_Bruch multiplicate (a_Bruch b2)
	{
		int zaheler = this.zaehler * b2.getZaehler();
		int nenner = this.nenner * b2.getNenner();
		
		return new a_Bruch (zaheler, nenner);
	}
	

	
}
