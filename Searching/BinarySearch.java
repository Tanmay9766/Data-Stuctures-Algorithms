package DSA_Practice;

import java.util.Scanner;

class BinarySearch
{
	void binarysearch(int arr[],int start, int end, int key)
	{
		if(start <= end)
		{
			int mid = (start + end) / 2;
			
			if(arr[mid] == key)
			{
				System.out.println(key + " found at :: " + (mid + 1));
			}
			
			
			if(key < arr[mid])     // left only
			{
				binarysearch(arr,start, mid - 1, key);
			}
			
			
			if(key > arr[mid])
			{
				binarysearch(arr,mid + 1, end, key);
			}
		}
		
		else
		{
			System.out.println("Element not found");
		}
	}
}


public class Binary_Search {
	

	public static void main(String[] args) {

		BinarySearch bs = new BinarySearch();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array :: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Element");
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the key");
		int key=sc.nextInt();
		
		bs.binarysearch(arr,0, arr.length-1, key);
		
		sc.close();
	}
}
