
	
    public interface LinearList
	
{
	
	public boolean isEmpty();
	public int size();
	public Object get(int index);
	public int indexOf(Object element);
	public Object remove(int index);
	public void add(int index, Object obj);
	public String toString();
	
	
	
	
}	
	
	
public class ArrayLinearList implements LinearList{
	
	// data members
	protected Object[] arrayList;
	protected int size;
    int initialcapacity;
	
	/*Constructors 
	create a list with initial capacity initialCapacity
	Throw IllegalArgument Exception when InitialCapacity<1;*/
	
	public ArrayLinearList(int initialcapacity)
	{
		ArrayList Object[]= new ArrayList[initialcapacity];
		
		
		if(initialCapacity<1)
		throw new IllegalArgumentException("initialCapacity must be>=1");
		
		
		
		
		
	}
	
	/*public ArrayLinearList()
	{
		
		if
		
		
		
		
	}*/
	
	public boolean isEmpty()
	{
		boolean isEmpty=true;
		
		if (initialcapacity==0)
		{
			return true;
		}
	    
     	
	}
	public int size(int size)
	{
		size=i; 
		object[]=new Object[i];
		
	}
	
	void checkIndex(int index)
	{
		
		if(index<0|| index>=size)
			throw new IndexOutOfBoundsException("index ="+index+"size="+size);
		
		
	}
	/*
	return element with specified index
	throws IndexOutOfBoundsException when index is not between 0 and size -1
	*/
	public Object get(int index)
	{    
	
	    checkIndex(index);
		return arrayList[index];
		
		
		
		
	}
	
	
	
	public int indexOf(Object element)
	{
		for(int i; i<size; i++)
			if(arrayList[i].equals(theElement))
				return i;
		
		return -1;
	}
	/*
	if the valid index,store the element in a temporary place 
	shift the elements with the higher index
	decrease the size by one
	*/
	
	public Object remove(int index)
	{
		checkIndex(index);
		
		arrayList[--size]=null;
		return removedElement;
		
		
		
		
	}
	
	/*
	If invalid index throw IndexOutOfBoundsException
	if valid index and the position is not empty shift the elements by one place 
	otherwise insert the element in the index
    increase the size by one
	
	*/

	public void add(int index, Object theElement)
	{
		if(index <0 || index > size )
			throw new IndexOutOfBoundsException ("index ="+ index +"size="+size);
		if(arrayList[index]!= null)
		{
			for(int i=size-1; i>=index; i--)
				arrayList[i+1]=arrayList[i];
			
		}
		arrayList[index]=theElement;
		size++;
		
		
	}
	
	
	/*
	Convert to a String 
	*/
	public String toString()
	{
	
      StringBuffer s =new StringBuffer("[");


      for(int i=0; i<size; i++)
		  if(arrayList[i]==null)
			  s.append("null, ");
		  else
			  s.append(arrayList[i].toString()+", ");
		  
		  if(size>0)
			  s.delete(s.length()-2,s.length());
	          s.append("]");
			  
			  return new String(s);
		
		
		
	}
	
}



