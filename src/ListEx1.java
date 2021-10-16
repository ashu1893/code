import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list=new ArrayList<String>();  
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 //accessing the element    
		 System.out.println("Returning element:"+ list.get(1));
		 list.set(1,"Dates");
		 for(String fruit: list) {
			 System.out.println(fruit);
		 }
	}

}
