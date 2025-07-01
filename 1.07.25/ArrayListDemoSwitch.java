import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemoSwitch {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nArrayList Operations Menu:");
            System.out.println("1. Add elements");
            System.out.println("2. Print the ArrayList");
            System.out.println("3. Get size of the list");
            System.out.println("4. Get element by index");
            System.out.println("5. Set (replace) element");
            System.out.println("6. Check if list contains a value");
            System.out.println("7. Remove element by index");
            System.out.println("8. Remove element by value");
            System.out.println("9. Iterate using for-each");
            System.out.println("10. Iterate using Iterator");
            System.out.println("11. Sort the list");
            System.out.println("12. Clear the list");
            System.out.println("13. Check if empty");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter fruit to add: ");
                    String fruit = sc.nextLine();
                    fruits.add(fruit);
                    System.out.println(fruit + " added.");
                    break;

                case 2:
                    System.out.println("Current List: " + fruits);
                    break;

                case 3:
                    System.out.println("Size of list: " + fruits.size());
                    break;

                case 4:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < fruits.size()) {
                        System.out.println("Element at index " + index + ": " + fruits.get(index));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    System.out.print("Enter index to replace: ");
                    int i = sc.nextInt();
                    sc.nextLine();
                    if (i >= 0 && i < fruits.size()) {
                        System.out.print("Enter new value: ");
                        String newFruit = sc.nextLine();
                        fruits.set(i, newFruit);
                        System.out.println("Updated list: " + fruits);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6:
                    System.out.print("Enter fruit to check: ");
                    String checkFruit = sc.nextLine();
                    System.out.println("Contains " + checkFruit + "? " + fruits.contains(checkFruit));
                    break;

                case 7:
                    System.out.print("Enter index to remove: ");
                    int remIndex = sc.nextInt();
                    if (remIndex >= 0 && remIndex < fruits.size()) {
                        fruits.remove(remIndex);
                        System.out.println("Updated list: " + fruits);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 8:
                    System.out.print("Enter fruit to remove: ");
                    String remFruit = sc.nextLine();
                    fruits.remove(remFruit);
                    System.out.println("Updated list: " + fruits);
                    break;

                case 9:
                    System.out.println("Iterating using for-each:");
                    for (String f : fruits) {
                        System.out.println(f);
                    }
                    break;

                case 10:
                    System.out.println("Iterating using Iterator:");
                    Iterator<String> iterator = fruits.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;

                case 11:
                    Collections.sort(fruits);
                    System.out.println("Sorted list: " + fruits);
                    break;

                case 12:
                    fruits.clear();
                    System.out.println("List cleared.");
                    break;

                case 13:
                    System.out.println("Is list empty? " + fruits.isEmpty());
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

       
    }
}
