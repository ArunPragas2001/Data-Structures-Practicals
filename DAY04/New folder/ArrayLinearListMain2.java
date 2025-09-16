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
    // data members
    protected Object[] arrayList;
    protected int size;

    // Constructors
    // create a list with initial capacity initialCapacity
    // Throw IllegalArgument Exception when initialCapacity < 1
    public ArrayLinearList(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("initialCapacity must be >= 1");
        }
        arrayList = new Object[initialCapacity];
        size = 0;
    }

    public ArrayLinearList() {
        this(10); // Default capacity
    }

    // Returns true if the list is empty, false otherwise
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the number of elements in the list
    @Override
    public int size() {
        return size;
    }

    // Throws IndexOutOfBoundsException if index is not between 0 and size - 1
    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
        }
    }

    // return element with specified index
    @Override
    public Object get(int index) {
        checkIndex(index);
        return arrayList[index];
    }

    // Returns the index of the first occurrence of the specified element, or -1 if not found
    @Override
    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (arrayList[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // Removes and returns the element at the specified index
    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object removedElement = arrayList[index];
        for (int i = index + 1; i < size; i++) {
            arrayList[i - 1] = arrayList[i];
        }
        arrayList[--size] = null; // Clear the last element
        return removedElement;
    }

    // Adds the specified element at the specified index
    @Override
    public void add(int index, Object theElement) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
        }

        // Check if array needs to be resized
        if (size == arrayList.length) {
            Object[] newArray = new Object[2 * arrayList.length];
            System.arraycopy(arrayList, 0, newArray, 0, size);
            arrayList = newArray;
        }

        // Shift elements to the right to make room for the new element
        for (int i = size - 1; i >= index; i--) {
            arrayList[i + 1] = arrayList[i];
        }
        arrayList[index] = theElement;
        size++;
    }

    // Convert to a String representation
    @Override
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
        ArrayLinearList aLL = new ArrayLinearList(5); // Start with a smaller capacity to test resizing

        aLL.add(0, Integer.valueOf(4));
        aLL.add(0, Integer.valueOf(3));
        aLL.add(0, Integer.valueOf(2));
        aLL.add(0, Integer.valueOf(1));
        aLL.add(0, Integer.valueOf(0));
        
        System.out.println("After initial adds: " + aLL.toString()); // Expected: [0, 1, 2, 3, 4]

        aLL.add(0, Integer.valueOf(7)); // This will cause a resize
        aLL.add(0, Integer.valueOf(8));
        
        System.out.println("After more adds (with resize): " + aLL.toString()); // Expected: [8, 7, 0, 1, 2, 3, 4]

        aLL.remove(5); // Remove '3'
        System.out.println("After remove(5): " + aLL.toString()); // Expected: [8, 7, 0, 1, 2, 4]
        
        aLL.remove(4); // Remove '2'
        System.out.println("After remove(4): " + aLL.toString()); // Expected: [8, 7, 0, 1, 4]

        System.out.println("Get element at index 2: " + aLL.get(2)); // Expected: 0
        System.out.println("Get element at index 0: " + aLL.get(0)); // Expected: 8
    }
}
