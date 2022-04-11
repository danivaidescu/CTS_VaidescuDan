package adapter;

public class PenAdapter implements IPen  {
	
	PilotPen p = new PilotPen();

	@Override
	public void delete() {
		
		p.delete();
		
	}
	
	

}
