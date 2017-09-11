package ru.geekbrain;

import java.util.NoSuchElementException;

public class Main {

    //   1 ---- 2
    //   |      |
    //   3------4-----+
    //   |      |     |
    //   6      7-----5
    //
    public static void main(String[] args) {
        Node node7 = new Node(7, "Seventh");
        Node node6 = new Node(6, "Sixth");
        Node node5 = new Node(5, "Fifth", node7);
        node7.addNode(node5);
        Node node4 = new Node(4, "Fourth", node5, node7);
        node5.addNode(node4);
        node7.addNode((node4));
        Node node3 = new Node(3, "Third", node4, node6);
        node6.addNode(node3);
        node4.addNode(node3);
        Node node2 = new Node(2, "Second", node4);
        node4.addNode(node2);
        Node node1 = new Node(1, "First", node2, node3);
        node2.addNode(node1);
        node3.addNode(node1);

        BreathFirstSearch bfs = new BreathFirstSearch(node1);
        System.out.println("Path from First to Seventh");
        bfs.getPath(7).stream().forEach(n -> System.out.println(n.getName()));
        System.out.println("Path from First to Sixth");
        bfs.getPath(6).stream().forEach(n -> System.out.println(n.getName()));
        System.out.println("Path from First to ...");
        try {
            bfs.getPath(0).stream().forEach(n -> System.out.println(n.getName()));
        }
        catch (NoSuchElementException e){
            System.out.println("Not found");
        }
    }
}
