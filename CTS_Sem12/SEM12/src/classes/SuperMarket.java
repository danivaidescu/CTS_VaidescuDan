package classes;

import java.util.ArrayList;

import exceptions.ExceptionMarket;

public class SuperMarket {
	
	private String name;
	//private Market[] listMarkets;
	private ArrayList<Market> listMarkets;
	
	public SuperMarket(String name, ArrayList<Market> listMarkets) {
		super();
		this.name = name;
		this.listMarkets = listMarkets;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Market> getListMarkets() {
		return listMarkets;
	}
	public void setListMarkets(ArrayList<Market> listMarkets) {
		this.listMarkets = listMarkets;
	}
	
	public String getBiggestMarketByArea(ETypeMarket type) throws ExceptionMarket {
		
		if(type == null || this.listMarkets.size() == 0 || this.listMarkets == null) {
			throw new ExceptionMarket();
		} else {
			
			float areaMax = -1;
			String nameMaxMarket = "";
			
			for(int i = 0; i < this.listMarkets.size(); i++) {
				
				if(areaMax < this.listMarkets.get(i).getArea() && 
						this.listMarkets.get(i).getType() == type) {
					areaMax = this.listMarkets.get(i).getArea();
					nameMaxMarket = this.listMarkets.get(i).getName();
				}
			}
			return nameMaxMarket;
		}	
	}
	
	
	

}
