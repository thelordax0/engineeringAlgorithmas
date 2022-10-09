package temperatureConverter;

public class Converter {
	public Celcius kelvinToCelcius(Kelvin kelvin) {
		return new Celcius(kelvin.getHeat()-273.15);
	}
	public Fahrenheit kelvinToFahrenheit(Kelvin kelvin) {
		return new Fahrenheit((kelvin.getHeat()-273.15)*(9.0/5)+32);
	}
	
	
	public Kelvin celciusToKelvin(Celcius celcius) {
		return new Kelvin(celcius.getHeat()+273.15);
	}
	
	public Fahrenheit celciusToFahrenheit(Celcius celcius) {
		return new Fahrenheit(celcius.getHeat()*(9.0/5)+32);
	}
	
	
	public Celcius fahrenheitToCelcius(Fahrenheit fahrenheit) {
		return new Celcius((fahrenheit.getHeat()-32)*(5.0/9));
	}
	
	public Kelvin fahrenheitToKelvin(Fahrenheit fahrenheit) {
		return new Kelvin((fahrenheit.getHeat()-32)*(5.0/9)+273.15);
		
	}
	
}
