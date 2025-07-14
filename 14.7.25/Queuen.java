import java.util.*;
public class Queuen
{
	public static void main(String[] args) {
		Stack<String> animals= new Stack<>();
animals.push("monkey");
animals.push("human");
animals.push("mother");
System.out.println(animals);
animals.pop();
System.out.println(animals);

		// Queue example
		Queue<Integer> numbers = new LinkedList<>();
		numbers.offer(10); 
		numbers.offer(20);
		System.out.println(numbers);
		numbers.poll(); 
		System.out.println(numbers);
	}
}
