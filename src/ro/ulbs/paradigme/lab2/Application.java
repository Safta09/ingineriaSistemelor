package ro.ulbs.paradigme.lab2;

import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;

public class Application {
    public static void main(String[] args) {
        // Lista simplu înlănțuită
        SimpleChainedList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) {
            simpleList.addValue(i);
        }
        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);
        System.out.println("Simple list:");
        simpleList.listNodes();
        System.out.println("Sum of values in simple list: " + simpleList.sumValues());
        System.out.println("Simple list is sorted: " + simpleList.isSorted());

        // Lista dublu înlănțuită
        DoubleChainedList doubleList = new DoubleChainedList();
        for (int i = 1; i <= 10; i++) {
            doubleList.addValue(i);
        }
        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);
        System.out.println("Double list:");
        doubleList.listNodes();
        System.out.println("Sum of values in double list: " + doubleList.sumValues());
        System.out.println("Double list is sorted: " + doubleList.isSorted());
    }
}
