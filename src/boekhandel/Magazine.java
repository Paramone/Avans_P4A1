package boekhandel;

import java.util.ArrayList;

public class Magazine extends Readable {
	private int weekOfPublish;
	private ArrayList<Magazine> magazines = new ArrayList<Magazine>();
	
	public Magazine(String title, double price, int weekOfPublish) {
		super(title, price);
		this.weekOfPublish = weekOfPublish;
		
			magazines.add(m);
	}

}
