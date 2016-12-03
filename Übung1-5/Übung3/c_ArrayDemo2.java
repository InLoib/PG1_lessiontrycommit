package Übung3;

public class c_ArrayDemo2 {

	public static void main(String[] args) {

		String [] Monate = {"Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "Sepemter", "Oktober", "November", "Dezember"};

		
		int AnzahlMonate = Monate.length;
		
for (int i=0; i < AnzahlMonate; i++)
{
	System.out.println(Monate[i] +" [" +(i+1) +"]");
}
// im out.println muss man i+1 rechnen, um von Startwert 0 auf 1 zu kommen, danach kann die Rechnung der for-Schleife normal greifen.
		
	}

}
