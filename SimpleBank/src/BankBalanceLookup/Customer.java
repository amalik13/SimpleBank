package BankBalanceLookup;

public class Customer implements java.io.Serializable{
	
	private String Name = null;
	private String id = null;
	private String role = null;
	private double Balance = 0;
	
	
	Customer(String id, String Name, String role, double Balance)
	{
		this.id=id;
		this.Name=Name;
		this.role=role;
		this.Balance=Balance;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(long balance) {
		Balance = balance;
	}

}
