package Übung4;

public class a_Personenliste {

	public static void main(String[] args) {

		a_Person MaxMüller = new a_Person();
		MaxMüller.adresse = new a_Adresse();
		
		MaxMüller.vorname = "Max";
		MaxMüller.nachname = "Müller";
		MaxMüller.alter = 27;
		MaxMüller.gewicht = 81.5;
		MaxMüller.größeInM = 1.95;
		
		MaxMüller.adresse.plz = 0123;
		MaxMüller.adresse.ort = "Ortwoauchimmer";
		MaxMüller.adresse.straße = "Straßewhatever";
		MaxMüller.adresse.hausnr = 100;

		
		a_Person InLoib = new a_Person();
		InLoib.adresse = new a_Adresse();
		
		InLoib.vorname = "In";
		InLoib.nachname = "Loib";
		InLoib.alter = 26;
		InLoib.gewicht = 49.9;
		InLoib.größeInM = 1.69;
		InLoib.adresse.plz = 8020;
		InLoib.adresse.ort = "Graz";
		InLoib.adresse.straße = "Brückenkopfg.";
		InLoib.adresse.hausnr = 7;

		a_Person FlorianLoibner = new a_Person();
		FlorianLoibner.adresse = new a_Adresse();
		
		FlorianLoibner.vorname = "Florian";
		FlorianLoibner.nachname = "Loibner";
		FlorianLoibner.alter = 18;
		FlorianLoibner.gewicht = 87.4;
		FlorianLoibner.größeInM = 1.83;
		FlorianLoibner.adresse.plz = 8544;
		FlorianLoibner.adresse.ort = "Pölfing-Brunn";
		FlorianLoibner.adresse.straße = "Oberhart";
		FlorianLoibner.adresse.hausnr = 10;
	
		
		System.out.println(MaxMüller.vorname+" "+MaxMüller.nachname+", "+MaxMüller.alter+" Jahre, Gewicht: "+MaxMüller.gewicht+" kg, Größe: "+MaxMüller.größeInM+"m");
		System.out.println(MaxMüller.vorname+" "+MaxMüller.nachname+", wohnt in"+MaxMüller.adresse.plz+" "+MaxMüller.adresse.ort+", "+MaxMüller.adresse.straße+" "+MaxMüller.adresse.hausnr);
		System.out.println( );
		System.out.println(InLoib.vorname+" "+InLoib.nachname+", "+InLoib.alter+" Jahre, Gewicht: "+InLoib.gewicht+" kg, Größe: "+InLoib.größeInM+"m");
		System.out.println(InLoib.vorname+" "+InLoib.nachname+", wohnt in"+InLoib.adresse.plz+" "+InLoib.adresse.ort+", "+InLoib.adresse.straße+" "+InLoib.adresse.hausnr);
		System.out.println( );		
		System.out.println(FlorianLoibner.vorname+" "+FlorianLoibner.nachname+", "+FlorianLoibner.alter+" Jahre, Gewicht: "+FlorianLoibner.gewicht+" kg, Größe: "+FlorianLoibner.größeInM+"m");
		System.out.println(FlorianLoibner.vorname+" "+FlorianLoibner.nachname+", wohnt in"+FlorianLoibner.adresse.plz+" "+FlorianLoibner.adresse.ort+", "+FlorianLoibner.adresse.straße+" "+FlorianLoibner.adresse.hausnr);
		System.out.println( );
	}

}
