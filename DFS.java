import java.util.*;
class dfs
{
	LinkedList<Integer> adj[];
	dfs(int vertex)
	{
		adj = new LinkedList[vertex];
		for(int i = 0 ; i < vertex ; i++)
		    adj[i] = new LinkedList<Integer>();	
	}
	
	void addEdge(int source , int dest)
	{
		adj[source].add(dest); 
		adj[dest].add(source);
	}
	
	void dfs(int v , boolean vis[])
	{
		vis[v] = true;
		System.out.print(v + " ");
		for(int adj_node : adj[v])
		{
			if(!vis[adj_node])
				dfs(adj_node , vis);
		}
		
	}
	
	 /* void printGraph()
	{
		for(int i = 0 ; i < adj.length ; i++)
		{
			System.out.print("Adjacency list of vertex "+ i);
			for(int j = 0 ; j < adj[i].size() ; j++)
			{
				System.out.print("-- > " + adj[i].get(j));
			}
			System.out.println();
		}	
	}  */
	
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		int vertex = sc.nextInt();
		int edges = sc.nextInt();
		dfs graph = new dfs(vertex);
		for(int i = 0 ; i < edges ; i++)
		{
			int source = sc.nextInt();
		    int dest = sc.nextInt();
			graph.addEdge(source , dest);
		}
		
		boolean vis[] = new boolean[vertex];
		
		//graph.printGraph();
		graph.dfs(1 , vis);
	}	
}
