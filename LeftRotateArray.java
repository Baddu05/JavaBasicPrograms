package com.JavaArrayProgram;
import java.util.Scanner;
public class LeftRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array: ");
		int num = scn.nextInt();
		int [] arr = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter the number you want to left rotate:");
		int rotateleftnum = scn.nextInt();
		//Rotate the given array by n position
		System.out.println("After left rotation\n");
		for(int x = 0; x < rotateleftnum; x++)
		{
			int j,first = 0;
			first = arr[0];
			for( j = 0; j < arr.length-1; j++)
			{
				arr[j] = arr[j+1];
			}
			arr[j] = first;
		}
		//Displaying the array after rotation
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		scn.close();	
	}

}
