package factory.method;

public class ProgMain {

	public static void main(String[] args) {
		
		FactoryCheapWeapon factory = new FactoryCheapWeapon();
		IWeapon weapon = factory.create(); 

	}

}
