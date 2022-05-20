package eu.ase.acs.solid.o;

public class ProgMainO {

	public static void main(String[] args) {
		
		Employee empJohn = new Employee(1, "John", 20000, "FTE");
		
		System.out.println(empJohn.toString() + " BONUS: " + empJohn.calculateBonus());
		
		Employee empMichael = new Employee(1, "John", 20000, "Vendor");
		
		System.out.println(empMichael.toString() + " BONUS: " + empMichael.calculateBonus());
		

	}

}
