package Day1_Stack_and_Queue;

import java.util.Scanner;

class Stackexample
{
	private
	
	int stack[], Maxsize, tos;
	
	
	void createStack(int size)
	{
		Maxsize = size;
		
		tos = -1;
		
		stack = new int[Maxsize];
	}
	
	
	void push(int e)
	{
		tos++;
		
		stack[tos] = e;
	}
	
	
	boolean isFull()
	{
		if(tos == Maxsize-1)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	int pop()
	{
		int temp;
		
		temp = stack[tos];
		
		tos--;
		
		return(temp);
	}
	
	
	boolean isEmpty()
	{
		if(tos == -1)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	int peek()
	{
		return (stack[tos]);
	}
	
	
	void printStack()
	{
		for(int i = tos; i > -1 ; i--)
		{
			System.out.println(stack[i]);
		}
	}
}



public class Stack_Example {

	public static void main(String[] args) {
		
		int ch, e, size;
		
		Scanner sc = new Scanner(System.in);
		
		Stackexample obj = new Stackexample();
		
		System.out.println("Enter Size :: ");
		size = sc.nextInt();
		
		obj.createStack(size);
		
		
		do
		{
			System.out.println("\n 1. Push");
			System.out.println("\n 2. Pop");
			System.out.println("\n 3. Peek");
			System.out.println("\n 4. Display");
			System.out.println("\n 5. Exit");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					if(obj.isFull() != true)               // not full
					{
						System.out.println("Enter element :: ");
						e = sc.nextInt();
						
						obj.push(e);
					}
					
					else
					{
						System.out.println("Stack is Full");
					}
				}
				break;
				
				
				case 2:
				{
					if(obj.isEmpty() != true)               // not empty
					{
						e = obj.pop();
						
						System.out.println("Element poped :: " + e);
					}
					
					else
					{
						System.out.println("Stack is Empty");
					}
				}
				break;
				
				
				case 3:
				{
					if(obj.isEmpty() != true)               // not empty
					{
						e = obj.peek();
						
						System.out.println("Element at peek is :: " + e);
					}
					
					else
					{
						System.out.println("Stack is Empty");
					}
				}
				break;
				
				
				case 4:
				{
					if(obj.isEmpty() != true)               // not empty
					{
						System.out.println("Elements on stack is :: ");
						
						obj.printStack();
					}
					
					else
					{
						System.out.println("Stack is Empty");
					}
				}
				break;
				
				
				case 5:
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
			
		}while(ch != 5);
		
		sc.close();
	}
}
