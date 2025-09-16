import java.util.*;

public class ArrayL{
	public static void main(String args[])
	{
	  
	  
	  //creating an empty ArrayList
	  ArrayList<Integer> a1= new ArrayList<>();
	
	// use add() method to add element
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(9);
	a1.add(50);
	
	
	//adding new element at index 0
	a1.add(0,22);
	
	
     System.out.println(" "+a1);
	//remove element  at index 1
      a1.remove(0);	 
      System.out.println(" "+a1);
	
	//remove element 22 by using object
	
	  a1.remove(Integer.valueOf(22));
	  System.out.println(" "+a1);
	  
	  
   //remove the elements less than

	Iterator itr=a1.iterator();
	
	while(itr.hasNext())
	{
      int x=(Integer)itr.next();
		if(x<10)
			itr.remove();
	
	}
	System.out.println(""+a1);
    }


    for(Integer e.a1)
	{
     Syste.out.println(e+"->");
	}		
	System.out.println("Printing all");
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
