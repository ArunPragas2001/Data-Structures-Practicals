abstract class Shape{//2D shape
	double area=100;
	double perimeter;
    abstract double findArea();
	
}

////RECTANGLE////
class Rectangle extends Shape{


	double length,width;
	
	
	Rectangle(double length,double width){
		
		this.length=length;
		this.width=width;
		
	}
	
	
	double findArea(){
		area=length*width;
		return area;
		
		
	}
	

}



////CIRCLE//////


class Circle extends Shape{

	double radius;
	
	
	Circle(double radius){
		this.radius=radius;
	}
	
	double findArea(){
		
		area=Math.PI*Math.pow(radius,2);
		return area;
	}
	
	

}

public class ShapeDemo{
	public static void main(String[]args){
	Rectangle r1=new Rectangle(2,3);
	System.out.println("Area Of Rectangle r1 is"+r1.findArea());
	
	Circle c1=new Circle(3);
	System.out.println("Area Of Circle c1 is"+c1.findArea());
	
	
   
   }
}