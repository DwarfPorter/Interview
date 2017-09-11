package ru.geekbrain;

import java.util.*;
import java.util.function.Function;

public class BreathFirstSearch {

    private Node graph;

    public BreathFirstSearch(Node graph){
        this.graph = graph;
    }

    public Collection<NodeHead> getPath(int id){
        Map<NodeHead, NodeHead> pathMap = search(graph, n -> n.getId() == id);      // Собственно поиск
        // Ищем целевую вершину по входнму id
        Set<NodeHead> keys = pathMap.keySet();
        Optional<NodeHead> finish = keys.stream().filter(n -> n.getId() == id).findFirst();
        if (!finish.isPresent()) throw new NoSuchElementException(Integer.toString(id)); // Если ее нет, то и пути нет
        // целевую вершину в путь
        NodeHead stepLast = finish.get();
        List<NodeHead> path = new ArrayList<>();    // А путь будет реверсным (раскручиваем его с конца)
        while(stepLast.getId() != 0){
            path.add(stepLast);
            stepLast = pathMap.get(stepLast);   // Предыдущая вершина
        }
        Collections.reverse(path); // А тут путь просто реверснем, и получим правильный путь
        return path;
    }

    private Map<NodeHead, NodeHead> search(Node node, Function<NodeHead, Boolean> comparer){
        Collection<NodeHead> visited = new ArrayList<>();
        // Очередь, используется для поиска в ширину, вносим вершишны в очередь, и вытаскиваем их из другого конца
        // Так последовательрно и обрабатываем
        Queue<Node> toVisit = new PriorityQueue<>();
        // Путь, первый парааметр - вершина, второй параметр, из какой вершины пришли
        Map<NodeHead, NodeHead> pathMap = new HashMap<>();

        // Добавим в очередь входную вершину
        toVisit.offer(node);
        // Пометим входную вершину, как посещенную
        visited.add(node.getHead());
        // Добавим входную вершину в путь, поскольку она входная, то предыдущая вершина будет пустой
        pathMap.put(node.getHead(), NodeHead.getEmpty());
        while (toVisit.size() > 0){
            Node curNode = toVisit.poll();
            if (comparer.apply(curNode.getHead())) {        // Нашли, то что искали
                return pathMap;
            }
            // Отправляем в очередь все смежные вершины
            for(Node child: curNode.getNodes()){
                if (!visited.contains(child.getHead())){    // Но только те, которые не посещали
                    visited.add(child.getHead());           // Выставим признак, что в вершине были
                    toVisit.offer(child);                   // В очередь обработки
                    pathMap.put(child.getHead(), curNode.getHead()); // В карту пути
                }
            }
        }
        return pathMap;
    }
}
