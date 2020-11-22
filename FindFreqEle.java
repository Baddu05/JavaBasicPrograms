package com.JavaArrayProgram;
import java.util.Arrays;
import java.util.Scanner;
public class FindFreqEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store in an array");
		int num = scn.nextInt();
		
		int [] arr = new int[num];
		int [] fr = new int[num];
		int freq = -1;
		
		for(int i = 0; i < num; i++)
		{
			arr[i] = scn.nextInt();
		}
		
		for(int i = 0; i < num; i++)
		{
			int count = 1;
			for (int j = i+1; j <num; j++)
			{
				if(arr[i]== arr[j])
				{
					count++;
					fr[j] = freq;
				}	
			}
			if(fr[i]!= freq)
			{
				fr[i] = count;
			}
		}
		
		
		for(int i = 0; i < fr.length;i++)
		{
			if(fr[i] != freq)
			{
				System.out.println(" " +arr[i]+ " | " +fr[i]);
			}
		}
		System.out.println();
	}

}
