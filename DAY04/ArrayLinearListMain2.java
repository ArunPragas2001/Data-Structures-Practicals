interface LinearList {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public int indexOf(Object element);
    public Object remove(int index);
    public void add(int index, Object obj);
    public String toString();
}
 class ArrayLinearList implements LinearList {
    
    protected Object[] arrayList;
    protected int size;

    
    public ArrayLinearList(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("initialCapacity must be >= 1");
        }
        arrayList = new Object[initialCapacity];
        size = 0;
    }

    public ArrayLinearList() {
        this(10); 
    }

    
    
    public boolean isEmpty() {
        return size == 0;
    }

    
    
    public int size() {
        return size;
    }

    
    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
        }
    }

    
    public Object get(int index) {
        checkIndex(index);
        return arrayList[index];
    }

    
   
    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (arrayList[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    
    public Object remove(int index) {
        checkIndex(index);
        Object removedElement = arrayList[index];
        for (int i = index + 1; i < size; i++) {
            arrayList[i - 1] = arrayList[i];
        }
        arrayList[--size] = null;
		
		size--;
        return removedElement;
    }

    
    @Override
    public void add(int index, Object theElement) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
        }

        
        if (size == arrayList.length) {
            Object[] newArray = new Object[2 * arrayList.length];
            System.arraycopy(arrayList, 0, newArray, 0, size);
            arrayList = newArray;
        }

        
        for (int i = size - 1; i >= index; i--) {
            arrayList[i + 1] = arrayList[i];
        }
        arrayList[index] = theElement;
        size++;
    }
	
    
    public String toString() {
        StringBuffer s = new StringBuffer("[");
        for (int i = 0; i < size; i++) {
            s.append(arrayList[i].toString());
            if (i < size - 1) {
                s.append(", ");
            }
        }
        s.append("]");
        return s.toString();
    }
}

public class ArrayLinearListMain2{
    public static void main(String[] args) {
        ArrayLinearList aLL = new ArrayLinearList(5); 

        aLL.add(0, Integer.valueOf(0));
        aLL.add(1, Integer.valueOf(1));
        aLL.add(2, Integer.valueOf(2));
        aLL.add(3, Integer.valueOf(3));
        aLL.add(4, Integer.valueOf(4));
        
        System.out.println("After initial adds: " + aLL.toString()); 

        aLL.add(0, Integer.valueOf(7)); 
        aLL.add(0, Integer.valueOf(8));
        
        System.out.println("After more adds (with resize): " + aLL.toString()); // Expected: 

        aLL.remove(5); 
        System.out.println("After remove(5): " + aLL.toString()); // Expected: [8, 7, 0, 1, 2, 4]
        
        aLL.remove(4); // Remove '2'
        System.out.println("After remove(4): " + aLL.toString()); // Expected: [8, 7, 0, 1, 4]

        System.out.println("Get element at index 2: " + aLL.get(2)); // Expected: 0
        System.out.println("Get element at index 0: " + aLL.get(0)); // Expected: 8
    }
}
