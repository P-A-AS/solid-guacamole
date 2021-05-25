package eks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringIterator implements Iterator<String> {
	
	private List<String> strings = new ArrayList<String>();
	private int pos = 0;
	
	

	@Override
	public boolean hasNext() {
		return ! (strings.size() - 1 == pos);
	}

	@Override
	public String next() {
		String temp = strings.get(pos);
		pos++;
		return temp;
	}
	
	

}
