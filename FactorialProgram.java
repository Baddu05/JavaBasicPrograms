package com.basicJavaProgram;
import java.util.Scanner;
public class FactorialProgram 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int fact;
		for(int i = 2; i <= num; i++)
		{
			fact = FactCalc(i);
			System.out.println(fact);
		}
		scn.close();
	}
	static int FactCalc(int n)
	{
		if(n == 0 )
		{
			return 1;
		}
		else
		{
			return(n*FactCalc(n-1));
		}
		
	}
	
}
