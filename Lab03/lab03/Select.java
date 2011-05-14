package gr8373.zhmaev.lab03;

import gr8373.zhmaev.lab03.holder.Selector;

import java.util.Iterator;

public class Select implements Selector {

    private Iterator<Integer> iterator;

    public void setIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public Integer next() {
        return iterator.next();
    }

    public void remove() {
        iterator.remove();
    }

}
