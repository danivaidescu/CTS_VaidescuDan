package template;

public class EnsuranceProcedure extends AEnsuranceProcedure {

	@Override
	protected void identifyDamage() {	
		System.out.println("I am identifying the issues!");		
	}

	@Override
	protected void evaluateDamage() {
		System.out.println("For the issues identified, I'm evaluating!");	
	}

	@Override
	protected void sendEnsurance() {
		System.out.println("Sending the reuslts!");	
	}

}
