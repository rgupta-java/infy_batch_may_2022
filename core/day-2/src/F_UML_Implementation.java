//-----logic class
class Customer{
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	
	public Customer() {
		//super();
	}

	public Customer(String customerId, String customerName, 
			long contactNumber, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public void displayCustomerName() {
		System.out.println(customerName);
	}
	
	public void displayCustomerDetails() {
		System.out.println("--------customer details----------");
		System.out.println("customerId: "+ customerId);
		System.out.println("customerName: "+ customerName);
		System.out.println("contactNumber:"+ contactNumber);
		System.out.println("address: "+ address);
		
	}
	
}

//-----tester class
public class F_UML_Implementation {
	
	public static void main(String[] args) {
		Customer customer=new Customer("11", "ravi", 66654454554L, "delhi");
		customer.displayCustomerDetails();
	}

}
