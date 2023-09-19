package DSA_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort {

	
	public static void mergesort(int[] arr)
	{
		
		int inputlength = arr.length;
		
		if(inputlength < 2)
		{
			return;
		}
		
		int mid = (inputlength / 2);
		
		int leftarr[] = new int[mid];
		
		int rightarr[] = new int[inputlength - mid];
		
		
		for(int i = 0; i < mid; i++)
		{
			leftarr[i] = arr[i];
		}
		
		
		for(int i = mid; i < inputlength; i++)
		{
			rightarr[i - mid] = arr[i];
		}
		
		
		mergesort(leftarr);
		
		mergesort(rightarr);
		
		merge(arr, leftarr, rightarr);
	}
	
	
	public static void merge(int[] arr, int[] leftarr, int[] rightarr)
	{
		int leftlength = leftarr.length;
		
		int rightlength = rightarr.length;
		
		int i=0, j=0, k=0;
		
		while(i < leftlength && j < rightlength)
		{
			if(leftarr[i] <= rightarr[j])
			{
				arr[k] = leftarr[i];
				
				i++;
			}
			
			else
			{
				arr[k] = rightarr[j];
				
				j++;
			}
			
			k++;
		}
		
		
		while(i < leftlength)
		{
			arr[k] = leftarr[i];
			
			i++;
			
			
			k++;
		}
		
		
		while(j < rightlength)
		{
			arr[k] = rightarr[j];
			
			j++;
			
			k++;
		}
	}
	
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements :: ");
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}	
		
		mergesort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}
}
