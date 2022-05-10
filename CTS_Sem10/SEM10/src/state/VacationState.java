package state;

public class VacationState implements IState {

	@Override
	public void act(String task) {
		System.out.println("This employee is unavailable, and cannot handle " + task);
		
	}

}
