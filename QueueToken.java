 class Queue {
    int front,rear;
    String[]names;
    int[]tokens;
    int size;

    public Queue(int size)
    {
        this.size=size;
        front=0;
        rear=-1;
        names=new String[size];
        tokens=new int[size];



    }   
    
    
    public void  enqueue(String name, int token)
    {
        if(isFull())
        {
            System.out.println("Queue overflow");
        }
        System.out.println("Adding:" +name+" ,"+token);
        rear++;
        names[rear]=name;
        tokens[rear]=token;
         

    }

    public void dequeue()
    {
        
        if(isEmpty())
        {
            System.out.println("Queue underflow");
        }
        front++;
        //System.out.println("Removing:" +name+" ,"+token);



    }
    public boolean isFull()
    {  
        if(rear==size)
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
        if(rear<front)
        {
           return true;
        }

         else
        {
            return false;
        }
        


    }
    public void display()
    {
        for(int i=front; i<=rear; i++)
        {
            System.out.println("Name :"+names[i]+"token :"+tokens[i]);


        }



    }


    
}

public class QueueToken
{
   public static void main(String[]args)
   {
      
     Queue q=new Queue(7);

    q.enqueue("Harry", 0);
      q.enqueue("James", 1);
       q.enqueue("Olivia", 2);
         q.enqueue("Thomas", 3);
          q.enqueue("George", 4);
           q.enqueue("Willium", 5);

           q.display();

           System.out.println("Removing 2 members...");
           q.dequeue();
           q.dequeue();


           System.out.println("Displaying after removing 2 members");
            q.display();

   }


}


