package gr8373.zhmaev.lab03;

import java.util.Iterator;
import gr8373.zhmaev.lab03.holder.Selector;

public class EvenSelector extends Select {
    Selector selector;

    public EvenSelector(Selector selector) {
        this.selector = selector;
    }

    public void setIterator(Iterator<Integer> iterator) {
        selector.setIterator(iterator);
    }

    public boolean hasNext() {
        if (selector.hasNext()) {
            selector.next();
        }
        return selector.hasNext();
    }

    public Integer next() {
        return selector.next();
    }

    public void remove() {
        selector.remove();
    }
}