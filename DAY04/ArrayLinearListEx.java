import java.util.Arrays;

class ArrayLinearListEx implements LinearList {
	
    protected Object[] arrayList;
    protected int size;

    
    public ArrayLinearListEx(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("initialCapacity must be >= 1");
        }
        arrayList = new Object[initialCapacity];
        size = 0;
    }

    public ArrayLinearListEx() {
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

    // Returns the index of the first occurrence of the specified element, or "-1" if not found
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
            arrayList = Arrays.copyOf(arrayList, 2 * arrayList.length);
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
    
    // Extends or shrinks the list to the specified newSize.
    public void setSize(int newSize) {
        if (newSize < 0) {
            throw new IllegalArgumentException("New size must be non-negative");
        }
        if (newSize > arrayList.length) {
            arrayList = Arrays.copyOf(arrayList, newSize);
        } else if (newSize < size) {
            // Null out extra elements
            for (int i = newSize; i < size; i++) {
                arrayList[i] = null;
            }
        }
        size = newSize;
    }

    // Replaces the element at the specified index and returns the old element.
    public Object set(int theIndex, Object theElement) {
        checkIndex(theIndex);
        Object oldElement = arrayList[theIndex];
        arrayList[theIndex] = theElement;
        return oldElement;
    }

    // Empties the list.
    public void clear() {
        // Clearing references for garbage collection
        for (int i = 0; i < size; i++) {
            arrayList[i] = null;
        }
        size = 0;
    }

    // Removes all elements in the specified range.
    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Invalid range: fromIndex = " + fromIndex + ", toIndex = " + toIndex);
        }
        int numRemoved = toIndex - fromIndex;
        if (numRemoved > 0) {
            // Shift elements to the left
            for (int i = toIndex; i < size; i++) {
                arrayList[i - numRemoved] = arrayList[i];
            }
            // Null out the remaining elements
            for (int i = size - numRemoved; i < size; i++) {
                arrayList[i] = null;
            }
            size -= numRemoved;
        }
    }

    // Returns the index of the right-most occurrence of the specified element.
    public int lastIndexOf(Object element) {
        for (int i = size - 1; i >= 0; i--) {
            if (arrayList[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
