package Assignmet_08_02_21;


class Address
{
	private String addressLine;
	private	String city;
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	void getAddressDetails()
	{
		System.out.print(addressLine);
		System.out.println(city);

		
	}
	
}

class Customer
{
	private String customerName;
	private Address residentialAddress;
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	void getCustomerDetails()
	{
		System.out.println(customerName);
		System.out.print(residentialAddress.getAddressLine());
		System.out.println(residentialAddress.getCity());
		
		
	}
	
}


public class Aggregation_Encapsulation {
	

	public static void main(String[] args) {
		
		Address as = new Address("1st main HSR Layout,","Banglore");
		
		Customer cs = new Customer("john",as);
		cs.getCustomerDetails();
		//as.getAddressDetails();
		
		
		//System.out.println(cu.getResidentialAddress());

		

	}

}
