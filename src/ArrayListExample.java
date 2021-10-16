import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Grapes");
		System.out.println(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String str: al) {
			System.out.println(str);
		}
		
		System.out.println(al.get(1));
		al.set(1, "Dates");
		for(String fruit: al) {
			System.out.println(fruit
					);
		}
		
		Collections.sort(al);
		for(String fruit: al) {
			System.out.print(fruit
					);
		}
	}

}
