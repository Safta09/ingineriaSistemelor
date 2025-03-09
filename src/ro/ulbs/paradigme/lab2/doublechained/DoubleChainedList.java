package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.MyList;
import ro.ulbs.paradigme.lab2.api.Node;

public class DoubleChainedList implements MyList {
    private DoubleChainedNode head;

    @Override
    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode();
        newNode.setValue(value);
        if (head == null) {
            head = newNode;
        } else {
            DoubleChainedNode current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
            newNode.setPrevNode(current);
        }
    }

    @Override
    public void listNodes() {
        DoubleChainedNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }

    @Override
    public Node getNodeByValue(int value) {
        DoubleChainedNode current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public void removeNodeByValue(int value) {
        if (head == null) return;

        if (head.getValue() == value) {
            head = head.getNextNode();
            if (head != null) head.setPrevNode(null);
            return;
        }

        DoubleChainedNode current = head;
        while (current.getNextNode() != null && current.getNextNode().getValue() != value) {
            current = current.getNextNode();
        }

        if (current.getNextNode() != null) {
            current.setNextNode(current.getNextNode().getNextNode());
            if (current.getNextNode() != null) {
                current.getNextNode().setPrevNode(current);
            }
        }
    }

    @Override
    public boolean isSorted() {
        DoubleChainedNode current = head;
        while (current != null && current.getNextNode() != null) {
            if (current.getValue() > current.getNextNode().getValue()) {
                return false;
            }
            current = current.getNextNode();
        }
        return true;
    }

    @Override
    public int sumValues() {
        int sum = 0;
        DoubleChainedNode current = head;
        while (current != null) {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }
}
