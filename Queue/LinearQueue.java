package Day1_Stack_and_Queue;

import java.util.Scanner;

class LinearQueueExample
{
	private
	
	int Maxsize, rear, front, queue[];
	
	
	void createQueue(int size)
	{
		Maxsize = size;
		
		rear = -1;
		
		front = 0;
		
		queue = new int[Maxsize];
	}
	
	
	
	// enqueue : Entry on queue
	
	void Enqueue(int e)
	{
		rear++;
		
		queue[rear] = e;
	}
	
	
	boolean isFull()
	{
		if(rear == Maxsize-1)
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
		
		temp = queue[front];
		
		front++;
		
		return(temp);
	}
	
	
	
	boolean isEmpty()
	{
		if(front > rear)
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
		for(int i = front; i <= rear ; i++)
		{
			System.out.println(queue[i] + " ");
		}
	}
}



public class Linear_Queue_Example {

	public static void main(String[] args) {

		int ch, e, size;
		
		Scanner sc = new Scanner(System.in);
		
		LinearQueueExample obj = new LinearQueueExample();
		
		System.out.println("Enter Size :: ");
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
					if(obj.isFull() != true)               // not full
					{
						System.out.println("Enter element");
						e = sc.nextInt();
						
						obj.Enqueue(e);
					}
					
					else
					{
						System.out.println("Queue is Full");
					}
				}
				break;
			
			
				case 2:
				{
					if(obj.isEmpty() != true)               // not empty
					{
						e = obj.Dequeue();
						
						System.out.println("Element dequeued :: " + e);
					}
					
					else
					{
						System.out.println("Queue is Empty");
					}
				}
				break;
			
				
				case 3:
				{
					if(obj.isEmpty() != true)               // not empty
					{
						System.out.println("Elements on queue :: ");
						
						obj.printQueue();
					}
					
					else
					{
						System.out.println("Queue is Empty");
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
					System.out.println("Wrong choice");
				}
				break;	
		}
		
	}while(ch != 4);
		
		sc.close();
	}
}
