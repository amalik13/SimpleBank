package BankBalanceLookup;

import java.util.HashMap;
import java.util.Map;

public class CustomerSimpleMap implements CustomerLookupService{
	
private Map<String, Customer> customers;

public CustomerSimpleMap() {
	customers = new HashMap<String, Customer>();
	
	
	
	addCustomer( new Customer("id001","Harry","Hacker",-3456.78));
	addCustomer( new Customer("id002","Codie","Coder",1234.56));
	addCustomer( new Customer("id003","Polly","Programmer",987654.32));	
	
	
}



@Override
public Customer findCustomer(String id)
{
	
	if(id!=null)
	{
		return (customers.get(id.toLowerCase()));
					
	}
	else
	{
		return null;
	}
}

@Override
public void addCustomer(Customer cust)
{
	
	if(cust!=null)
	{
		customers.put(cust.getId(), cust);
					
	}
	
}
}
