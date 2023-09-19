package DSA_Practice;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		int i, j, min, pos;
		
		
		System.out.println("Enter the elements of array :: ");
		
		for(i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Before Sort :: ");
		
		for(i = 0; i < arr.length; i++)
		{
			System.out.println("arr [" + i + "] :: " + arr[i]);
		}
		
		 
		
		for(i=0; i < arr.length; i++)
		{
			min = arr[i]; 
         
			pos = i;
         
         
			for(j = i+1; j < arr.length; j++)
			{
				if(arr[j] < min)
				{   
					min = arr[j];
        		  
					pos = j;
				}
			}
          
          arr[pos] = arr[i];
          
          arr[i] = min;
      }
		
		
		System.out.println("After Sort :: ");
		
		for(i = 0; i < arr.length; i++)
		{
			System.out.println("arr [" + i + "] :: " + arr[i]);
		}
	}
}
