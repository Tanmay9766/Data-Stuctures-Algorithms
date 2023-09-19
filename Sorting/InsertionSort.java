package DSA_Practice;

import java.util.Scanner;

public class Insertion_Sort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int i, j, newelement;
		
		
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
		
		 
      for(i = 0; i < arr.length-1; i++)
      {
         newelement = arr[i+1];
         
         j = i+1;
         
          while (j > 0 && arr[j-1] > newelement)
          {
              arr[j] = arr[j-1];
              
              j--;
          }
          
          arr[j] = newelement;
      }
	
      
      System.out.println("After Sort :: ");
		
		for(i = 0; i < arr.length; i++)
		{
			System.out.println("arr [" + i + "] :: " + arr[i]);
		}
		
		sc.close();
	}
}
