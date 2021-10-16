import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Arvi");
		ts.add("Vijay");  
		  ts.add("Ravi");  
		  ts.add("Ajay");
		  
		Iterator<String> itr = ts.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()
					);
		}
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
	}

}
