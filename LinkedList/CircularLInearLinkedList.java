package LinkedLists;

import java.util.Scanner;

class Node
{
	int data;
	Node next;
	Node root;
	Node last;
	
	
	Node(int e)                    // parameterized constructor
	{
		data = e;
		
		 root = last = null;
	}
}

class CircularLinearLinkedListExample
{
	
	Node root, last;
	
	void createLinkedList()
	{
		root = last = null;
	}
	
	
	void insertAtLeft(int e)
	{
		Node n = new Node(e);
		
		if(root == null)
		{
			root = last = n;
			
			last.next = root;
		}
		
		else
		{
			n.next = root;
			
			root = n;
			
			last.next = root;
			
			System.out.println("inserted");
		}
	}
	
	
	void deleteAtLeft()
	{
		if(root == null)
		{
			System.out.println("Empty List");
		}
		
		else
		{
			Node t = root;
			
			if(root == last)
			{
				root = last = null;
			}
			
			else
			{
				root = root.next;
				
				last.next = root;
			}
			
			System.out.println(t.data + " deleted");
		}
	}
	
	
	void insertAtRight(int e)
	{
		Node n = new Node(e);
		
		if(root == null)
		{
			root = n;
		}
		
		else
		{
			last.next = n;
			
			last = n;
			
			last.next = root;
			
			System.out.println("inserted");
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
			Node t = root;
			
			Node t2 = root;
			
			while(t != last)
			{
				t2 = t;
				
				t = t.next;
			}
			
			
			if(root == last)
			{
				root = last = null;
			}
			
			else
			{
				last = t2;
				
				last.next = root;
			}
			
			System.out.println(t.data + " deleted");
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
			Node t = root;
			
			do
			{
				System.out.println(t.data + " ");
				
				t = t.next;
				
			}while(t != root);
		}
	}
}


public class Circular_Linear_LinkedList_Example {

	public static void main(String[] args) {

	       int ch, e;
	       
	       CircularLinearLinkedListExample obj = new CircularLinearLinkedListExample();
	       
	        Scanner sc = new Scanner(System.in);
	        
	        obj.createLinkedList();//root null
	        
	        do
	        {
	           System.out.println("\n1.Insert Left \n 2.Insert Right \n 3.Delete Left \n 4.Delete Right \n 5.Print all \n 6.Exit\n :: ");
	           ch = sc.nextInt();
	           
	           
	           switch(ch)
	           {
	               case 1:
	               {
	                       System.out.println("Enter element :: ");
	                       
	                       e = sc.nextInt();
	                       
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
	                    System.out.println("Exiting ");
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
