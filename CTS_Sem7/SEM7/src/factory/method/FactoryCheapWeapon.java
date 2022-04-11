package factory.method;

public class FactoryCheapWeapon implements IFactory {
	
	public IWeapon create() {
		return new CheapWeapon();
	}

}
