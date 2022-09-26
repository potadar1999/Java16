package com.Quefour;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		
//		List <String> list=new ArrayList<>();
//		list.add(new Student(10,"san",507,"datta"));
		
		Student s[]=new Student[5];
		System.out.println("Enter the Student Details");
		Scanner sc=new Scanner (System.in);
		
		for(int i=0;i<s.length;i++) {
			System.out.println("roll");
			int roll=sc.nextInt();
			System.out.println("name");
			String name=sc.next();
			System.out.println("marks");
			int marks=sc.nextInt();
			System.out.println("address");
			String address=sc.next();
			
			System.out.println("state");
			String state=sc.next();
			System.out.println("city");
			String city=sc.next();
			System.out.println("pincode");
			int pincode=sc.nextInt();
			
			s[i]=new Student();
			
		}
		
		
	}

}
