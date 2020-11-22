package com.JavaArrayProgram;
import java.util.Scanner;
public class PrintElementofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int []arr = new int[num];
		for (int i = 0; i <num; i++)
		{
			arr[i] = scn.nextInt();
		}
		
		//Displaying elements of the array
		for(int i = 0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
