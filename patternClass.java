package com.basicJavaProgram;
import java.util.Scanner;
public class patternClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =  scn.nextInt();
		righttrianglecallStarPattern(n);
		System.out.println();
		lefttrianglecallStarPattern(n);
		System.out.println();
		check(n);
		scn.close();
	}
	public static void righttrianglecallStarPattern(int num) 
	{
		for (int i = 0; i<= num; i++)
		{	
			for (int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void lefttrianglecallStarPattern(int num)
	{
		for(int i = num; i>=0; i--)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void check(int num)
	{
		for(int i = num; i>0; i--)
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
}
