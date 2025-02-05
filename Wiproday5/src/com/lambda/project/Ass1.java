package com.lambda.project;
import java.util.*;

interface StringProcessor{
	String work(String str);
	
}

public class Ass1 {
    public static void main(String[] args) {
       List<String> names=Arrays.asList("Arun","Babu","Ravi","Harish","David");
       
       //names.stream().sorted((a,b)->b.compareTo(a)).forEach(n-> System.out.println(n));
       names.sort((a, b) -> b.compareTo(a));
       System.out.println("Sorted in reverse order: " + names);
       
       StringProcessor upcase=str ->str.toUpperCase() ;
       names.forEach(na -> System.out.println(upcase.work(na)));
    }
}