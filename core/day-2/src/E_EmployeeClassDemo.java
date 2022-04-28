class Employee {
	private int id;
	private String name;
	private double salary; // instance varaible
	// default ctr
	Employee() {
		System.out.println("default ctr");
	}

	// local varaible
	Employee(int id, String name, double salary) {
		//id = id;//u are assignming local vairable to another variable
		this.id=id;	//hey assign local variable to instance varaible
		this.name = name;
		this.salary = salary;
	}

	//getter used to get the data
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	// getter and setter
	public void setSalary(double newSalary) {
		if (newSalary <= salary)
			System.out.println("this operation is not allowed");
		else
			salary = newSalary;
	}

	public void showEmployee() {
		System.out.println("-------emp detail-----------");
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
		System.out.println("---------------------");
	}
}

public class E_EmployeeClassDemo {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "ranjan", 671111.00);
		employee.showEmployee();
		
		employee.setSalary(employee.getSalary()+2000);
		System.out.println("----------------------------");
		employee.showEmployee();
	}

}
