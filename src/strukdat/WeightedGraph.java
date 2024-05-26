package strukdat;

import java.util.*;

class Edge<T> { 
    T neighbor; // connected vertex
    int weight; // weight

    // Constructor, Time O(1) Space O(1)
    public Edge(T v, int w) {
        this.neighbor = v; 
        this.weight = w;
    }

    // Time O(1) Space O(1)
    @Override
    public String toString() {
        return neighbor + "; " + weight;
    }

    public T getNeighbor(){
		return neighbor;
	}
}

public class WeightedGraph<T> { 
    private Map<T, SingleList<Edge<T>>> adj;
    boolean directed;

    // Constructor, Time O(1) Space O(1)
    public WeightedGraph(boolean type) { 
        adj = new HashMap<>();
        directed = type; // false: undirected, true: directed
    }

    // Add edges including adding nodes, Time O(1) Space O(1)
    public void addEdge(T a, T b, int w) {
        adj.putIfAbsent(a, new SingleList<>()); // add vertex
        adj.putIfAbsent(b, new SingleList<>()); // add vertex
        Edge<T> edge1 = new Edge<>(b, w);
        adj.get(a).pushQ(edge1); // add edge
        if (!directed) { // undirected
            Edge<T> edge2 = new Edge<>(a, w);
            adj.get(b).pushQ(edge2);
        }            
    }

    // Print graph as hashmap, Time O(V+E), Space O(1)
    public void printJarak() {
        for (T key: adj.keySet()) {
            System.out.print(key.toString() + " :"); System.out.println();
            SingleList<Edge<T>> thelist = adj.get(key);
            Node<Edge<T>> curr = thelist.head;
            while(curr != null) {
                System.out.print("-"+curr.data+" km");
                curr = curr.next;
                System.out.println();
            }
            System.out.println();
        }
    }

    // DFS 
    public void dfsTraversal(T key) {
        if (!adj.containsKey(key)) // invalid input
            return;
        HashMap<T, Boolean> visited = new HashMap<>();
        helper(key, visited);
        System.out.println();
    }

    // DFS helper
    private void helper(T v, HashMap<T, Boolean> visited) {
        visited.put(v, true);
        System.out.print(v.toString() + " ");
        
        SingleList<Edge<T>> edges = adj.get(v);
        Node<Edge<T>> curr = edges.head;
    
        while (curr != null) {
            Edge<T> edge = curr.data;
            T neighbor = edge.neighbor;
            if (visited.get(neighbor) == null) {
                helper(neighbor, visited);
            }
            curr = curr.next;
        }
    }

    // BFS
    public void bfsTraversal(T key) {
        if (!adj.containsKey(key)) // invalid input
            return;
        Queue<T> q = new LinkedList<>(); 
        HashMap<T, Boolean> visited = new HashMap<>(); 
        q.add(key); 
        visited.put(key, true); 
        while (!q.isEmpty()) { 
            T v = q.poll(); 
            System.out.print(v.toString() + " ");        
    
            SingleList<Edge<T>> edges = adj.get(v);
            Node<Edge<T>> curr = edges.head;
    
            while (curr != null) {
                Edge<T> edge = curr.data;
                T neighbor = edge.neighbor;
                if (visited.get(neighbor) == null) { 
                    q.add(neighbor); 
                    visited.put(neighbor, true); 
                }
                curr = curr.next;
            }
        } 
        System.out.println(); 
    }

    public void deleteEdge(T a, T b) {
		SingleList<Edge<T>> allEdgeA = adj.get(a);

		int searchIndex = 0;
		Edge<T> deleteEdgeA = allEdgeA.get(searchIndex);
		while(deleteEdgeA.getNeighbor() != b && deleteEdgeA != null) {
			searchIndex++;
			deleteEdgeA = allEdgeA.get(searchIndex);
		}
		if(deleteEdgeA == null) {
			return;
		}
		adj.get(a).remove(deleteEdgeA);
            
		if (!directed) { //undirected
			SingleList<Edge<T>> allEdgeB = adj.get(b);

			searchIndex = 0;
			Edge<T> deleteEdge = allEdgeB.get(searchIndex);
			while(deleteEdge.getNeighbor() != a && deleteEdge != null) {
				searchIndex++;
				deleteEdge = allEdgeB.get(searchIndex);
			}
			if(deleteEdge == null) {
				return;
			}
			
			adj.get(b).remove(deleteEdge);
		}
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void jarakTerpendek(T start, T target) { 
        Map<T, Integer> res = new HashMap<>(); 
        PriorityQueue<Map.Entry<T, Integer>> pq = new PriorityQueue<>((a, b) -> (int) (a.getValue() - b.getValue()));           
        Map<T, T> previous = new HashMap<>();

        for (T key : adj.keySet()) 
            res.put(key, Integer.MAX_VALUE);
        pq.offer(new AbstractMap.SimpleEntry(start, 0)); 
        res.put(start, 0); 
        while (!pq.isEmpty()) { 
            T u = pq.poll().getKey(); 
            if (u.equals(target)) break; // Stop when the target is reached
            SingleList<Edge<T>> thelist = adj.get(u);
            Node<Edge<T>> curr = thelist.head;
            while (curr != null) {
                T v = curr.data.neighbor;
                int weight = curr.data.weight; 
                if (res.get(v) > res.get(u) + weight) { 
                    res.put(v, res.get(u) + weight); 
                    pq.offer(new AbstractMap.SimpleEntry(v, res.get(v))); 
                    previous.put(v, u);
                }
                curr = curr.next; 
            }
        }

        if (res.get(target) == Integer.MAX_VALUE) {
            System.out.println("No path from " + start + " to " + target);
        } else {
            System.out.println("Jarak Terdekat dari [" + start + "] ke [" + target + "] dengan jarak " + res.get(target) + " km :");
            printPath(target, previous);
            System.out.println();
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void hargaTermurah(T start, T target) { 
        Map<T, Integer> res = new HashMap<>(); 
        PriorityQueue<Map.Entry<T, Integer>> pq = new PriorityQueue<>((a, b) -> (int) (a.getValue() - b.getValue()));           
        Map<T, T> previous = new HashMap<>();

        for (T key : adj.keySet()) 
            res.put(key, Integer.MAX_VALUE);
        pq.offer(new AbstractMap.SimpleEntry(start, 0)); 
        res.put(start, 0); 
        while (!pq.isEmpty()) { 
            T u = pq.poll().getKey(); 
            if (u.equals(target)) break; // Stop when the target is reached
            SingleList<Edge<T>> thelist = adj.get(u);
            Node<Edge<T>> curr = thelist.head;
            while (curr != null) {
                T v = curr.data.neighbor;
                int weight = curr.data.weight; 
                if (res.get(v) > res.get(u) + weight) { 
                    res.put(v, res.get(u) + weight); 
                    pq.offer(new AbstractMap.SimpleEntry(v, res.get(v))); 
                    previous.put(v, u);
                }
                curr = curr.next; 
            }
        }

        if (res.get(target) == Integer.MAX_VALUE) {
            System.out.println("No path from " + start + " to " + target);
        } else {
            System.out.println("Biaya Termurah dari [" + start + "] ke [" + target + "] dengan harga Rp " + res.get(target) + "  :");
            printPath(target, previous);
            System.out.println();
        }
    }

    public void printPath(T target, Map<T, T> previous) {
        SingleList<T> path = new SingleList<>();
        T node = target;
        while (node!= null) {
            path.pushS(node);
            node = previous.get(node);
        }
        path.cetakList();
    }

}
