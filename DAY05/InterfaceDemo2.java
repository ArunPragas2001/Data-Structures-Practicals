

interface Calculator{
	int add(int a, int b);
	int substract(int a,int b);
	int multiply(int a,int b);
	float divide(int a,int b);
}

class MyCalculator implements Calculator{


    public void method1(String s){
	System.out.println("From C="+s);

   }
   
   public int add(int a, int b){
		System.out.println("Mycalculator performed addition operation"+a+"+"+b+"="+(a+b));
		return a+b;
		
   }
   
   
   public int substract(int a, int b){
		System.out.println("Mycalculator performed addition operation"+a+"-"+b+"="+(a+b));
		return a-b;
		
   }
   
   
    public int multiply(int a, int b){
		System.out.println("Mycalculator performed addition operation"+a+"*"+b+"="+(a*b));
		return a-b;
		
   }
   
   public float divide(int a, int b){
		System.out.println("Mycalculator performed addition operation"+a+"/"+b+"="+(a/b));
		return a/b;
		
    }
   
 
   
 }	   
   
	




class calculator{
	void print(){
	System.out.("Hi from calculator");
	}
}





public class InterfaceDemo2{
	public static void main(String []args){
		
		MyCalculator myc= new MyCalculator();
		
		myc.add(100,12);
        myc.substract(100,50);		
		
		
	}
	
}
