public class ArrayLinearListMain
{

	public static void main(String [] args){
	
	
	ArrayLinearList aLL=new ArrayLinearList(20);
	
	aLL.add(0,Integer.valueOf(4));
	aLL.add(0,Integer.valueOf(3));
	aLL.add(0,Integer.valueOf(2));
	aLL.add(0,Integer.valueOf(1));
	aLL.add(0,Integer.valueOf(0));
	
	
	aLL.add(0,Integer.valueOf(7));
	aLL.add(0,Integer.valueOf(8));
	
	
	System.out.println(aLL.toString());
	
	aLL.remove(5);
	aLL.remove(4);
	System.out.println(aLL.toString());
	
	
	System.out.println(aLL.get(2));
	System.out.println(aLL.get(0));
	
	
	}










}