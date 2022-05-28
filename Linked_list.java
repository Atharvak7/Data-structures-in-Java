class llist {
    node head;
    static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
            next = null;
        }
        
    }
    
    void insertAtEnd(int data)
    {
        node toAdd = new node(data);
        if(isEmpty())
        {
            head = toAdd;
            return;
        }
        node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = toAdd;    
        
    }

    void insertAtBegining(int data)
    {
        node toAdd = new node(data);
        if(isEmpty())
        {
            head = toAdd;
            return;
        } 
        toAdd.next = head;
        head = toAdd;
    }

    void insertAtGivenPosition(int data , int pos)
    {
        if(pos == 0)
        {
            insertAtBegining(data);
            return;
        }
        node toAdd = new node(data);
        node temp = head;
        for(int i = 0 ; i < pos - 1 && temp != null ; i++)
            temp = temp.next;
        if(temp == null)
        {
            System.out.println("Enter valid input");
            return;
        }
        toAdd.next = temp.next;
        temp.next = toAdd;
    }

    void deleteFromBegining()
    {
        if(isEmpty())
            return;
        head = head.next;
    }

    void deleteFromEnd()
    {
        if(isEmpty() || head.next == null)
        {
            head = null;
            return;
        }
        node temp = head;
        while(temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    void deleteFromGivenPosition(int pos)
    {
        node temp = head;
        for(int i = 0 ; i < pos - 1 && temp != null ; i++)
            temp = temp.next;
        if(temp == null)
        {
            System.out.println("Enter valid input");
            return;
        }
        temp.next = temp.next.next;
    }

    void reverse()
    {
        if(isEmpty() || head.next == null)
            return;
    }
     
    boolean isEmpty()
    {
        return head == null;
    }

     void print()
    {
        node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        llist list = new llist();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtBegining(20);
        list.print();
        list.insertAtGivenPosition(30, 3);
        list.print();
        list.deleteFromBegining();
        list.print();
        list.deleteFromEnd();
        list.print();
        list.insertAtEnd(25);
        list.deleteFromGivenPosition(1);
        list.print();
    }
}
