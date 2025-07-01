import java.util.*;

public class LinkedListDemoSwitch {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLinkedList Operations Menu:");
            System.out.println("1. Add element");
            System.out.println("2. Add First");
            System.out.println("3. Add Last");
            System.out.println("4. Sort list");
            System.out.println("5. Peek (view head)");
            System.out.println("6. Poll (remove head)");
            System.out.println("7. Size of list");
            System.out.println("8. Check if contains a value");
            System.out.println("9. Get element by index");
            System.out.println("10. Set element at index");
            System.out.println("11. Remove by index");
            System.out.println("12. Remove by value");
            System.out.println("13. Print list (for-each loop)");
            System.out.println("14. Print list (iterator)");
            System.out.println("15. Clear list");
            System.out.println("16. Check if empty");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter fruit to add: ");
                    fruits.add(sc.nextLine());
                    System.out.println("Updated List: " + fruits);
                    break;

                case 2:
                    System.out.print("Enter fruit to addFirst: ");
                    fruits.addFirst(sc.nextLine());
                    System.out.println("Updated List: " + fruits);
                    break;

                case 3:
                    System.out.print("Enter fruit to addLast: ");
                    fruits.addLast(sc.nextLine());
                    System.out.println("Updated List: " + fruits);
                    break;

                case 4:
                    Collections.sort(fruits);
                    System.out.println("Sorted List: " + fruits);
                    break;

                case 5:
                    System.out.println("Peek: " + fruits.peek());
                    break;

                case 6:
                    System.out.println("Poll (removed): " + fruits.poll());
                    System.out.println("After poll: " + fruits);
                    break;

                case 7:
                    System.out.println("Size: " + fruits.size());
                    break;

                case 8:
                    System.out.print("Enter fruit to check: ");
                    String check = sc.nextLine();
                    System.out.println("Contains " + check + "? " + fruits.contains(check));
                    break;

                case 9:
                    System.out.print("Enter index to get: ");
                    int getIndex = sc.nextInt();
                    if (getIndex >= 0 && getIndex < fruits.size()) {
                        System.out.println("Element at index " + getIndex + ": " + fruits.get(getIndex));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 10:
                    System.out.print("Enter index to set: ");
                    int setIndex = sc.nextInt();
                    sc.nextLine();
                    if (setIndex >= 0 && setIndex < fruits.size()) {
                        System.out.print("Enter new value: ");
                        String newVal = sc.nextLine();
                        fruits.set(setIndex, newVal);
                        System.out.println("Updated List: " + fruits);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 11:
                    System.out.print("Enter index to remove: ");
                    int remIndex = sc.nextInt();
                    if (remIndex >= 0 && remIndex < fruits.size()) {
                        fruits.remove(remIndex);
                        System.out.println("Updated List: " + fruits);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 12:
                    System.out.print("Enter value to remove: ");
                    String remVal = sc.nextLine();
                    if (fruits.remove(remVal)) {
                        System.out.println("Removed successfully.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    System.out.println("Updated List: " + fruits);
                    break;

                case 13:
                    System.out.println("For-each loop:");
                    for (String fruit : fruits) {
                        System.out.println(fruit);
                    }
                    break;

                case 14:
                    System.out.println("Using Iterator:");
                    Iterator<String> it = fruits.iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
                    break;

                case 15:
                    fruits.clear();
                    System.out.println("List cleared.");
                    break;

                case 16:
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
