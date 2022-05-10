package state;

public class Employee {
	
	IState currentState;

	public IState getCurrentState() {
		return currentState;
	}

//	public void setCurrentState(IState currentState) {
//		this.currentState = currentState;
//	}

//	public Employee(IState currentState) {
//		super();
//		this.currentState = currentState;
//	}
//	
	public void setCurrentState(EState state) {
		switch(state) {
		case WORKING:
			this.currentState = new WorkingState();
			break;
		
		case AWAY:
			this.currentState = new AwayState();
			break;
			
		case VACATION:
			this.currentState = new VacationState();
			break;
		
		default:
			throw new UnsupportedOperationException();
		}
	}
	
	public void perform(String  task) {
		this.currentState.act(task);
		
	}
	
	
	
	

}
