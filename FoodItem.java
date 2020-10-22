
public class FoodItem {
	private String foodName;
	private double cost;
	private double sellingPrice;
	private int stockExist;
	
	
	public FoodItem(String foodName, double cost,double sellingPrice, int stockExist ) {
		this.foodName = foodName;
		this.cost = cost;
		this.sellingPrice = sellingPrice;
		this.stockExist = stockExist;
		
	}
	
	  boolean isAvailable() {
		return ( stockExist > 0);
	}
	
	public String toString() {
		if( isAvailable()) {
			return "- "+foodName+ "\n"+sellingPrice+"\n";
		}
		else
		{
			return "- "+foodName+ "\n"+sellingPrice+""+"(SOLD OUT)\n";
		}
	}
	
	
	public double setSellingPrice(double newPrice) {
		return sellingPrice= newPrice;
		
	}
	
   public int decrementStock() {
	   return stockExist--;
	   
   }
   
   public int increaseStock(int amount) {
	   return stockExist++;
	   
   }

}
