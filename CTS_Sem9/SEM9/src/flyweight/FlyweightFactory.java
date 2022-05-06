package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	private static Map<ReceiptEnum, Receipt> listReceipt = new HashMap<ReceiptEnum, Receipt>();
	
	public static Receipt getReceipt(ReceiptEnum type) {
		
		Receipt receipt = new Receipt(type);
		
		listReceipt.put(type, receipt);
		
		return receipt;
		

		
	}
	
	public static int getNumberReceipt() {
		return listReceipt.size();
	}

}
