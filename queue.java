public class queue {
    class node{
        int val;
        node next=null;
        public node(int val)
        {
            this.val=val;
        }
    
       };
       node head=null;
       node tail=null;
       
       public void push(int x)
       {
        node temp=new node(x);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else
        {
        tail.next=temp;
        tail=temp.next;
        }
        
       }
       public void pop()
       {
        head=head.next;
       }
    
       public void printlist()
       {
        node temp=head;
        System.out.println("lest elements are");
        while(temp!=null)
        {  
            System.out.println(temp.val+"-> ");
            temp=temp.next;
        }
        
       }
    
       public int front()
        {
            return head.val;
         
        }
      
    
}
