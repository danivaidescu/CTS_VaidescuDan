package composite;

import java.util.ArrayList;

public class Structure extends ANode{
	
	private ArrayList<ANode> list = new ArrayList<ANode>();
	String nameStructure;

	@Override
	public String getName() {
		return this.nameStructure;
	}
	
	// missing get price

	@Override
	public float getPrice()  {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		//return super.getInfo();
		
		String info = "" + this.nameStructure;
		
		for(ANode node: list) {
			info +=  "\n" + node.getInfo() + "\n";
			
		}
		
		return info;
	}

	@Override
	public void addNode(ANode elem) throws Exception {
		// TODO Auto-generated method stub
		//super.addNode(elem);
		list.add(elem);
	}

	@Override
	public void removeNode(ANode elem) throws Exception {
		// TODO Auto-generated method stub
		//super.removeNode(elem);
		list.remove(elem);
	}

	@Override
	public ANode getNode(int index) throws Exception {
		// TODO Auto-generated method stub
		//return super.getNode(index);
		return list.get(index);
	}

	public Structure(String nameStructure) {
		super();
		this.nameStructure = nameStructure;
	}
	
	
	
	
	
	

}
