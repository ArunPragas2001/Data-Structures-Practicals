import java.util.Scanner;

class BinStack{
	
	int max;
	top=-1;
	int stackarray[];
	
	
	BinStack(size)
	{
		stackArray=new int[size];
		max=size;
		
	}
	
    public boolean isEmpty()
	{
		return top==-1;
		
		
		
	}
	
	public boolean isFull()
	{
		
		return top==max-1;
	}
	
	public  void push(int num)
	{
		 
		 if (isFull()) {
            System.out.println("Stack Overflow");
		 }
		 else
		 {   
	        while(num>0)
			{  
			   int x=num%2;
			   top++;
			   stackArray[top]=x;
			   num=num/2;
     					
			}
			 
		 }
		
		
	}
	
	public int pop()
	{
		 if(isEmpty())
		 {
			 
			 System.out.println("Stack UnderFlow");
			 return -1;
		 }
		 else
		 {  
			int temp=stackArray[top];
			stackArray[top]=null; 
			top--;
			 return temp;
		 }
		
	}
	
	public void display(){
		if (isEmpty()) {
        System.out.println("Stack is empty");
        return;
       }

		
		for(int i=top; i>=0; i--)
		{
			System.out.println(stackArray[i]);
			
		}
		
		
		
	}
	
	
	
	public class BinaryCon{
		
		public static void main(String[]args)
		{
			BinStack database= new BinStack(10);
			database.push(10);
			database.display();
			
			
			
		}
		
	
	}
	
	
	
	
	
	
	
	
}