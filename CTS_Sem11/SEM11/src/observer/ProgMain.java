package observer;

public class ProgMain {

	public static void main(String[] args) {
		Event event = new Event();
		ISubscriber daniel = new SubscriberA();
		ISubscriber ana = new SubscriberB();
		
		event.addObserver(ana);
		event.addObserver(daniel);
		
		event.publicateEvent();

	}

}
