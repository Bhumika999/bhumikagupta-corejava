package com.brainmentors.salaryslip;

import java.math.BigDecimal;



public class TestEmployee {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Employee emp = new Employee(1001, "rAm KuMaR ShArMa", new BigDecimal("100000000"));

		System.out.println(emp.printReport());

	}



}