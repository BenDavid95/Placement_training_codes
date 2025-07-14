public class Stack{
    
    class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    }
    
    
    Node head = null , tail = null;
    
    public void insert(int n)
    {
        
        Node newnode = new Node(n);
        if(head == null)
        {
            head = newnode;
            tail = newnode;
        }
        
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    
    
     public void insert_begin(int n)
    {
        Node newnode = new Node(n);
        if(head == null)
        {
            head = newnode;
            tail = newnode;
        }
        
        else{
           newnode.next = head;
           head = newnode;
        }
    }
    
     public void insert_mid(int pos , int n)
    {
        Node newnode = new Node(n);
        if(head == null)
        {
            head = newnode;
            tail = newnode;
        }
        
        else{
          
          Node c = head , p = null;
          int count=1;
          if(pos == 1)
          {
              newnode.next = head;
           head = newnode;
           return ;
              
          }
          while(count!=pos && c!=null)
          {
              p = c ;
              c = c.next;
              count++;
          }
          
         if(count==pos)
         {
          p.next = newnode;
           newnode.next  = c;
         }
         else   //    tail 
         {
             tail.next = newnode;
            tail = newnode;
         }
        }
    }
    void display()
    {
        Node i = head;
        while(i!=null)
        {
            System.out.print(i.data +" -> ");
            i = i.next;
        }
        
        System.out.println("\n-------------------------------\n");
    }
	public static void main(String[] args)
	{
	    Main m = new Main();
		m.insert(10);
		m.insert(20);
		m.insert(30);
		m.insert(40);
		m.insert(50);
		m.display();
		m.insert_mid(10,100);
			m.display();
	}
}



// stack    queue      Array   ll  



