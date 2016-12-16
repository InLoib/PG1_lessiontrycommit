package d_SetDemo;

import java.util.HashSet;

public class SetDemoLV {

	//Angabe laut Lektor, ohne Beispiel, via Kommentaren
	
	public static void main(String[] args) {

	 //set A => 3 Namen (String)
	 HashSet<String> setA = new HashSet<String>();
	 setA.add("Susi");
	 setA.add("Strolch");
	 setA.add("Cap");
	 	  
	 //set B => 5 Namen (String)
	 HashSet<String> setB = new HashSet<String>();
	 setB.add("Cap");
	 setB.add("Capper");
	 setB.add("Fabius");
	 setB.add("Strolch");
	 setB.add("Arielle");
	  
	 //Zumindest 2 Namen sollen sich überlappen => in A und B
	 
	 //gibt nur aus was in A und in B vorkommt.
	 //intersection => retainAll
	 HashSet<String> tmpInt = new HashSet<>(setA);
	 tmpInt.retainAll(setB);
	 System.out.println(tmpInt);
	
	 //gibt alle in B aus ohne die, die auch in A sind
	 //difference => remove all
	 HashSet<String> tmpDiff = new HashSet<>(setB);
	 tmpDiff.removeAll(setA);
	 System.out.println(tmpDiff);

	 //ergänzt alle von B, die noch nicht in A sind.
	 //union => addAll
	 HashSet<String> tmpUnion = new HashSet<>(setA);
	 tmpUnion.addAll(setB);
	 System.out.println(tmpUnion);
	 
	// Wenn in Klasse Person die Methode toString nicht vorhanden ist, wird ein kryptischer Wert ausgegeben
	// Wenn toString in der Klasse Person vorhanden ist, dann ist die Ausgabe korrekt
	Person p1 = new Person("In", "Loib");
	System.out.println(p1);	 
	 
	}

}
