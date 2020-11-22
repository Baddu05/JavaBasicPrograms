package com.JavaArrayProgram;
import java.util.Scanner;
public class reverseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int [] arr = new int[num];
		
		for(int i= 0; i < num; i++)
		{
			arr[i] = scn.nextInt();
		}
		int j = 0;
		int [] temp = new int[num];
		
		for(int i = arr.length-1; i>= 0 ; i--)
		{
			temp[j++] = arr[i];
		}
		for(int i= 0; i < num; i++)
		{
			System.out.println(temp[i]);
		}
	
	}

}
