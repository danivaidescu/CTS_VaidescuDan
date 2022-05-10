package state;

public class ProgMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setCurrentState(EState.WORKING);
		emp.perform("UX Bug");
		
		emp.setCurrentState(EState.VACATION);
		emp.perform("SERVER DOWN");

	}

}
