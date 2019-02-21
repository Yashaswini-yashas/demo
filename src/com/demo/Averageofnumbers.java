package com.demo;

import java.util.Scanner;

public class Averageofnumbers {
	public static void main(String[] args) {
		int a=0,b=0,c=0,average=0;
		 Scanner input = new Scanner(System.in);
		 System.out.print("enter First Value : ");
		 a = input.nextInt();
		 System.out.print("enter Second Value : ");
		 b = input.nextInt();
		 System.out.print("enter Third Value : ");
		 c = input.nextInt();
		 average = (a+b+c)/3;
		 System.out.print("The average is " + average );
		}
}
