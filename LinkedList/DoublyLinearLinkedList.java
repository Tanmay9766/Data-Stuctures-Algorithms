package LinkedLists;

import java.util.Scanner;

class DoublyLinearLinkedListExample
{
	class Dnode
	{
		int data;
		
		Dnode right, left;
		
		
		Dnode (int e)                      // Parameterized Constructor
		{
			data = e;
			
			right = left = null;
		}
	}
	
	
	
	Dnode root, last;
	
	void createList()
	{
		root = last = null;
	}
	
	
	void insertAtLeft(int e)
	{
		Dnode n = new Dnode(e);
		
		if(root == null)
		{
			root = n;
		}
		
		else
		{
			n.right = root;
			
	        root.left = n;
	        
	        root = n;
	        
	        System.out.println(" inserted");
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
			Dnode t = root;
			
			root = root.right;
			
			root.left = null;
			
			System.out.println(t.data + " deleted");
		}
	}
	
	
	void insertAtRight(int e)
	{
		Dnode n = new Dnode(e);
		
		if(root == null)
		{
			root = n; 
		}
		
		else
		{
			Dnode t = root;
			
			while(t.right != null)
			{
				t = t.right;
			}
				
				t.right = n;
				
				n.left = t;
				
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
			Dnode t = root;
			
			while(t.right != null)
			{
				t = t.right;
			}
			
			if(t == root)
			{
				root = null;
			}
			
			else
			{
				Dnode t2 = t.left;
				
				t2.right = null;
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
			Dnode t = root;
			
			while(t != null)
			{
				System.out.print(t.data + " ");
				
				t = t.right;
			}
		}
	}
	
	
	void printRevList()
	{
		if(root == null)
		{
			System.out.println("Empty List");
		}
		
		else
		{
			Dnode t = root;
			
			while(t.right != null)
			{
				t = t.right;
			}
			
			while(t != null)
			{
				System.out.print(t.data + " ");
				
				t = t.left;
			}
		}
	}
}


public class Doubly_Linear_LinkedList_Example {

	public static void main(String[] args) {
		
		int ch,e;
		DoublyLinearLinkedListExample obj=new DoublyLinearLinkedListExample();
		
        Scanner sc = new Scanner(System.in);
        
        obj.createList();//root null
        
        
        do
        {
           System.out.println("\n 1.Insert Left\n "
           		+ "2.Insert Right\n 3.Delete Left\n "
           		+ "4.Delete Right\n 5.Print all\n "
           		+ "6.Print Reverse\n 7.Exit\n :: ");
           
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
                	obj.printRevList();
                }
                break;
                
                
                case 7:
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
           
           }while(ch != 7);
        
        sc.close();
        }

	}
