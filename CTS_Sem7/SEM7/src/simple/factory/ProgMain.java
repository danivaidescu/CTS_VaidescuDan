package simple.factory;

public class ProgMain {

	public static void main(String[] args) throws Exception {
		
		FactoryWeapon factory = new FactoryWeapon();
		
		IWeapon weapon = FactoryWeapon.create(200); // (hide this)-> = new MagicWeapon();
		weapon.power();
		

	}

}
