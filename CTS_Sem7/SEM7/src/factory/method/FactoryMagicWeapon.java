package factory.method;

public class FactoryMagicWeapon implements IFactory {
	
	public IWeapon create() {
		return new MagicWeapon();
	}

}
