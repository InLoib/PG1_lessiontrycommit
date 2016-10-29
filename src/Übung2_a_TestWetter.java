
public class Übung2_a_TestWetter {

	public static String buildWeatherText(String weather, String emotion) {
		return "It's "+weather+" "+emotion;
		}
		public static void main(String[] args) {
		//use method call directly
		System.out.println(buildWeatherText("warm", ":)"));
		//assign return value
		String text = buildWeatherText("freezing",":(");
		System.out.println(text);
		}

}
