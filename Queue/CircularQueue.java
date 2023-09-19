package Day1_Stack_and_Queue;

import java.util.Scanner;

class CircularQueueExample
{
	private
	
	int Maxsize, rear, front, queue[], count;
	
	
	void createQueue(int size)
	{
		Maxsize = size;
		
		rear = -1;
		
		front = 0;
		
		queue = new int[Maxsize];
		
		count = 0;
	}
	
	
	
	void Enqueue(int e)
	{
		rear = (rear + 1) % Maxsize;
		
		count++;
		
		queue[rear] = e;
	}
	
	
	boolean isFull()
	{
		if(count == Maxsize)
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
		
		front = (front+1) % Maxsize;
		
		count--;
		
		return(temp);
	}
	
	
	boolean isEmpty()
	{
		if(count == 0)
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
		int i = front;
		
		int c = 0;
		
		while(c < count)
		{
			System.out.println(queue[i] + " ");
			
			i = (i+1) % Maxsize;
			
			c++;
		}
	}
}


public class Circular_Queue_Example {

	public static void main(String[] args) {

		int ch, e, size = 0;
		
		CircularQueueExample obj = new CircularQueueExample();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size:");
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
					if(obj.isFull() != true)
					{
						System.out.println("Enter element :: ");
						
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
					if(obj.isEmpty() != true)
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
					if(obj.isEmpty() != true)
					{
						System.out.println("Elements on queue :: ");
						
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
					System.out.println("Wrong choice");
				}
				break;	
			}
		}while(ch != 4);
		
		sc.close();
	}
}
