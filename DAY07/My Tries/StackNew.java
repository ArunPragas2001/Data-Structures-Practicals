import java.util.Scanner;


class Stack{
	int max;
	top=-1;
	String stackArray[];
	
	Stack(int size)
	{
			stackArray=new string[size];
			max=size;
	}
	
	public boolean isFull()
	{
		
		return  top==max-1;
	}
	
	
	
	
}