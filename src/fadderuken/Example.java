package fadderuken;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Example {
	
	
	
	//Andre ting
	List<String> liste = new ArrayList<String>();
	
	Collection<String> kolleksjon = new ArrayList<String>();
	
	Set<String> set = new HashSet<String>();
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	
	public static void main(String[] args) {
		//Primitive typer
		int heltall = 1;
		
		double flyttall = 1.1;
		
		boolean sant = true;
		
		char bokstav = 'A';
		
		//Egentlig ikke en primitiv type
		String streng = "setning";
		
		
		//Wrapper klasser
		Double flyttall2 = 2.2;
		Double flyttall3 = 2.2;
		
		Integer heltall2 = 2;
		Integer heltall3 = 2;
		
		Boolean usant = false;
		
		Character bokstav2 = 'B';
		
		
		System.out.println(flyttall2 == flyttall3); // => false		
		System.out.println(heltall2 == heltall3); // => false
		
		System.out.println(flyttall2.equals(flyttall3)); // => true
		
		System.out.println(streng == "setning"); // => false
		System.out.println(streng.equals("setning")); // => true
		
		System.out.println(Integer.MAX_VALUE); // => veldig stort tall
		
	}
}
