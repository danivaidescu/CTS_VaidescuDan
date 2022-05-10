package chain;

public abstract class AHandler {
	
	protected AHandler successor = null;

//	public AHandler(AHandler succesor) {
//		super();
//		this.successor = succesor;
//	}
//	
	public abstract void processOrder(Order o);
	
	public void setSuccesor(AHandler succesor) {
		this.successor = succesor;
	}
	
	

}
