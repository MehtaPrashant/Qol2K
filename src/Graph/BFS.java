package Graph;

public class BFS {
	public static void bfsUtil(Graph graph, boolean[] visited, Queue queue) {
		int src = queue.dequeue();
		System.out.print(src + " ");
		Gnode gnode = graph.adjacencyLists[src].head;
		while(gnode != null && !visited[gnode.data]) {
			queue.enqueue(gnode.data);
			visited[gnode.data] = true;
//			remember: always do the next at the end as it may lead to very severe issues
			gnode = gnode.next;
		}
		if(!queue.isEmpty()) {
			bfsUtil(graph, visited, queue);
		}
	}
	public static void bfs(Graph graph) {
		int v = graph.V;
		boolean[] visited = new boolean[v];
		Queue queue = new Queue();
		for(int i = 0; i < v; i++) {
			if(!visited[i]) {
				visited[i] = true;
				queue.enqueue(i);
				bfsUtil(graph, visited, queue);
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		int v = 5;
		Graph graph = new Graph(v);
		graph.addDirectedEdge(0, 1);
		graph.addDirectedEdge(0, 2);
		graph.addDirectedEdge(1, 2);
		graph.addDirectedEdge(1, 4);
		graph.addDirectedEdge(2, 0);
		graph.addDirectedEdge(2, 3);
		graph.addDirectedEdge(3, 3);
		//		graph.printGraph();
		bfs(graph);
	}
}
