import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ReverseOrder {

	public static void main(String[] args) {
		Set<String> obj = new HashSet<String>();
		obj.add("Data");
		obj.add("Data1");
		obj.add("Data2");
		obj.add("Data");
		Iterator itr= obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
