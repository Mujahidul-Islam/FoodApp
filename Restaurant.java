public class Restaurant {
	private String rName;
	private FoodItem[] menu;
	private double profit;
	
	
	 public Restaurant(String rName, FoodItem[] menu) {
		 this.rName = rName;
		 this.menu = menu;
		 profit = 0;
	 }
	 
	 public String toString() {
		 String output = "-- Restaurant "+rName+"\n"+"Profit = "+profit+"\n"+"Menu: \n";
		 for (int i = 0; i < menu.length; i++) {
			 output = output + menu[i];
		 }
		 return output;
	 }
}
