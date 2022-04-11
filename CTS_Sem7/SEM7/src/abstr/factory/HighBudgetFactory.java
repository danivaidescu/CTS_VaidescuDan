package abstr.factory;

public class HighBudgetFactory implements IFactory {

	@Override
	public ICostume createCostume() {
		return new MagicCostume();
	}

	@Override
	public IWeapon createWeapon() {
		return new MagicWeapon();
	}
	
	

}
