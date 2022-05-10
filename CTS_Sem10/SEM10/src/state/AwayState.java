package state;

public class AwayState implements IState {

	@Override
	public void act(String task) {
		System.out.println("This employee will prioritize " + task);
		
	}

}
