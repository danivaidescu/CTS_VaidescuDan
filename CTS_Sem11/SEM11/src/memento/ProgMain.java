package memento;

public class ProgMain {

	public static void main(String[] args) {
		
		ManagerVersions caretaker = new ManagerVersions();
		
		Contract originalContract = new Contract("DanieluL");
		
		originalContract.addClause("\nIncrease Salary 14%"); // v1
		caretaker.addVersion(originalContract.saveVersion());
		System.out.println(originalContract);
		
		originalContract.addClause("Note period changed"); // v2
		caretaker.addVersion(originalContract.saveVersion());
		System.out.println(originalContract);
		
		originalContract.addClause("Manager"); // v3
		caretaker.addVersion(originalContract.saveVersion());
		System.out.println(originalContract);
		
		
		
		ContractVersion desiredVersion = caretaker.recoveryVersionContract(1);
		originalContract.restoreFromVersion(desiredVersion);
		System.out.println(originalContract);
		

	}

}
