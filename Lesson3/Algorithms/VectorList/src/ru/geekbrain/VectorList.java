package ru.geekbrain;
import java.util.Iterator;
public class VectorList<E> implements Iterable<E> {
    private Node<E> node = null;
    private int counter = 0;

    public VectorList(){
        node = new Node<>();
    }

    public int size(){
        return  counter;
    }
    public void add(E element){
        if (counter == 0){    // первый узел надо обработать отдельно, иначе в первом узле элемент будет балластом
            node.set(element);
        }
        else{
            node.add(element);
        }
        counter++;             // увеличим счетчик элементов
    }
    @Override
    public Iterator<E> iterator() {
        return new VectorIterator(node);
    }
// Узел с элементом, сделан внутренним, чтобы не светить его наружу
    private class Node<E>{
        private E element;
        private Node<E> next = null;

        Node(){}
        Node(E element){
            set(element);
        }
        void set(E element){
            this.element = element;
        }
        void add(E element){
            if (isNext()){                      // если существует следующий узел, передадим ему эстафету
                next.add(element);
            }
            else{                               // иначе создадим следующий узел
                next = new Node<>(element);
            }
        }
        E get(){
            return element;
        }
        boolean isNext(){
            return next != null;
        }
    }
// Итератор, светить наружу его тоже не хочется, он слишком специфичный.
    private class VectorIterator implements Iterator<E>{
        private Node<E> current;
        private boolean isFirst = true;     // первый узел надо обработать отдельно
        VectorIterator(Node<E> node){
            current = node;
        }
        @Override
        public boolean hasNext() {
            if (counter == 1 && isFirst) return true;   // отдельно обработать один элемент (потому как у него нет next)
            return current.isNext();
        }
        @Override
        public E next() {
            if (isFirst) isFirst = false;
            else current = current.next;
            return current.get();
        }
    }
}
