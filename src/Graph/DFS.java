package Graph;

public class DFS {
	public static void dfsUtil(Graph graph, int node, boolean[] visited) {
		
		System.out.print(node + "  ");
		visited[node] = true;
		Gnode gnode = graph.adjacencyLists[node].head;
		while(gnode != null) {
			if(!visited[gnode.data])
			dfsUtil(graph, gnode.data, visited);
			gnode = gnode.next;
		}
	}
	public static void dfs(Graph graph) {
		int V = graph.V;
		boolean[] visited = new boolean[V];
		for(int i = 0; i < V; i++) {
			if(!visited[i]) {
				dfsUtil(graph, i, visited);
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addDirectedEdge(0, 1);
		graph.addDirectedEdge(0, 2);
		graph.addDirectedEdge(1, 2);
		graph.addDirectedEdge(2, 0);
	    graph.addDirectedEdge(2, 3);
	    graph.addDirectedEdge(3, 3);
	    graph.printGraph();
	    dfs(graph);
	}
}
