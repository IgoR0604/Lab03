package gr8373.zhmaev.lab03;

import gr8373.zhmaev.lab03.holder.Selector;

import java.util.Iterator;

public class OddSelector extends Select {
    Boolean firstNext = true;
    Boolean firstHasNext = true;
    Selector selector;

    public OddSelector(Selector selector) {
        this.selector = selector;
    }

    public void setIterator(Iterator<Integer> iterator) {
        selector.setIterator(iterator);

    }

    public boolean hasNext() {
        if (firstHasNext == true) {
            firstHasNext = false;
            return selector.hasNext();
        }
        else {
            if (selector.hasNext()) {
                selector.next();
            }
            return selector.hasNext();
        }
        
        
    }
    public Integer next() {
            return selector.next();
        
    }

    public void remove() {
        selector.remove();
    }
}
