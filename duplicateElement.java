package com.JavaArrayProgram;
import java.util.Scanner;
public class duplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int [] arr = new int[num];
		for(int i = 0; i< num; i++)
		{
			arr[i] = scn.nextInt();
		}
		
		
		for(int i = 0; i< arr.length; i++)
		{
			for(int k = i+1; k< arr.length; k++)
			{
				if(arr[i]== arr[k])
				{
					System.out.println(arr[k]);
				}
			}
			
		}
		
	}

}
