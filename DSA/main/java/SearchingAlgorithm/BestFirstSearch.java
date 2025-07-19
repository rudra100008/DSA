package SearchingAlgorithm;

import java.util.*;

public class BestFirstSearch {

    static class Node{
        String name;
        int heuristic; // Estimate cost to goal
        List<Edge> neighbors; // list of edge representing connected node eg A-> B, A-> C with cost
        Node parent; // reference to previous node
        public Node(String name,int heuristic){
            this.name = name;
            this.heuristic = heuristic;
            neighbors = new ArrayList<>();
            parent = null;
        }

        public void addNeighbor(Node target,int cost){
            neighbors.add(new Edge(target,cost));
        }
    }

    static class  Edge{
        Node target;
        int cost;
        public Edge(Node target,int cost){
            this.target = target;
            this.cost = cost;
        }
    }


    public static List<Node> bestFirstSearch(Node start, Node goal){
        PriorityQueue<Node> openSet = new PriorityQueue<>(
                Comparator.comparingInt(node-> node.heuristic)
        );
        Set<Node> closedSet = new HashSet<>();
        openSet.add(start);
        while(!openSet.isEmpty()){
            Node current = openSet.poll();

            if(current == goal){
                return  reconstructPath(goal);
            }
            closedSet.add(current);

            for (Edge edge  : current.neighbors){
                Node neighbor = edge.target;
                if(closedSet.contains(neighbor)){
                    continue;
                }

                if(!openSet.contains(neighbor)){
                    neighbor.parent = current;
                    openSet.add(neighbor);
                }
            }
        }
        return Collections.emptyList();
    }

    private static List<Node> reconstructPath(Node goal){
        List<Node> path = new ArrayList<>();
        Node current  = goal;
        while(current != null){
            path.add(current);
            current = current.parent;
        }
         Collections.reverse(path);
        return  path;
    }
    public static void main(String[] args) {
        Node a = new Node("A", 10);
        Node b = new Node("B", 8);
        Node c = new Node("C", 5);
        Node d = new Node("D", 7);
        Node e = new Node("E", 3);
        Node f = new Node("F", 6);
        Node g = new Node("G", 5);
        Node h = new Node("H", 3);
        Node i = new Node("I", 1);
        Node j = new Node("J", 0);


        a.addNeighbor(b, 1);
        a.addNeighbor(c, 1);
        b.addNeighbor(d, 1);
        b.addNeighbor(e, 1);
        c.addNeighbor(f, 1);
        c.addNeighbor(g, 1);
        d.addNeighbor(h, 1);
        e.addNeighbor(i, 1);
        f.addNeighbor(j, 1);
        g.addNeighbor(j, 1);
        h.addNeighbor(j, 1);
        i.addNeighbor(j, 1);


        List<Node> path = bestFirstSearch(b,j);
        if(path.isEmpty()){
            System.out.println("No path found.");
        }
        else{
            System.out.println("Path found");
            for (Node node : path){
                System.out.println(node.name + " ");
            }
            System.out.println("\nTotal Cost: " + (path.size()-1));
        }

    }
}
