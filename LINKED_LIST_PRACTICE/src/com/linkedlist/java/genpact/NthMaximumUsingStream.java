package com.linkedlist.java.genpact;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NthMaximumUsingStream {
	public static void main(String[] args) {
		int n=2;
		
		List<Employee> emp = Arrays.asList( new Employee(2000000,"Nitesh Shaw",25), new Employee(1500000,"Ravi Kumar",26), new Employee(1000000,"Sunil S",27));
		Optional<Employee> nthMax = emp.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed())
				.distinct().skip(n - 1).findFirst();

		System.out.println(nthMax);
		
	}

}
