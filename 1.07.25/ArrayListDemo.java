import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // 3. Print the ArrayList
        System.out.println("Initial List: " + fruits);

        // 4. Get size of the list
        System.out.println("Size of list: " + fruits.size());

        // 5. Get an element by index
        System.out.println("Element at index 2: " + fruits.get(2));

        // 6. Set (replace) an element
        fruits.set(1, "Blueberry");
        System.out.println("After replacing index 1: " + fruits);

        // 7. Check if list contains a value
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 8. Remove element by index
        fruits.remove(0); // removes "Apple"
        System.out.println("After removing index 0: " + fruits);

        // 9. Remove element by value
        fruits.remove("Orange");
        System.out.println("After removing 'Orange': " + fruits);

        // 10. Iterate using for-each
        System.out.println("Iterating using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 11. Iterate using Iterator (with next(), hasNext())
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        //14.sort
        Collections.sort(fruits);
        // 12. Clear the list
        fruits.clear();
        System.out.println("After clearing list: " + fruits);

        // 13. Check if empty
        System.out.println("Is list empty? " + fruits.isEmpty());


        


    }
}
