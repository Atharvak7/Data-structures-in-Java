// Finds whether given linked list contains loop
import java.util.*;  
public class loopInLL {
        static node head;
            static class node {
                int data;
                node next;
                node(int data) {
                    this.data = data;
                    next = null;
                }
        }
    
        static void insert(int data)
        {
            node toAdd = new node(data);
            if(head == null)
            {
                head = toAdd;
                return;
            }
            node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = toAdd;  
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loopInLL list = new loopInLL();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            list.insert(sc.nextInt());
        }

        //System.out.println(list.head.next.next.next.next.data);
        node slow = head, fast = head;
        list.head.next.next.next.next = head;
        while(slow != null && fast.next != null && fast != null)
        {
            if(slow == fast)
            {
                System.out.println("Loop Exists !!");
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
    }
}
