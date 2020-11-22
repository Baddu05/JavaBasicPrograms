package com.JavaArrayProgram;
import java.util.Scanner;
public class CounteleArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int [] arr = new int[num];
		
		for(int i=0; i < num; i++)
		{
			arr[i] = scn.nextInt();
		}
		System.out.println(arr.length);
	}

}
