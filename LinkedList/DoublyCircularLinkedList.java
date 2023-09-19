package LinkedLists;

import java.util.Scanner;

class DoublyCircularLinkedList
{
	class DNode
	{
		private
		
		int data;
		
		DNode left, right;
		
		
		
		public DNode(int e) {
		
			data = e;
			
			left = right = null;
		}
	}

	
	DNode root, last;
	
	void createList()
	{
		root = last = null;
	}
	
	
	
	void insertAtLeft(int e)
	{
		DNode n = new DNode(e);
				
		if(root == null)
		{
			root = last = n;
			
			last.right = root;
			
			root.left = last;
		}
		
		else
		{
			n.right = root;
			
			root.left = n;
			
			root = n;
			
			last.right = root;
			
			root.left = last;
			
			System.out.println(" inserted");
		}
	}
	
	
	void deleteAtLeft()
	{
		if(root == null)
		{
			System.out.println("Empty List");
		}
		
		else if(root == last)
		{
			root = last = null;
		}
		
		else
		{
			DNode t = root;
			
			root = root.right;
			
			last.right = root;
			
			root.left = last;
			
			t.right = root;
		}
	}
	
	
	void insertAtRight(int e)
	{
		DNode t = new DNode(e);
		
		if(root == null)
		{
			root = t;
			
			last.right = root;
			
			root.left = last;
		}
		
		else
		{
			last.right = t;
			
			t.left = last;
			
			last = t;
			
			last.right = root;
			
			root.left = last;
			
			System.out.println(" inserted");
		}
	}
	
	
	void deleteAtRight()
	{
		if(root == null)
		{
			System.out.println("Empty List");
		}
		
		else
		{
			DNode t = last.left;
			
			last = t;
			
			last.right = root;
			
			root.left = last;
		}
	}
	
	
	void printList()
	{
		if(root == null)
		{
			System.out.println("Empty List");
		}
		
		else
		{
			DNode t = root;
			
			do
			{
				System.out.println(t.data + " ");
				
				t = t.right;
				
			}while(t.left!=last);
		}
	}
}



public class Doubly_Circular_LinkedList_Example {

	public static void main(String[] args) {

		int ch, e;
		
		DoublyCircularLinkedList obj = new DoublyCircularLinkedList();
		
		Scanner sc = new Scanner(System.in);
		
		obj.createList();
		
		
		  do
	        {
	           System.out.println("\n 1.Insert Left\n "
	           		+ "2.Insert Right\n 3.Delete Left\n "
	           		+ "4.Delete Right\n 5.Print all\n "
	           		+ "6.Exit\n :: ");
	           
	           ch = sc.nextInt();
	           
	           switch(ch)
	           {
	               case 1:
	               {
	            	   System.out.println("Enter element :: ");
	            	   
	                   e=sc.nextInt();
	                   
	                   obj.insertAtLeft(e);
	               }   
	               break;   
	                    
	               
	                case 2:
	                {
	                       System.out.println("Enter element :: ");
	                       
	                       e = sc.nextInt();
	                       
	                       obj.insertAtRight(e);
	                }
	                break;
	                
	                
	                case 3:
	                {
	                      obj.deleteAtLeft();
	                }
	                break;
	                
	                
	                case 4:
	                {
	                      obj.deleteAtRight();
	                }
	                break;
	                
	                
	                case 5:
	                {
	                    obj.printList();
	                }
	                break;
	                
	         
	                case 6:
	                {
	                	System.out.println("Exiting");
	                }
	                break;
	                
	                
	                default:
	                {
	                	System.out.println("Wrong option");
	                }
	                break;        
	           }
	           
	           }while(ch != 6);
	        
	        sc.close();
	}
}
