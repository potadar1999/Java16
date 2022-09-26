package com.Quefour;

import java.io.Serializable;

public class Student implements Serializable{
	    int roll;
	    String name;	
		int marks;
		String Address;
		public Student() {
			super();
		}
		public Student(int roll, String name, int marks, String address) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			Address = address;
		}

	
}


class Address implements Serializable{
	

    String state;
	String city;
	int pincode;
	public Address() {
		super();
	}
	public Address(String state, String city, int pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	
}
