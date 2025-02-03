package EmployeeManagement;


public class EmployeeManagementSystem {
	public static void main(String[]args) {
		Employee employees[] = new Employee[2];
		employees[0]=new FulltimeEmployee("Alice", 1001, 5000);
		employees[1]=new ParttimeEmployee("Alice", 1001, 30,70);
		for (Employee emp : employees)
		emp.displaydetails();
		
	}
}
