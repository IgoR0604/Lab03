package gr8373.zhmaev.lab03.test;

import gr8373.zhmaev.lab03.DivisionProcessor;
import gr8373.zhmaev.lab03.EvenSelector;
import gr8373.zhmaev.lab03.OddSelector;
import gr8373.zhmaev.lab03.Select;
import gr8373.zhmaev.lab03.SqrProcessor;
import gr8373.zhmaev.lab03.holder.Processor;
import gr8373.zhmaev.lab03.holder.Selector;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class JunitTest extends TestCase {
    public JunitTest(String testName) {
        super(testName);
    }
    public void testEmptyArray() {
        List<Integer> array = Arrays.asList();
        Selector evenSelector = new EvenSelector(new Select());
        evenSelector.setIterator(array.iterator());
        assertTrue(evenSelector.hasNext()== false);
        Selector oddSelector = new OddSelector(new Select());
        oddSelector.setIterator(array.iterator());
        assertTrue(oddSelector.hasNext()== false);
    }
    public void testOneElement() {
        List<Integer> array = Arrays.asList(1);
        Selector evenSelector = new EvenSelector(new Select());
        evenSelector.setIterator(array.iterator());
        assertTrue(evenSelector.hasNext()== false);
        Selector oddSelector = new OddSelector(new Select());
        oddSelector.setIterator(array.iterator());
        assertTrue(oddSelector.hasNext()== true);
        assertTrue(oddSelector.next() == 1);
        assertTrue(oddSelector.hasNext()== false);
    }    
    public void testEvenSelector(){
        List<Integer> array = Arrays.asList(1,2,3,4,5,6);
        Selector evenSelector = new EvenSelector(new Select());
        evenSelector.setIterator(array.iterator());
        assertTrue(evenSelector.hasNext()== true);
        assertTrue(evenSelector.next() == 2);
        assertTrue(evenSelector.hasNext()== true);
        assertTrue(evenSelector.next() == 4);
        assertTrue(evenSelector.hasNext()== true);
        assertTrue(evenSelector.next() == 6);
        assertTrue(evenSelector.hasNext()== false);
    }
    public void testOddSelector(){
        List<Integer> array = Arrays.asList(1,2,3,4,5,6);
        Selector oddSelector = new OddSelector(new Select());
        oddSelector.setIterator(array.iterator());
        assertTrue(oddSelector.hasNext()== true);
        assertTrue(oddSelector.next() == 1);
        assertTrue(oddSelector.hasNext()== true);
        assertTrue(oddSelector.next() == 3);
        assertTrue(oddSelector.hasNext()== true);
        assertTrue(oddSelector.next() == 5);
        assertTrue(oddSelector.hasNext()== false);
    }
    public void testDivisionProcessor() {
        Processor divisionProcessor = new DivisionProcessor();
        assertTrue(divisionProcessor.process(1)== 0);
        assertTrue(divisionProcessor.process(2)== 1);
        assertTrue(divisionProcessor.process(3)== 1);
        assertTrue(divisionProcessor.process(4)== 2);
        assertTrue(divisionProcessor.process(5)== 2);
        assertTrue(divisionProcessor.process(6)== 3);
    }
    public void testSqrProcessor() {
        Processor sqrProcessor = new SqrProcessor();
        assertTrue(sqrProcessor.process(0)== 0);
        assertTrue(sqrProcessor.process(1)== 1);
        assertTrue(sqrProcessor.process(2)== 4);
        assertTrue(sqrProcessor.process(3)== 9);
        assertTrue(sqrProcessor.process(4)== 16);
        assertTrue(sqrProcessor.process(5)== 25);
        assertTrue(sqrProcessor.process(6)== 36);
    }
}
