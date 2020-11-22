package com.basicJavaProgram;
import java.util.Scanner;
public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch1 = scn.next().charAt(0);
		int asciivalue = ch1;
		System.out.println("Ascii value of "+ch1+" is "+asciivalue);
	}

}
