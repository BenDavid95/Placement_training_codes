import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        // 1. Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // 2. Add elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        // 3. Add First
        fruits.addFirst("Pineapple");
        System.out.println("After addFirst: " + fruits);

        // 4. Add Last (same as add())
        fruits.addLast("Grapes");
        System.out.println("After addLast: " + fruits);

        // 5. Sort the list
        Collections.sort(fruits);
        System.out.println("After sort: " + fruits);

        // 6. Peek (get first element without removing)
        System.out.println("Peek: " + fruits.peek());

        // 7. Poll (get and remove first element)
        System.out.println("Poll: " + fruits.poll());
        System.out.println("After poll: " + fruits);

        // 8. Size of list
        System.out.println("Size: " + fruits.size());

        // 9. Contains check
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 10. Get and set
        System.out.println("Element at index 2: " + fruits.get(2));
        fruits.set(2, "Kiwi");
        System.out.println("After set at index 2: " + fruits);

        // 11. Remove by index
        fruits.remove(1);
        System.out.println("After removing index 1: " + fruits);

        // 12. Remove by value
        fruits.remove("Grapes");
        System.out.println("After removing 'Grapes': " + fruits);

        // 13. For-each loop
        System.out.println("For-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 14. Iterator with next(), hasNext()
        System.out.println("Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 15. Clear the list
        fruits.clear();
        System.out.println("After clearing: " + fruits);

        // 16. Check if empty
        System.out.println("Is list empty? " + fruits.isEmpty());
    }
}
