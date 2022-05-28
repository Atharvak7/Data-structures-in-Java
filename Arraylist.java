import java.util.*;
class list
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i++)
        {
            int x = sc.nextInt();
            l.add(x);
        } 
		
		int loc = sc.nextInt();
        //int num = sc.nextInt(); 
        //l.add(loc, num);
		l.remove(loc);
		for (int i = 0; i < n; i++) 
        {
            System.out.print(l.get(i) + " "); 
        } 
	}
}	
