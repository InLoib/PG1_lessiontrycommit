package �bung4;

public class a_Personenliste {

	public static void main(String[] args) {

		a_Person MaxM�ller = new a_Person();
		MaxM�ller.adresse = new a_Adresse();
		
		MaxM�ller.vorname = "Max";
		MaxM�ller.nachname = "M�ller";
		MaxM�ller.alter = 27;
		MaxM�ller.gewicht = 81.5;
		MaxM�ller.gr��eInM = 1.95;
		
		MaxM�ller.adresse.plz = 0123;
		MaxM�ller.adresse.ort = "Ortwoauchimmer";
		MaxM�ller.adresse.stra�e = "Stra�ewhatever";
		MaxM�ller.adresse.hausnr = 100;

		
		a_Person InLoib = new a_Person();
		InLoib.adresse = new a_Adresse();
		
		InLoib.vorname = "In";
		InLoib.nachname = "Loib";
		InLoib.alter = 26;
		InLoib.gewicht = 49.9;
		InLoib.gr��eInM = 1.69;
		InLoib.adresse.plz = 8020;
		InLoib.adresse.ort = "Graz";
		InLoib.adresse.stra�e = "Br�ckenkopfg.";
		InLoib.adresse.hausnr = 7;

		a_Person FlorianLoibner = new a_Person();
		FlorianLoibner.adresse = new a_Adresse();
		
		FlorianLoibner.vorname = "Florian";
		FlorianLoibner.nachname = "Loibner";
		FlorianLoibner.alter = 18;
		FlorianLoibner.gewicht = 87.4;
		FlorianLoibner.gr��eInM = 1.83;
		FlorianLoibner.adresse.plz = 8544;
		FlorianLoibner.adresse.ort = "P�lfing-Brunn";
		FlorianLoibner.adresse.stra�e = "Oberhart";
		FlorianLoibner.adresse.hausnr = 10;
	
		
		System.out.println(MaxM�ller.vorname+" "+MaxM�ller.nachname+", "+MaxM�ller.alter+" Jahre, Gewicht: "+MaxM�ller.gewicht+" kg, Gr��e: "+MaxM�ller.gr��eInM+"m");
		System.out.println(MaxM�ller.vorname+" "+MaxM�ller.nachname+", wohnt in"+MaxM�ller.adresse.plz+" "+MaxM�ller.adresse.ort+", "+MaxM�ller.adresse.stra�e+" "+MaxM�ller.adresse.hausnr);
		System.out.println( );
		System.out.println(InLoib.vorname+" "+InLoib.nachname+", "+InLoib.alter+" Jahre, Gewicht: "+InLoib.gewicht+" kg, Gr��e: "+InLoib.gr��eInM+"m");
		System.out.println(InLoib.vorname+" "+InLoib.nachname+", wohnt in"+InLoib.adresse.plz+" "+InLoib.adresse.ort+", "+InLoib.adresse.stra�e+" "+InLoib.adresse.hausnr);
		System.out.println( );		
		System.out.println(FlorianLoibner.vorname+" "+FlorianLoibner.nachname+", "+FlorianLoibner.alter+" Jahre, Gewicht: "+FlorianLoibner.gewicht+" kg, Gr��e: "+FlorianLoibner.gr��eInM+"m");
		System.out.println(FlorianLoibner.vorname+" "+FlorianLoibner.nachname+", wohnt in"+FlorianLoibner.adresse.plz+" "+FlorianLoibner.adresse.ort+", "+FlorianLoibner.adresse.stra�e+" "+FlorianLoibner.adresse.hausnr);
		System.out.println( );
	}

}
