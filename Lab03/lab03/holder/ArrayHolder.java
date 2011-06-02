package gr8373.zhmaev.lab03.holder;

import java.util.*;

public class ArrayHolder {

    final private List<Integer> data;
   
    private Selector selector;
    private Processor processor;
    private Formatter formatter;
    
    

    public ArrayHolder(List<Integer> data) {
        this.data = new ArrayList<Integer>(data);
    }
    
    public List<Integer> getData() {
        return new ArrayList<Integer>(data);
    }
    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }
    public void setSelector(Selector selector) {
        this.selector=selector;
    }

    public void process(Processor processor) {
        this.processor = processor;
        List<Integer> result = new ArrayList<Integer>();
        selector.setIterator(data.iterator());
        while (selector.hasNext()) {
            int number = selector.next();
            result.add(this.processor.process(number));
        }
        formatter.out(result);
    }
}
