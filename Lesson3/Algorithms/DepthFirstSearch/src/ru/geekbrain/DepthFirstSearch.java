package ru.geekbrain;

import java.util.*;
import java.util.function.Function;

public class DepthFirstSearch {
    private Collection<NodeHead> visited;   // пройденные вершины
    private Stack<NodeHead> path;           // Здесь будем накапливать пройденный путь (не считая возвраты)
    private boolean isFound;                // признак того, что еще не нашли
    private Node graph;                     // вершина графа, от которой будем искать путь

    public DepthFirstSearch(Node graph) {
        this.graph = graph;
    }

    // id - идентиикатор целевой вершины
    public Collection<NodeHead> getPath(int id){
        visited = new ArrayList<>();
        isFound = false;
        path = new Stack<>();
        search(graph, n -> n.getId() == id);
        return path;
    }

    private void search(Node node, Function<NodeHead, Boolean> comparer){
        if (isFound) return;        // Цель достигнута -> дальнейший поиск бессмысленен
        path.push(node.getHead());  // в стек текущую вершину
        visited.add(node.getHead());
        for(Node edge: node.getNodes()){
            // ищем непройденную вершину
            if (visited.contains((edge.getHead()))) continue;
            // здесь edge = непройденной вершине
            if (comparer.apply(edge.getHead())){    // Критерий поиска
                // нашли, взведем флажок, что поиск закончен, вставим цель в стек, и будем выходить.
                isFound = true;
                path.push(edge.getHead());
                return;
            }
            // Искомую вершину не нашли, продолжим поиск от следующей вершины
            search(edge, comparer);
            if (isFound) return;
            path.pop();
        }
    }
}
