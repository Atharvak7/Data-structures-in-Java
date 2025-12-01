public class doublyLL {
    node head;
    static class node {
        int data;
        node prev;
        node next;
        node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    void print()  {
        node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtEnd(int data)  {
        node newNode = new node(data);
        if(head == null)  {
            head = newNode;
            return;            
        }

        node temp = head;
        while(temp.next != null)  {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAtGivenPosition(int data, int pos)  {
        node newNode = new node(data);
        if(pos == 0)   {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        node temp = head;
        for(int i = 0 ; i < pos - 1 ; i++)  {
            if(temp.next == null)  {
                System.out.println("Size of list is smaller than the location entered for location: " + pos);
                return;
            }
            temp = temp.next;
        }

        if(temp.next == null)   {
            insertAtEnd(data);
            return;
        }
        
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        node nodeNextToNewNode = newNode.next;
        nodeNextToNewNode.prev = newNode;
    }

    void printInReverse()   {
        if(head == null)
            return;

        node temp = head;
        while(temp.next != null)  {
            temp = temp.next;
        }

        while(temp != null)   {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void reverse()  {
        node curr = head;

        while(curr != null)   {
            node temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            head = curr;
            curr = temp;
        }
        
    }

    public static void main(String[] args)  {
        doublyLL list = new doublyLL();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(35);
        list.insertAtEnd(9);
        list.insertAtGivenPosition(91, 0);
        list.insertAtGivenPosition(15, 3);
        list.insertAtGivenPosition(56, 4); 
        list.reverse();
        list.print();
        list.printInReverse();
    }
}
