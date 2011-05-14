package gr8373.zhmaev.lab03;

import java.util.Collection;
import java.util.Iterator;

import gr8373.zhmaev.lab03.holder.Formatter;

public class RowFormatter implements Formatter {
  
    public void out(Collection<Integer> data) {
        Iterator<Integer> iterator = data.iterator();
        System.out.println("Новый массив:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }
}
