package ru.geekbrain;

import java.util.*;

public class Node implements Comparable<Node>{
    private Collection<Node> nodes;
    private NodeHead head;

    public Node(int id, String name){
        head = new NodeHead(id, name);
        nodes = new ArrayList<>();
    }

    public Node(int id, String name, Node... nodes){
        this(id, name);
        for(Node node: nodes){
            this.nodes.add(node);
        }
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public Collection<Node> getNodes(){
        return nodes;
    }

    public NodeHead getHead() {
        return head;
    }

    @Override
    public int compareTo(Node o) {
        int thisId = this.getHead().getId();
        int thatId = o.getHead().getId();
        return thisId - thatId;
    }
}