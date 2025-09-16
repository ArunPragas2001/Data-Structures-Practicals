class Student{
 
  private String name;
  private int age; 
  private int registration_no;
  private double gpa;  
  
  Student(String name,int age,int registration_no,double gpa)
  {
	  this.name=name;
	  this.age=age;
	  this.registration_no=registration_no;
	  this.gpa=gpa;
	  
	  
	  
	  
  }
  
  public String getName(){
	  
	return name;  
  }
  public int getAge(){
	  
	return age; 
	  
  }
  public int getRegNo(){
	  
	return registration_no;  
  }
  
  public double  getGpa(){
	  
	return gpa; 
	  
   }
  
  
 }
 
 
 public class Details{
	 
	 public static void main(String[]args){
		 
		Student s1=new Student("Kanna",23,202252,3.9);
		
	    System.out.println("|******Student Details*******|");
		
		System.out.println("| Name  :   "+s1.getName());
        System.out.println("| Age   :    "+s1.getAge());		
		System.out.println("| RegNo :  "+s1.getRegNo());		
		System.out.println("| Gpa   :    "+s1.getGpa());		
		
		 
		 
		 
	 } 
 }