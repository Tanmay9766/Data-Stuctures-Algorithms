package DSA_Practice;

import java.util.Scanner;

class BubbleSort
{
	int[] arr = new int[5];
	
	Scanner sc = new Scanner(System.in);
	
	void createArray()
	{
		System.out.println("Enter the elements of array :: ");
			
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	
	void printArray()
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("arr [" + i + "] :: " + arr[i]);
		}
	}
	
	
	void BubbleSort()
	{
		int i, j, t;
		
		for(i = 0; i < arr.length-1; i++)
		{
			for(j = 0; j < arr.length-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					t = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = t;
				}
			}
		}
	}
}


public class Bubble_Sort {

	public static void main(String[] args) {

		BubbleSort b = new BubbleSort();
		
		b.createArray();
		
		System.out.println("Before Sort :: ");
		
		b.printArray();
		
		b.BubbleSort();
		
		System.out.println("After Sort :: ");
		
		b.printArray();
	}
}
