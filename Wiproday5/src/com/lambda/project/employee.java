package com.lambda.project;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
class data{
	String name;
	int age;
	double salary;
	public data(String name, int age, double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String getname(){
		return name;
	}
	public int getage(){
		return age;
	}
	public double getsalary(){
		return salary;
	}
	
}
public class employee {
	public static void main(String[]args) {
		List<data> e=Arrays.asList(
				new data("Ravi",32,60000),
				new data("Arun",26,50000),
				new data("David",35,70000),
				new data("Vino",28,55000),
				new data("Kumar",34,75000));
		
		//e.stream().filter(a-> a.getage()>30).map(data::getname).forEach(n-> System.out.println(n));
		
		List<String> Empname=e.stream().filter(a-> a.getage()>30).map(data::getname).collect(Collectors.toList());
		
		double avgsalary=e.stream().filter(a-> a.getage()>30).mapToDouble(data::getsalary).average().orElse(0.0);
		
		System.out.println(Empname);
		System.out.println(avgsalary);
	}
	

}
