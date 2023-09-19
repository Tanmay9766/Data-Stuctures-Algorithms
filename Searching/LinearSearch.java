package DSA_Practice;

import java.util.Scanner;

class LinearSearch
{
	void SearchArray()
	{
		Scanner sc = new Scanner(System.in);
		
		int size, flag = 0, i;
		
		System.out.println("Enter size of array :: ");
		size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements :: ");
		
		for(i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		for(i = 0; i < size; i++)
		{
			System.out.println("Element of array is :: " + arr[i] + " ");
		}
		
		
		System.out.println("Enter element to be searched :: ");
		int key = sc.nextInt();
		
		for(i = 0; i < size; i++)
		{
			if(arr[i] == key)
			{
				flag = 1;
				
				break;
			}
			
			else
			{
				flag = 0;
			}
		}
		
		if(flag == 1)
		{
			System.out.println("Element is found");
		}
		
		else
		{
			System.out.println("Element is not found");
		}
	}
}


public class Linear_Search {

	public static void main(String[] args) {
		
		LinearSearch l = new LinearSearch();
		
		l.SearchArray();
	}
}
