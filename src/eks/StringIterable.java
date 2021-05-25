package eks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringIterable implements Iterable<String> {

	int id;
	String name;
	List<String> strings = new ArrayList<String>();
	
	@Override
	public Iterator<String> iterator() {
		return strings.iterator();
	}
	
	
	public static void main(String[] args) {
		StringIterable it = new StringIterable();
		
		for (String string : it) {
			
		}
	}
	

}
