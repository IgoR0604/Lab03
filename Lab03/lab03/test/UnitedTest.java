package gr8373.zhmaev.lab03.test;

import gr8373.zhmaev.lab03.ColumnFormatter;
import gr8373.zhmaev.lab03.DivisionProcessor;
import gr8373.zhmaev.lab03.EvenSelector;
import gr8373.zhmaev.lab03.OddSelector;
import gr8373.zhmaev.lab03.RowFormatter;
import gr8373.zhmaev.lab03.Select;
import gr8373.zhmaev.lab03.SqrProcessor;
import gr8373.zhmaev.lab03.holder.ArrayHolder;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import gr8373.zhmaev.lab03.holder.Formatter;
import gr8373.zhmaev.lab03.holder.Processor;
import gr8373.zhmaev.lab03.holder.Selector;

import java.util.*;

public class UnitedTest {

    public static void main(String[] args) {
        Selector selector;
        Processor processor=null; 
        Formatter formatter;
        
        TestRunner testRunner = new TestRunner();
        TestSuite testSuite = new TestSuite();
        testSuite.addTest(new JunitTest("testEvenSelector"));
        testSuite.addTest(new JunitTest("testOddSelector"));
        testSuite.addTest(new JunitTest("testDivisionProcessor"));
        testSuite.addTest(new JunitTest("testSqrProcessor"));
        testRunner.doRun(testSuite);

        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 9, 11);
        ArrayHolder arrayHolder = new ArrayHolder(data); 
        
        Scanner scannerSelector = new Scanner(System.in);  
        System.out.print("чет- 1, нечет- 2: ");
        int choiceSelector = scannerSelector.nextInt();
        switch (choiceSelector) {
        case 1:
            selector = new EvenSelector(new Select());
            arrayHolder.setSelector(selector);
            break;
        case 2:
            selector = new OddSelector(new Select());
            arrayHolder.setSelector(selector);
            break;
        }
        
        Scanner scannerProcessor = new Scanner(System.in);        
        System.out.print("деление на два- 1 ,возведение в квадрат- 2: ");
        int choiceProcessor = scannerProcessor.nextInt();
        switch (choiceProcessor) {
        case 1:
            processor = new DivisionProcessor();
            break;
        case 2:
            processor = new SqrProcessor();
            break;
        }
 
        Scanner scannerFormatter = new Scanner(System.in);
        System.out.print("row- 1,column- 2: ");
        int choiceFormatter = scannerFormatter.nextInt();
        switch (choiceFormatter) {
        case 1:
            formatter = new RowFormatter();
            arrayHolder.setFormatter(formatter);
            break;
        case 2:
            formatter = new ColumnFormatter();
            arrayHolder.setFormatter(formatter);
            break;
        }
        try{
        arrayHolder.process(processor);}catch (Exception e) {
            e = new NullPointerException();
            System.out.println("Неверный номер операции");
        }       
    }
}