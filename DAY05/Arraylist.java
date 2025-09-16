//write a java programme using ArrayList to manage a list of Student name

//1.Accept 5 student names from the user and stire them in an ArrayList<string>
//2.Display all the student names
import java.util.*;
import java.util.Scanner;


class Student{
  private String name;
  ArrayList<String>students=new ArrayList<>();


    Student()
	{
     this.name=name;
    }		
	
	public String getName(){
	return name;	
	}
	
	void enterName(){
		
		Scanner sc =new Scanner(System.in);
		
		for(int i=0; i<5; i++){
		System.out.println("Enter the user name?");
		String name=sc.nextLine();
        students.add(name);		
		}
	}
	
	void display(){
	System.out.println(students);
    }
	
	
	void find(String na){
		
	 System.out.println("Enter the name you want to search?");
	 String Name=sc.nextLine();	
	 if (students.contains(na)){
		 int index
		System.out.println("Hi"); 
		 
	 }
		
	}
	
}
 class App{
	public static void main(String[]args){
		Student stu = new Student();
		stu.enterName();
		stu.display();
		stu.find();
		
		
		
	}
}


