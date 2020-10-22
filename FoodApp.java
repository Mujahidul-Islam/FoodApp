
public class FoodApp {
	public static final int MAX_CUSTOMER = 100;
	private String foodAppName;
	private double feesPercentage;
	private Customer[] arrayOfCust;
	private int numCustomer;
	
	public FoodApp(String foodAppName, double feesPercentage) {
		this.foodAppName = foodAppName;
		this.feesPercentage = feesPercentage;
		numCustomer = 0;
		arrayOfCust = new Customer[MAX_CUSTOMER]; // initialized to max number of customers
		//arrayOfCusto[numCustomer] = new Customer();
		//numCustomer++;
	}
	
	public int getCustomerIndex(Customer targetCustomer)
	{
		int v = -1;
		Customer curCustomer;
		
		for (int i=0; i<numCustomer; i++) {
			curCustomer = arrayOfCust[i];
			
			if(targetCustomer.equals(curCustomer)) {
				v =  i;
			}
		}
		return v;
	}
	
	public boolean addCustomer(Customer targetCustomer) {
	    boolean isPresent = false;
	   
	    if (getCustomerIndex (targetCustomer)== -1) {
	         arrayOfCust[numCustomer]= targetCustomer;
	    	numCustomer++;
	    	isPresent = true;
	    }
		
		return isPresent;
		// check if targetCusto exists by using getCustoIndex(targetCustomer)
				// if -1
				// numCusto ++, arrayofCusto[numCusto] = targetCustomer
				// check if targetCusto now exists in arrayofCusto by using getCustoIndex
				// if still -1 return false, else return true
	}
	
	
	public boolean removeCustomer(Customer targetCustomer) {
		boolean isPresent = false;
		int storeIndex = getCustomerIndex(targetCustomer);
		
		if(storeIndex!= -1) {
			//deleting the given index
			arrayOfCust [storeIndex]= null;
			for (int i = storeIndex; i < numCustomer-1; i++) {
				arrayOfCust [i] = arrayOfCust [i+1];	
			}
			arrayOfCust [numCustomer-1] = null;
			numCustomer--;
			isPresent= true;
		}
		return isPresent;
	}
	
	public String toString() {
		String output = "-- FoodApp "+ foodAppName+"/n"+numCustomer+" customer(s) registered:/n";
		 for (int i = 0; i < numCustomer; i++) {
			 output = output + arrayOfCust[i];
		 }
		 return output;
		
	}
   
}
