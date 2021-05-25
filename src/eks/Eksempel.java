package eks;

import java.util.List;
import java.util.function.Predicate;


public class Eksempel {

	public static void main(String[] args) {
		String hallo = "hallo";
		String hei = "hei";
		
		Predicate<String> halloPredikat = s -> s.equals("hallo");
		
		System.out.println(halloPredikat.test(hei));
		System.out.println(halloPredikat.test(hallo));
		
	}
	
}

class Petter implements Matte1Student{
	Anders venn;
	
	@Override
	public int gjørØving(int øving) {
		return venn.gjørØving(øving);
	}
}

class Anders implements Matte1Student{

	@Override
	public int gjørØving(int øving) {
		return øving * øving * øving;
	}
	
}


interface Matte1Student {
	public int gjørØving(int øving);
}


interface WeatherObserver {
	public void receiveUpdate(WeatherForecast forecast);
}

class WeatherForecast {
	List<WeatherObserver> observers;
	int temperature;
	boolean isRain;
	
	int getTemp() {
		return temperature;
	}
	
	boolean getIsRain() {
		return isRain;
	}
	
	void notifyObservers() {
		observers.forEach(o -> o.receiveUpdate(this));
	}
	
	void setTemp(int newTemp) {
		temperature = newTemp;
		notifyObservers();
	}
	
}

class Skiier implements WeatherObserver {

	boolean goodWeather;
	
	@Override
	public void receiveUpdate(WeatherForecast forecast) {
		// TODO Auto-generated method stub
		if (forecast.getTemp() < 0) {
			goodWeather = true;
		} else {
			goodWeather = false;
		}
	}
	
	
}