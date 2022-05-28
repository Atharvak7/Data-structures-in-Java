import java.util.*;
class bfspath
{
	private LinkedList<Integer> adj[];
	bfspath(int vertex)
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
	
	void bfs(int start , int dest)
	{
		boolean vis[] = new boolean[adj.length];
		Queue<Integer> q = new LinkedList<>();
		int[] parent = new int[adj.length];
		vis[start] = true;
		q.add(start);
		parent[start] = -1;
		while(!q.isEmpty())
		{
			int curr = q.poll();
			//System.out.print(curr + " ");
			if(curr == dest)
				break;
			for(int adj_node : adj[curr])
			{
				if(!vis[adj_node])
				{
					vis[adj_node] = true;
					q.add(adj_node);
					parent[adj_node] = curr;
				}	
			}
		}	
		
		int curr = dest;
		int min = 0;
		while(parent[curr] != -1)
		{
			//System.out.print(curr + " -->");
			curr = parent[curr];
			min++;
		}	
		System.out.println(min);
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
		bfspath graph = new bfspath(vertex);
		for(int i = 0 ; i < edges ; i++)
		{
			int source = sc.nextInt();
		    int dest = sc.nextInt();
			graph.addEdge(source , dest);
		}
		
		//graph.printGraph();
		graph.bfs(0 , 4);
	}	
}
