package template;

public abstract class AEnsuranceProcedure {
	
	protected abstract void identifyDamage();
	protected abstract void evaluateDamage();
	protected abstract void sendEnsurance();
	
	public void giveEnsurance() {
		identifyDamage();
		evaluateDamage();
		sendEnsurance();
	}

}
