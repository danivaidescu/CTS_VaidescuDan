package flyweight;

public class ProgMain {

	public static void main(String[] args) {
		
		Receipt[] listReceipt = new Receipt[50];
		
		ReceiptData[] listReceiptData = new ReceiptData[50];
		
		for(int i = 0; i < 50; i++) {
			listReceipt[i] = FlyweightFactory.getReceipt(ReceiptEnum.valueOf("FORMAT" + (i%3 + 1)));
			
			listReceiptData[i] = new ReceiptData(100 + i);
		}
		
		for(int i = 0; i < 50; i++) {
			listReceipt[i].printReceipt(listReceiptData[i]);
			
		}
		
		System.out.println(FlyweightFactory.getNumberReceipt());

	}

}
