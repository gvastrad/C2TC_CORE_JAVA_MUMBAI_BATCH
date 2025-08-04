package com.tnsif.scannerdemo;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String name=sc.next();
		System.out.println("Welcome "+name);
	}

}
