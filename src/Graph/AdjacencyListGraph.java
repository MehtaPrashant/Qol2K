package Graph;

//We are creating a graph with noo value just the src and destination

public class AdjacencyListGraph {
	int V;
	AdjacencyList[] adjacencyLists;
	public AdjacencyListGraph(int V) {
		this.V = V;
		adjacencyLists = new AdjacencyList[V];
		for(int i = 0; i < V; i++)
			adjacencyLists[i] = new AdjacencyList();
	}
	public void addEdge(int src, int dest) {
		Gnode destNode = new Gnode(dest);
		destNode.next = this.adjacencyLists[src].head;
		this.adjacencyLists[src].head = destNode;
		
		Gnode srcNode = new Gnode(src);
		srcNode.next = this.adjacencyLists[dest].head;
		this.adjacencyLists[dest].head = srcNode;
		
	}
	public void printGraph() {
		int v = V;
		for(int i = 0; i < v; i++) {
			Gnode listNode = adjacencyLists[i].head;
			while(listNode != null) {
				System.out.print(listNode.data + " ");
				listNode = listNode.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int V = 5;
		AdjacencyListGraph graph = new AdjacencyListGraph(V);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printGraph();
	}
}
