package LinkedLists;

import java.util.Scanner;

class LNode
{
	int data;
	LNode next;
	
	
	LNode(int e)                    // parameterized constructor
	{
		data = e;
		
		next = null;
	}
}


class LinkedListExample
{
	Node root;
	
	
	void createLinkedList()
	{
		root = null;
	}
	
	
	
	void insertLeft(int e)
	{
		Node n = new Node(e);
		
		if(root == null)
		{
			root = n;                  // only for 1st
		}
		
		else
		{
			n.next = root;             // 1
			
			root = n;                  // 2
		}
	}
	
	
	void deleteLeft()
	{
		if(root == null)
		{
			System.out.println("Empty list");
		}
		
		else
		{
			Node t = root;
			
			root = root.next;
			
			System.out.println(t.data + " deleted");
		}
	}
	
	
	void insertRight(int e)
	{
		Node n = new Node(e);
		
		if(root == null)
		{
			root = n;                  // only for 1st
		}
		
		else
		{
			Node t = root;             // 1
			
			while(t.next != null)      // 2
				
				t = t.next;
			
			t.next = n;             // 3
		}
	}
	
	
	void deleteRight()
	{
		if(root == null)
		{
			System.out.println("Empty list");
		}
		
		else
		{
			Node t = root;
			
			Node t2 = root;
			
			while(t.next != null)
			{
				t2 = t;
				
				t = t.next;
			}
			
			if(t == root)
			{
				root = null;
			}
			
			else
			{
				t2.next = null;
			}
			
			System.out.println(t.data + " deleted");
		}
	}
	
	
	void displayLinkedList()
	{
		if(root == null)
		{
			System.out.println("Empty LinkedList");
		}
		
		else
		{
			Node t = root;
			
			while(t != null)
			{
				System.out.print(t.data);
				
				t = t.next;
			}
		}
	}
	
	
	void searchLinkedList(int key)
	{  
		if(root == null)
		{
			System.out.println("Empty list");
		}	
	    else
	    {   Node t = root;                //1
	    
	        while(t!=null && t.data!=key)        //2
	        {
	        	t=t.next;
	        }
	        
	        if(t==null)
	        {
	            System.out.println("Element Not found");
	        }
	        
	        else
	        {
	            System.out.println("Element Found");
	        }    
	    }
	}
	
	
	void insertAtElement(int e, int index)
	{
		if(root == null)
		{
			System.out.println("Empty list");
		}
		
		else
		{
			Node n = new Node(e);
			
			if(index == 0)           // before root
			{
				n.next = root;
				
				root = n;
			}
			
			else
			{
				Node t = root;
				
				while(t != null && index > 1)
				{
					index--;
					
					t = t.next;
				}
				
				if(t == null)
				{
					System.out.println("Index out of range");
				}
				
				else
				{
					n.next = t.next;
					
					t.next = n;
				}
			}
		}
	}
	
	
	
	void deleteAtElement(int key)
	{  
		if(root == null)
		{
			System.out.println("Empty list");
		}	
	    else
	    {   Node t = root;                //1
	    
	    	
	    
	        while(t != null && t.data != key)        //2
	        {
	        	t=t.next;
	        }
	        
	        if(t==null)
	        {
	            System.out.println("Element Not found");
	        }
	        
	        else
	        {
	            System.out.println("Element Found");
	        }    
	    }
	}
}


public class Linear_LinkedList_Example {

	public static void main(String[] args) {

		int ch, e = 0;
		
		LinkedListExample obj = new LinkedListExample();
		
		Scanner sc = new Scanner(System.in);
		
		obj.createLinkedList();   // root null
		
		
		do
		{
			System.out.println("\n 1. Insert Left");
			System.out.println("\n 2. Insert Right");
			System.out.println("\n 3. Delete Left");
			System.out.println("\n 4. Delete Right");
			System.out.println("\n 5. Display All Data");
			System.out.println("\n 6. Search Element");
			System.out.println("\n 7. Insert Element At Specific Position");
			System.out.println("\n 8. Delete Element At Specific Position");
			System.out.println("\n 9. Exit");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter Element :: ");
					
					e = sc.nextInt();
					
					obj.insertLeft(e);
				}
				break;
				
				
				case 2:
				{
					System.out.println("Enter Element :: ");
					
					e = sc.nextInt();
					
					obj.insertRight(e);
				}
				break;
				
				
				case 3:
				{
					obj.deleteLeft();
				}
				break;
				
				
				case 4:
				{
					obj.deleteRight();
				}
				break;
				
				
				case 5:
				{
					obj.displayLinkedList();
				}
				break;
				
				
				case 6:
				{
					 System.out.println("Enter element :: ");
					 
	                 e=sc.nextInt();
	                    
	                 obj.searchLinkedList(e);
				}
				break;
				
				
				case 7:
				{
					
				}
				break;
				
				
				case 8:
				{
					
				}
				break;
				
				
				
				case 9:
				{
					System.out.println("Exiting");
				}
				break;
				
				
				default:
				{
					System.out.println("Wrong choice");
				}
				break;
			}
		}while(ch != 7);
		
		sc.close();
	}
}
