import java.util.*;
class map
{
	public static void main(String[] args)
	{
		Map <Integer , String> m = new HashMap <>();
		m.put(1 , "one");
		m.put(2 , "two");
		m.put(3 , "three");
		m.put(4 , "four");
		m.remove(4);
		System.out.println(m);
		System.out.println(m.containsKey(6));
		System.out.println(m.containsValue("One"));
		for(Map.Entry <Integer , String> e : m.entrySet())
		{
			System.out.println(e.getKey() + " : " + e.getValue());
			String s = e.getValue();
			System.out.println(s);
		}	
	}
}	
