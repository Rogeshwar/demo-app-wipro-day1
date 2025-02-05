package com.lambda.project;

interface A{
	void apply(int n);
}
interface B{
	void display();
}

public class lambda {
	public static void main(String[]args) {
		A obj=(n)->System.out.println(n);
		obj.apply(5);
		
		B obj1=()->System.out.println("Display");
		obj1.display();
		}

}
