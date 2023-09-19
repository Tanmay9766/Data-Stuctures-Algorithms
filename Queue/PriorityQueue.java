package Day1_Stack_and_Queue;

import java.util.Scanner;

class PriorityQueueExample
{
	private
	
	int Maxsize,rear,front,queue[];
	
	
	void createQueue(int size)
	{
	    Maxsize=size;
	    
	    rear=-1;
	    
	    front=0;
	    
	    queue=new int[Maxsize];
	}
	
	
	
	void Enqueue(int e)
	{
	    rear++;
	    
	    queue[rear]=e;
	    
	    //sort it using bubble sort
	    for(int i=front;i<rear;i++)
	    {
	        for(int j=front;j<rear;j++)
	        {
	            if(queue[j]>queue[j+1])
	            {
	                int t=queue[j];
	                
	                queue[j]=queue[j+1];
	                
	                queue[j+1]=t;
	            }
	        }
	    }
	}
	
	
	
	 boolean isFull()
	 {
	     if(rear==Maxsize-1)
	     {
	    	 return true;
	     }
	     
	     else
	     {
	         return false;
	     }   
	 }
	 
	 
	 
	 int Dequeue()
	 {
	     int temp;
	     
	     temp=queue[front];
	     
	     front++;
	     
	     return(temp);
	 }
	 
	 
	 
	 boolean isEmpty()
	 {
	     if(front>rear)
	     {
	    	 return true;
	     }
	     
	     else
	     {
	    	 return false;
	     }
	 }
	 
	 
	 
	 void printQueue()
	 {
	     for(int i=front;i<=rear;i++ )
	    	 
	         System.out.print(queue[i] + " ");
	 }
}


public class Priority_Queue_Example {

	public static void main(String[] args) {

		int ch, e, size;
        
		PriorityQueueExample obj = new PriorityQueueExample();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size :: ");
        size = sc.nextInt();
        
        
        obj.createQueue(size);
        
        
        do
        {
           System.out.println("\n 1. Enqueue");
           System.out.println("\n 2. Dequeue");
           System.out.println("\n 3. Display");
           System.out.println("\n 4. Exit");
           
           ch = sc.nextInt();
           
           
           switch(ch)
           {
               case 1:
               {
            	   if(obj.isFull() != true)//not full
                   {
                       System.out.println("Enter element :: ");
                       e = sc.nextInt();
                       
                       obj.Enqueue(e);
                   }
            	   
                   else
                   {
                       System.out.println("Queue Full");
                   }
               }
               break;
               
               
                case 2:
                {
                	if(obj.isEmpty() != true)//not Empty
                    {
                        e = obj.Dequeue();
                        
                        System.out.println("Element dequeued :: " + e);
                    }
                	
                    else
                    {
                        System.out.println("Queue Empty");
                    }
                }
                break;
                
                
                case 3:
                {
                	if(obj.isEmpty()!=true)//not Empty
                    {
                       System.out.println("Elements on queue");
                       
                       obj.printQueue();
                    }
                	
                    else
                    {
                        System.out.println("Queue Empty");
                    }
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
         }while(ch != 4);
        
        sc.close();
	}
}
