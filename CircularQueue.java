public class circularQ {
    int front = -1;
    int rear = -1;
    int[] arr = new int[6];

    public void insert(int data)  {
        if((rear == arr.length - 1 && front == 0) || (rear == front - 1))   {
            System.out.println("Queue is full");
            return;
        }
        if(rear < arr.length - 1)   {
            ++rear;
            front = front == -1 ? ++front : front;
            arr[rear] = data;
        }
        else  {
            arr[0] = data;
            rear = 0;
        }
    }

    public void delete()  {
        if(front == -1)    {
            System.out.println("Queue is empty");
            return;
        }

        if(front < arr.length - 1)  {
            ++front;
        }
        else if(front == rear)  {
            front = -1;
            rear = -1;
        }
        else  {
            front = 0;
        }
    }

    public void print()    {
        System.out.println();
        System.out.println("front: " + front + " rear: " + rear);
        for(int i = 0 ; i < arr.length ; i++)  {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)  {
        circularQ queue = new circularQ();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.print();
    }
}
