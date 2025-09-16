import java.util.Arrays;

// Assuming the Interface LinearList is defined elsewhere and ArrayLinearList implements it

public class Main {
    public static void main(String[] args) {
        System.out.println("--- ArrayLinearList Demonstration ---");
        
        // Create an ArrayLinearList with initial capacity 5
        ArrayLinearListEx list = new ArrayLinearListEx(5);

        // Add some initial elements
        list.add(0, "Apple");
        list.add(1, "Banana");
        list.add(2, "Orange");
        list.add(3, "Grapes");
        list.add(4, "Pineapple");
        System.out.println("Initial list: " + list); // Expected: [Apple, Banana, Orange, Grapes, Pineapple]
        System.out.println("Size: " + list.size()); // Expected: 5

        System.out.println("\n--- Testing add with resize ---");
        // This add will trigger a resize of the underlying array
        list.add(1, "Kiwi");
        System.out.println("After adding 'Kiwi' at index 1: " + list); // Expected: [Apple, Kiwi, Banana, Orange, Grapes, Pineapple]
        System.out.println("New size: " + list.size()); // Expected: 6

        System.out.println("\n--- Testing set() method ---");
        Object oldElement = list.set(2, "Strawberry");
        System.out.println("Replaced element at index 2. Old element was: " + oldElement); // Expected: Banana
        System.out.println("List after set(): " + list); // Expected: [Apple, Kiwi, Strawberry, Orange, Grapes, Pineapple]

        System.out.println("\n--- Testing indexOf() and lastIndexOf() ---");
        list.add(6, "Apple");
        System.out.println("List with duplicate: " + list); // Expected: [Apple, Kiwi, Strawberry, Orange, Grapes, Pineapple, Apple]
        System.out.println("Index of first 'Apple': " + list.indexOf("Apple")); // Expected: 0
        System.out.println("Index of last 'Apple': " + list.lastIndexOf("Apple")); // Expected: 6
        System.out.println("Index of 'Mango' (not found): " + list.indexOf("Mango")); // Expected: -1

        System.out.println("\n--- Testing setSize() method ---");
        list.setSize(4);
        System.out.println("List after setSize(4): " + list); // Expected: [Apple, Kiwi, Strawberry, Orange]
        list.setSize(7);
        System.out.println("List after setSize(7): " + list); // Expected: [Apple, Kiwi, Strawberry, Orange, null, null, null]
        System.out.println("New size: " + list.size()); // Expected: 7
        
        System.out.println("\n--- Testing removeRange() method ---");
        list.removeRange(1, 4); // Remove from index 1 (inclusive) to 4 (exclusive)
        System.out.println("List after removeRange(1, 4): " + list); // Expected: [Apple, null, null, null]
        System.out.println("New size: " + list.size()); // Expected: 4

        System.out.println("\n--- Testing clear() method ---");
        list.clear();
        System.out.println("List after clear(): " + list); // Expected: []
        System.out.println("Size after clear: " + list.size()); // Expected: 0
        System.out.println("Is list empty? " + list.isEmpty()); // Expected: true
    }
}
