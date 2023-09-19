package LinkedLists;

import java.util.Scanner;

public class DynamicQueueExapmle 
{
	class Node
	{
		private
		
		int data;
		
		Node next;
		
		Node front, rear;
		
		public Node(int e) {
			
			data = e;
			
			front = rear = null;
		}
	}
	
	
	Node front,rear;   
  
	
	void createQueue()
	{
		front = rear = null;
	}
  
	
	
	void Enqueue(int e)
	{
		Node n = new Node(e);
		
		if(rear == null)
          front = rear = n;                 //only for 1st
      
		else
		{
	         rear.next = n;  //1
	         
	         rear = n;  //2
	         
	         System.out.println(" Enqueued");
	     }
	}
	
	
	
	void dequeue()
	  {
	      if(front == null)
	          System.out.println("Empty Queue");
	      
	      else
	      {
	          Node t = front;
	          
	          front = front.next;
	          
	          System.out.println(t.data + " dequeued");
	      }
	  }
  
  
  void printList()
  {  
	  if(front == null)
          System.out.println("Empty queue");
      
	  else
      {   Node t = front;       //1
      
          while(t != null)       //2
          {
              System.out.print(" " + t.data + " ");
              
              t=t.next;
          }
      }
  }
  
  public static void main(String args[])
  {
	  int ch,e;
	  
	  DynamicQueueExapmle obj = new DynamicQueueExapmle();
	  
	  Scanner sc = new Scanner(System.in);
	  obj.createQueue();
	  
	  do
	  {
		  System.out.println("\n 1.Enqueue \n 2.dequeue \n 3.print \n 4.Exit");
		  ch =sc.nextInt();
		  
		  switch(ch)
		  {
			  case 1:
			  {
				  System.out.println("Enter element :: ");
				  e = sc.nextInt();
				  
				  obj.Enqueue(e);
			  }
			  break;
		  
			  
			  case 2:
			  {
				  obj.dequeue();
			  }  
			  break;
				
			  
			  case 3:
			  {
				  obj.printList();
			  }
			  break;
				
			  
			  case 4:
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
	  }while(ch!=4);
	  
	  sc.close();
  }
}
