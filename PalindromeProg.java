package com.basicJavaProgram;
import java.util.Scanner;
public class PalindromeProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int count = scn.nextInt();
		Boolean isPalindrome = true;
		for(int i = 1; i <= count; i++)
		{	
			isPalindrome = checkPalindrome(i);
			if(isPalindrome)
			{
				System.out.println(i);
			}
		}
		scn.close();
	}
	public static boolean checkPalindrome(int numpalin)
	{
		int rem = 0;
		int sum = 0;
		int n1 = numpalin;
		while(n1 > 0)
		{
			rem = n1%10;
			sum = (sum*10)+rem;
			n1 = n1/10;
		}
		if(numpalin == sum)
		{
			return true;
		}
		return false;
	}
	
}