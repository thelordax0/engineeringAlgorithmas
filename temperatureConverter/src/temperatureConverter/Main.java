package temperatureConverter;

public class Main {

	public static void main(String[] args) {
		Conventer c=new Conventer();
		Kelvin k=c.fahrenheitToKelvin(new Fahrenheit(100));
		System.out.println(k.getHeat());
	}

}
