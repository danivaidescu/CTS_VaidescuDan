package observer;

import java.util.ArrayList;

public class Observable {
	
	ArrayList<ISubscriber> listObservers = new ArrayList<ISubscriber>();
	
	public void addObserver(ISubscriber newSub) {
		this.listObservers.add(newSub);
		
	}
	
	public void reoveObserver(ISubscriber sub) {
		this.listObservers.remove(sub);
	}
	
	public void notifyAllObservers() {
		
		for(int i = 0; i < listObservers.size(); i++) {
			listObservers.get(i).act();
			
		}
		
	}

}
