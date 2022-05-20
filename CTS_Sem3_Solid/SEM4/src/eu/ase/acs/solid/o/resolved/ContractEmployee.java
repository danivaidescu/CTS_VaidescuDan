package eu.ase.acs.solid.o.resolved;

public class ContractEmployee extends Employee {

	public ContractEmployee(int iD, String name, float salary) {
		super(iD, name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateBonus() {
		
		return 0;
	}

}
