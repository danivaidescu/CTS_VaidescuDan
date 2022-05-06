package composite;

public class Node extends ANode {
	
	private String name;
	private float price;

	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public float getPrice() {
		
		return this.price;
	}

	public Node(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	

}
