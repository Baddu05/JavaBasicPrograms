//Prime Number Program in Java
package com.basicJavaProgram;

import java.util.Scanner;

import java.util.Scanner;

public class PrimeNumProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String prime_number = "";
		Boolean isPrime = true;
		int i;
		for(i = 2; i<= n; i++)
		{
		  isPrime = checkPrime(i);
		  if(isPrime)
			{
				prime_number = prime_number + i + " ";
			}
		}		
		System.out.println(prime_number);
		scn.close();
	}
	
	public static boolean checkPrime(int num_check)
	{
		//int remainder;
		for (int j = 2; j <= num_check/2; j++)
		{
			if(num_check % j == 0)
			{
				return false;
			}
		}
		return true;
	}
	
}

