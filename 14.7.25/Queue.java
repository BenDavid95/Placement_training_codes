class Queue
{
    int a[] ;
    int rear = -1 , cap;
    Queue (int size)            //    create queue
    {
        a = new int[size];
        cap = size;
    }
    
    void enqueue(int num)   //  
    {
        if(cap-1 ==  rear)
          System.out.println("full");
        else 
          a[++rear] = num;
    }
    
    void dequeue()        //  
    {
         if(rear==-1)
            System.out.println("empty queue\n");
         else 
         {
             System.out.println("went out : "+a[0]);
             for(int i =0; i<rear ;i++)
               a[i  ]  = a[i+1   ];
               
               rear--;
         }
    }
    
    
    void print()
    {
        for(int i = 0 ;i<=rear ;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}