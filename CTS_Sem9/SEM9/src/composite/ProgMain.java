package composite;

public class ProgMain {

	public static void main(String[] args) throws Exception {
		
		Structure menu = new Structure("MENU");
		
		Structure menuDrinks = new Structure("Drinks");
		Structure menuFood = new Structure("Food");
		
		menu.addNode(menuDrinks);
		menu.addNode(menuFood);
		
		Structure alccolicMenu = new Structure("Alcoholic Drinks");
		Structure nonAlccolicMenu = new Structure("Non-Alcoholic Drinks");
		
		menuDrinks.addNode(nonAlccolicMenu);
		menuDrinks.addNode(alccolicMenu);
		
		Node pizzaCarbonara = new Node("Pizza Carbonara", 25);
		menuFood.addNode(pizzaCarbonara);
		
		menuFood.addNode(new Node("Paste Carbonara", 27));
		
		System.out.println(menu.getInfo());

	}

}
