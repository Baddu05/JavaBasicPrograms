package com.basicJavaProgram;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 0;
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		while(count <= n)
		{
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
			count++;
		}
		scn.close();
	}

}
