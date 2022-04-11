package adapter;

public class Student {
	
	IPen p;
	
	public void getPen(IPen p) {
		this.p = p;
		//System.out.println("Happy to have a pen!");
	}

	public void write() {
		System.out.println("Happy to have a pen!");
	}
}
