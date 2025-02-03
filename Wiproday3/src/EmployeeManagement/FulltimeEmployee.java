package EmployeeManagement;

public  class FulltimeEmployee extends Employee {
	 private double monthlySalary;
	    public FulltimeEmployee(String name, int id, double monthlySalary) {
	        super.Setemp(name, id);
	        this.monthlySalary = monthlySalary;
	    }

	    public double calculatesalary() {
	        return monthlySalary;
	    }

	    public void displaydetails() {
	        System.out.println("Full-Time Employee: " + name + " (ID: " + id + ")");
	        System.out.println("Monthly Salary: $" + calculatesalary());
	    }

		

}
