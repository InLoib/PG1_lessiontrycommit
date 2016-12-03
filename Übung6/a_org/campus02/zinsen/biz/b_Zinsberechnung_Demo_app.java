package org.campus02.zinsen.biz;


import org.campus02.zinsen.app.a_Zinsberechnung;

public class b_Zinsberechnung_Demo_app {


	public static void main(String[] args) {

		a_Zinsberechnung z1 = new a_Zinsberechnung(1000);
		
		System.out.println("Berechnung der Zinsen lautet" +z1.rechnung(100,1));

	}

}
