package com.JavaArrayProgram;
import java.util.Arrays;
import java.util.Scanner;
public class CpyElefrmOneArrtoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		
//		int [] arr1 = new int[n];
//		
//		for(int i = 0; i <n; i++)
//		{
//			arr1[i] =scn.nextInt();
//		//	System.out.println("Array elements are: "+arr1[i]);
//		}
//		
//		
//		int [] arr2 = new int[arr1.length];
//		
//		for(int i = 0; i < arr1.length; i++)
//		{
//			//System.out.print(i+" ");
//			arr2[i] = arr1[i];
//			System.out.print(arr2[i]+" ");
//		}
		
		
		String arr3 = scn.next();
		char [] arr = arr3.toCharArray();
		//System.out.println(arr);
		int[] res = new int[arr.length];
		int i=0;
		for (char c : arr )
		{
			res[i++] = Integer.parseInt(String.valueOf(c));
		}
		System.out.println(Arrays.toString(res));
	}

}
