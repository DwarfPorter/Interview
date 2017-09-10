package ru.geekbrain;

import java.util.*;
import java.util.function.Function;

public class BreathFirstSearch {


    private Node graph;

    public BreathFirstSearch(Node graph){
        this.graph = graph;
    }

    public Collection<NodeHead> getPath(int id){
        return search(graph, n -> n.getId() == id);
    }

    private Stack<NodeHead> search(Node node, Function<NodeHead, Boolean> comparer){
        Collection<NodeHead> visited = new ArrayList<>();
        Queue<Node> toVisit = new PriorityQueue<>();
        Stack<NodeHead> path = new Stack<>();

        toVisit.offer(node);
        visited.add(node.getHead());
        path.push(node.getHead());
        while (toVisit.size() > 0){
            Node curNode = toVisit.poll();
            if (comparer.apply(curNode.getHead())) {
                return path;
            }
            for(Node child: curNode.getNodes()){
                if (!visited.contains(child.getHead())){
                    visited.add(child.getHead());
                    toVisit.offer(child);
                    path.push(child.getHead());
                }
            }
           // path.pop();
        }
        return path;
    }
}
