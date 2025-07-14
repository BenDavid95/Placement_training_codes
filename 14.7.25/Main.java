import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue q = new Queue(n);
		
		q.enqueue(2);
		q.enqueue(21);
		q.enqueue(245);
				
		q.print();
	    q.dequeue();
		q.print();
		
		q.dequeue();
		q.print();
		
		q.dequeue();
		q.print();
		
			q.dequeue();
		q.print();
				
		
	}
}