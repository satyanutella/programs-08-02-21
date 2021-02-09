package New_08_02_21;

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
	private Address officialAddress;
	public Customer(String customerName, Address residentialAddress, Address officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
		
	}
	public Address getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
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
		System.out.println("Customer name : "+customerName);
		System.out.print("Residential address : "+residentialAddress.getAddressLine());
		System.out.println(residentialAddress.getCity());
		System.out.print("Office address : "+officialAddress.getAddressLine());
		System.out.print(officialAddress.getCity());
		

		
	}
	
}


public class Aggregation_Encap2 {

	public static void main(String[] args) {
		
Address as = new Address("1st main HSR Layout,","Banglore");
	
Address aa = new Address("1st Main Electronics city,","Banglore");

		Customer cs = new Customer("john",as,aa);
		cs.getCustomerDetails();
	}

}
