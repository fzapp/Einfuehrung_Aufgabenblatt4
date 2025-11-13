package h3;

public class H3_main {

	public static void main(String[] args) {
		float celsiusFloat = 14.2F, fahrenheitFloat = 23.23F;
		double celsiusDouble = 14.2D, fahrenheitDouble = 120.1D;
		
		
		fahrenheitFloat = (celsiusFloat *(9F/5F)) + 32F;
		System.out.println( celsiusFloat +" in Celsius ist "+fahrenheitFloat+" in Fahrenheit (über float)" );
		
		fahrenheitDouble = (celsiusDouble *(9.0D/5.0D)) +32D;
		System.out.println( celsiusDouble +" in Celsius ist "+fahrenheitDouble+" in Fahrenheit (über double)" );
		// TODO Auto-generated method stub

	}

}
