package Patterns.Graph;

import java.util.*;

public class GrafDemo {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("Витебск");
        graph.addVertex("Минск");
        graph.addVertex("Брест");
        graph.addVertex("Гродно");
        graph.addVertex("Гомель");
        graph.addVertex("Могилев");
        graph.addEdge("Витебск", "Минск");
        graph.addEdge("Минск", "Брест");
        graph.addEdge("Минск", "Гродно");
        graph.addEdge("Минск", "Гомель");
        graph.addEdge("Минск", "Могилев");
        graph.addEdge("Витебск", "Могилев");
        graph.addEdge("Витебск", "Гомель");
        graph.depthFirstTraversal(graph,"Витебск");
    }
}

class Vertex {
    String label;
    Vertex(String label) {
        this.label = label;
    }

    // equals and hashCode
}

class Graph {
    private Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();

    // standard constructor, getters, setters
    void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    void addEdge(String label1, String label2) {
        Vertex v1 = adjVertices.keySet().stream()
                .filter(vertex -> vertex.equals(label1))
                .findFirst()
                .orElse(null);

        Vertex v2 = adjVertices.keySet().stream()
                .filter(vertex -> vertex.equals(label2))
                .findFirst()
                .orElse(null);

        if (v1 != null && v2 != null) {
            adjVertices.get(v1).add(v2);
            adjVertices.get(v2).add(v1);
        }
    }

    List<Vertex> getAdjVertices(String label) {
        return adjVertices.get(new Vertex(label));
    }

    Set<String> depthFirstTraversal(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            System.out.println(vertex);
            if (!visited.contains(vertex)) {
                System.out.println("hi");
                visited.add(vertex);

                for (Vertex v : graph.getAdjVertices(vertex)) {
                    System.out.println(v);
                    stack.push(v.label);
                }
            }
        }
        return visited;
    }
}
 class GraphIterrator implements Iterator{

     @Override
     public boolean hasNext() {
         return false;
     }

     @Override
     public Object next() {
         return null;
     }
 }
