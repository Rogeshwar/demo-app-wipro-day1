package com.lambda.project;

import java.util.*;
import java.util.stream.Stream;

public class streamapi {
	public static void main(String[]args) {
		
		List<Integer> num =Arrays.asList(2,7,1,4,8,9);
		
	num.stream()
		.sorted()
			.filter(n-> n%2==0)
				.map(n-> n*2)
					.forEach(n -> System.out.println(n));
			
	}
}
