package observer;

public class SubscriberA implements ISubscriber {

	@Override
	public void act() {
		System.out.println("Close the window!");
		
	}

}
