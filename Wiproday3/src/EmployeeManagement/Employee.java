package EmployeeManagement;

public abstract class Employee {
	protected String name;
	protected int id;
	public void Setemp(String name, int id) {
		this.name= name;
		this.id=id;
	}
	public abstract double calculatesalary();
	public abstract void displaydetails();
}
