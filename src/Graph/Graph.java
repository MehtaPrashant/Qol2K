package Graph;

public class Graph {
	int V;
	AdjacencyList[] adjacencyLists;
	public Graph(int v) {
		V = v;
		adjacencyLists = new AdjacencyList[v];
		for(int i = 0; i < v; i++)
			adjacencyLists[i] = new AdjacencyList();
	}
	public void printGraph() {
		for(int i = 0; i < V; i++) {
			Gnode gnode= adjacencyLists[i].head;
			while(gnode != null) {
				System.out.print(gnode.data + "  ");
				gnode = gnode.next;
			}
			System.out.println();
		}
	}
	public void addDirectedEdge(int src, int dest) {
		Gnode gnode = new Gnode(dest);
		gnode.next = adjacencyLists[src].head;
		adjacencyLists[src].head = gnode;
	}
}
