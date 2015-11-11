package BankBalanceLookup;
import java.util.*;

public interface CustomerLookupService {

	public Customer findCustomer(String id);

	public void addCustomer(Customer cust);
	
	}
	

