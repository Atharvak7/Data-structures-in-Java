import java.util.Scanner;

class Node 
{
    int data;
    Node left , right;
    Node(int data)  {
        this.data = data;
    }
}


public class tree {
    static Scanner sc = new Scanner(System.in);
    
    static Node createTree()
    {
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if(data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter left to the " + data + ": ");
        root.left = createTree();
        System.out.println("Enter right to the " + data + ": ");
        root.right = createTree();
        return root;
    }
    
    static void inOrder(Node root)   // left --> root --> right 
    {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void preOrder(Node root)   // root --> left --> right
    {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        inOrder(root.left);
        inOrder(root.right); 
    }

    static void postOrder(Node root)  // left --> right --> root
    {
        if(root == null)
            return;
        inOrder(root.left);
        
    }
    
    public static void main(String[] args) {
        /* System.out.println("Enter no. of nodes: ");
        int n = sc.nextInt(); */
        Node root = createTree();
        inOrder(root);
        preOrder(root);
        postOrder(root);

    }
}
