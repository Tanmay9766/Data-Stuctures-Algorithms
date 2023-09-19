package LinkedLists;

import java.util.Scanner;

public class DynamicStackExample
{
    Node tos;  
    
    
	  void createStack()
	  {
	     tos = null;
	  }
	  
	  
	  void Push(int e)
	  {
	      Node n = new Node(e);
	      
	      if(tos == null)
	         tos=n;//only for 1st
	      
	      else
	      {
	          n.next = tos;//1
	          
	          tos = n;//2
	          
	          System.out.println(" Pushed");
	      }
	  }
	  
	  
	  void Pop()
	  {
	      if(tos == null)
	          System.out.println("Empty Stack");
	      
	      else
	      {
	          Node t = tos;
	          
	         tos = tos.next;
	         
	          System.out.println("Poped :: " + t.data);
	      }
	  }

	  
	  void Peek()
	  {
	      if(tos == null)
	          System.out.println("Empty Stack");
	      
	      else
	      {
	          Node t = tos;
	          
	         tos = tos.next;
	         
	          System.out.println("Poped :: " + tos.data);
	      }
	  }
  

  
	  void printStack()
	  {  
		  if(tos == null)
	          System.out.println("Empty Stack");
		  
	      else
	      {   Node t = tos;//1
	      
	          while(t != null)//2
	          {
	              System.out.println(t.data);
	              
	              t = t.next;
	          }
	      }
	  }
	  
	  
  public static void main(String args[])
    {
        int ch,e,size;
        
        DynamicStackExample obj = new DynamicStackExample();
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter size:");
      //  size=in.nextInt();
        obj.createStack();
        
        
        do
        {
           System.out.println("\n1.Push\n 2.Pop\n 3.Peek\n 4.Print\n 5.Exit\n :: ");
           ch = in.nextInt();
           
           
           switch(ch)
           {
               case 1:
	       		{
	               System.out.println("Enter element :: ");
	               e = in.nextInt();
	               
	               obj.Push(e);
	       		}
	           break;
	           
                       
                case 2:
                {
                           obj.Pop();
                           
                           System.out.println("Element poped:");
                }
                break;
                
                
                case 3:
                {
                	obj.Peek();
                
                    System.out.println("Element @ peek is:");
                      
                }
                break;
                
                
                case 4:
                {
                          obj.printStack();
                }      
                break;
                
                case 5:
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
        }while(ch!=5);
    }
}
