package com.brainmentors.reportcard;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {


Scanner scanner  = new Scanner(System.in);

int marks [] = new int[3];
	for(int i = 0 ; i<marks.length; i++) {
	System.out.println("Enter "+(i+1)+" Mark");
		marks[i] = scanner.nextInt();
	}
	
	Student shyam = new Student (23,"bHuMiKa gUpTa","345678",marks);

System.out.println("Enter the New Phone Number");
shyam.setPhone(scanner.next());
		System.out.println(shyam.getPhone());
		
	


System.out.println(shyam.printReport());
scanner.close();


	}
}
