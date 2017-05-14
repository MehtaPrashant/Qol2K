package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DFSUsingCollections {
	public static void DFSUtil(Graph g, int index, boolean[] visited) {
		visited[index] = true;
		System.out.print(index + " ");
		Iterator<Integer> iterator = g.list[index].iterator();
		while(iterator.hasNext()) {
			index = iterator.next();
			if(!visited[index]) {
				DFSUtil(g, index, visited);
			}
		}
	}
	public static void DFS(Graph g) {
		boolean[] visited = new boolean[g.V];
		for(int i = 0; i < g.V; i++) {
			if(!visited[i]) {
				DFSUtil(g, i, visited);
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		int v = 4;
		Graph g = new Graph(v);
	       g.addEdge(0, 1);
	       g.addEdge(0, 2);
	       g.addEdge(1, 2);
	       g.addEdge(2, 0);
	       g.addEdge(2, 3);
	       g.addEdge(3, 3);
	       g.printGraph();
	       System.out.println();
	       DFS(g);
	}
	
	static class Graph{
		List<Integer>[] list;
		int V;
		public Graph(int v) {
			V = v;
			list = new LinkedList[V];
			for(int i = 0; i < v; i++)
				list[i] = new LinkedList<Integer>();
		}
		public void addEdge(int src, int dest) {
			list[src].add(dest);
		}
		public void printGraph() {
			for(int i = 0; i < V; i++) {
				Iterator<Integer> iterator = list[i].iterator();
				while(iterator.hasNext()) {
					System.out.print(iterator.next() + " ");
				}
				System.out.println();
			}
		}
	}
}
