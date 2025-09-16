import java.util.*;


class Student{
  
  private int marks;
  Scanner sc=new Scanner(System.in);
  ArrayList<Integer>students=new ArrayList<>();
  
  Student(){
	 
   this.marks=marks;
  
  }
  
  void print(String s){
	  
	  System.out.println(s);
  }
  
  void printInt(int x){
	  
	  System.out.println(x);
  }
  
  
  
  
  public void getMarks(){
	System.out.println("*****----------------------*****");
    print("Enter your marks?");
  
	for(int i=0; i<5; i++){
		
	 int marks=sc.nextInt();
	 students.add(marks);	
  
		
	}
	
  }
  
  
  void display(){
	 
	 System.out.println("----------------------");
	 print("Your marks are");
	 System.out.println(students);
	  
	}
 
 public void average(){
    
	int sum=0;
	for(int m:students)
	{
      sum+=m;
	}	
	
	System.out.println("----------------------");
    double avg =(double)sum/students.size();
	print("Average of these marks");
	System.out.println(avg);
	print("----------------------");
   
   }
   
  void HighLow(){
	
	int highest=Collections.max(students);
	int lowest=Collections.min(students);
	
	print("Highest Marks");
	printInt(highest);
	print("Lowest Marks");
	printInt(lowest);
    

  }
  
  
/*  void remove(){
	 Iterator<Integer>iterator=marks.iterator();
  
     while(iterator.hasNext())
	 {
			int mark=iterator.next();
			if(mark<40)
			{
				
			  iterator.remove();	
			}

	 }
  }  
 */

public void remove(){
	System.out.println("----------------------");
	students.removeIf(marks ->marks<40);
	print("Marks have removed below 40%");
	
	System.out.println("*****----------------------*****");
}










}




class App2{
	public static void main(String[]args){
		
	  Student stu=new Student();
	  stu.getMarks();
	  stu.display();
	  stu.average();
	  stu.HighLow();
      stu.remove();
	}

}