package eu.ase.acs.solid.o.resolved;

public class ProgMainO {

	public static void main(String[] args) {
		
		
		Employee empJohn = new FteEmployee(1, "John", 2000);
		
		System.out.println(empJohn.toString() + " BONUS: " + empJohn.calculateBonus());
		
		Employee empMichael = new VendorEmployee(2, "Michael", 20000);
		
		System.out.println(empMichael.toString() + " BONUS: " + empMichael.calculateBonus());
		
		//Employee empMada = new ContractEmployee(3, "Mada", 20000);
	}

}
