package eu.ase.acs.solid.o.resolved;

public class VendorEmployee extends Employee {

	public VendorEmployee(int iD, String name, float salary) {
		super(iD, name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateBonus() {
		return this.getSalary() * .05f;
	}

}
