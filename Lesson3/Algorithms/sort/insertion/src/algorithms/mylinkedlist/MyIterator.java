package algorithms.mylinkedlist;

import java.util.Iterator;

public interface MyIterator<E> extends Iterator<E> {
    void reset();
    void insertBefore(E value);
    void insertAfter(E value);
}
