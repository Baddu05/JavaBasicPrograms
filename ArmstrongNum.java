package com.basicJavaProgram;
import java.util.Scanner;
public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c = 0, a, temp;
		temp = n;
		while(n>0)
		{
			a = n%10;
			n = n/10;
			c = c+(a*a*a);
		}
		if(temp == c)
		{
			System.out.println(temp);
		}
	}

}
