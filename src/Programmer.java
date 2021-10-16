class Employee{
	float salary = 400000000;
}
public class Programmer extends Employee{

	int bonus = 1000000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
		System.out.println(p.salary);
		System.out.println(p.bonus);
	}

}
class Employee1 extends Employee{
	
}
