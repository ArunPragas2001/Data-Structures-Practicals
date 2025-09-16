import java.util.Scanner;


 class Stack
{
		int maxSize,top=-1;
		String stackArray[];
		
		
		Stack(int size)
		{
			stackArray=new String[Size];
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
            }
            else
            {
                String tempo= stackArray[top];
                stackArray[top]=null;
                top--;
                return temp;
            }



        }
       
        public String peek()
        {   
            if(isEmpty())
            {

                System.out.println("Stack isEmpty");
            }

            else
            {
                String tempo= stackArray[top];
                return temp;
    


            }

           
        }


        public void display()
        {
           for(int i=0; i<=top; i++)
           {

                System.out.println(stackArray[i]);

           }



        }




		
}


class Stack3
{
	public static void main(String[]args)
    {
        Stack database= new Stack[10];
        database.push("Arun");
        database.push("Kanna");
        database.push("Sendhil");
        database.display();
        System.out.println("Deleted"+database.pop());
        database.display();


    
    
    
    
    }
	
	
	
	
	
	
}