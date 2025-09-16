import java.util.Scanner;


 class Stack	
		int maxSize,top=-1;
		String stackArray[];
		
		
		Stack(int size)
		{
			stackArray=new String[size];
			maxSize=size;
			
		}
		
		public boolean isFull()
		{
			if(top == maxSize )
            {
                return true;
            }
			
			else
            {
                return false;

            }
			
		}
		

        public boolean isEmpty()
		{
			if(maxSize==0 )
            {
                return true;
            }
			
			else
            {
                return false;

            }
			
		}

        
		public void push(String x)
		{
			if(isFull())
            {
                System.out.println("Stack Overflow");
            }
            else
        {
          top++;
          stackArray[top]=x;

        }

			
		}
        


        public String pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack Underflow!");
				return null;
            }
            else
            {
                String tempo= stackArray[top];
                stackArray[top]=null;
                top--;
                return tempo;
            }
        }
       
        public String peek()
        {   
            if(isEmpty())
            {

                System.out.println("Stack isEmpty");
				return null;
            }

            else
            {
				return stackArray[top--];
				
            }
			 
        }


        public void display()
        {
           for(int i=0; i<=top; i++)
           {

                System.out.println(stackArray[i]);

           }



        }
		
		public static  boolean isPalindrome(String str)
		{
			str=str.replaceAll("\\s+","").toLowerCase();
			Stack s =new Stack(str.length());
			
			
			for(int i=0; i<str.length(); i++)
			{
				s.push(String.valueOf(str.charAt(i)));
				
			}
			String reversed="";
			
			while(!s.isEmpty())
			{
				reversed+=s.pop();
			}
			return str.equals(reversed);
		}




		
}


public class Stack3
{
	public static void main(String[]args)
    {
        Stack database= new Stack(10);
        database.push("Arun");
        database.push("Kanna");
        database.push("Sendhil");
        database.display();
        System.out.println("Deleted  "+database.pop());
        database.display();
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String");
		String input=sc.nextLine();
		
		if(isPalindrome(input))
		{
			System.out.println("Palindrome");
			
		}

    
    
    
    
    }
	
	
	
	
	
	
}