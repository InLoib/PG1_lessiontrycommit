package a_falsch_org.campus02.biz;


import a_org.campus02.zinsen.app.a_Zinsberechnung;

public class b_falsch_Zinsberechnung_Demo_app {


	public static void main(String[] args) {

		a_falsch_Zinsberechnung z1 = new a_falsch_Zinsberechnung(1000);
		
		System.out.println("Berechnung der Zinsen lautet" +z1.rechnung(100,1));

	}

}
