package EmployeeManagement;

public  class ParttimeEmployee extends Employee{
	private double hourlyRate;
	  private int hoursWorked;
	public ParttimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
	         super.Setemp(name,id);
	         this.hourlyRate = hourlyRate;
	         this.hoursWorked = hoursWorked;
	   }
	   public double calculatesalary() {
	         return hourlyRate * hoursWorked;
	   }
	   public void displaydetails() {
	         System.out.println("Part Time Employee: " + name + " (ID: " + id + ")");
	         System.out.println("Hourly Rate: " + hourlyRate);
	         System.out.println("Hours Worked: " + hoursWorked);
	         System.out.println("Calculated Salary: " + calculatesalary());
	   }
}
