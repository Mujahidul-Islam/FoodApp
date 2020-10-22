
public class Customer {
	private String csName;
	private String csEmail;
	private String csAddress;
	
	public Customer(String cN, String cE, String cA ) {
		csName = cN;
		csEmail= cE;
		csAddress= cA;
	}
	
	public String getName() {
		return csName;
	}
	
	public String getEmail() {
		return csEmail;
	}
	
	public String getAddress() {
		return csAddress;
	}
	
	public void changeName(String newName) {
		csName = newName;
	}
	
	public String toString() {
		return "-Customer: "+csName+"\nEmail: "+csEmail+"\nAddress: "+csAddress+"\n";
		
	}
	
	public boolean equals(Customer otherCustomer) {
		return csEmail.equals(otherCustomer.getEmail());
	}

}
