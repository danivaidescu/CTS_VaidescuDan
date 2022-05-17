package memento;

import java.util.ArrayList;

public class ManagerVersions {
	
	// CARETAKER

	private ArrayList<ContractVersion> contractVersions = new ArrayList<ContractVersion>();

	public ManagerVersions(ArrayList<ContractVersion> contractVersions) {
		super();
		this.contractVersions = contractVersions;
	}
	
	public ManagerVersions() {
		super();
		
	}
	
	public void addVersion(ContractVersion newContractVersion) {
		
		this.contractVersions.add(newContractVersion);		
	}
	
	public ContractVersion recoveryVersionContract(int noVersion) {
		
		return this.contractVersions.get(noVersion);
		
	}
	
}
