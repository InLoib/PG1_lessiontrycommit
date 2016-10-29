
public class Übung1_c_Themeratur {

	public static void main(String[] args) {

		//Aufforderung zur Anwendung der Formel wie unten beschrieben:
		double tempF = celsius2Fahrenheit(26.0);
		System.out.println("fahrenheit: "+ tempF);
		
		//gleich, nur für die andere Formel:
		double tempC = Fahrenheit2celsius(78.80000000000001);
		System.out.println("celsius: "+tempC);
		
	}

	//Formel für Fahrenheit-Berechnung:
	public static double celsius2Fahrenheit(double celsius) {

		double fahrenheit = 9.0/5 * celsius +32;		
		return fahrenheit;
		
	}
	
	//Formel für Celsius-Berechnung:
	public static double Fahrenheit2celsius(double Fahrenheit) {
		
		double celsius = (Fahrenheit -32) / (9.0/5);
		return celsius;
		/* oder ohne Variablen double anlegen:
		return: = (Fahrenheit -32) / (9.0/5);
		*/
	}
	
}
