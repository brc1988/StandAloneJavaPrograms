package com.practice.programs.dataStructures.linkedList;

/**
 *
 * @author choudhuryb
 */
public class MyLinkedList {

    private Node head;
    private Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    /**
     * this method inserts at beginning
     *
     * @param val
     */
    public void insertAtBeginning(int val) {

        Node tempNode = new Node(val, null);
        size++;

        //if no data is thr
        if (head == null) {
            head = tempNode;
            tail = tempNode;
        } else {
            tempNode.next = head;
            head = tempNode;
        }
    }

    /**
     * this method insert at end of list
     *
     * @param val
     */
    public void insert(int val) {

        Node tempNode = new Node(val, null);
        size++;
        //if no data is thr
        if (head == null) {
            insertAtBeginning(val);
        } else {
            tail.next = tempNode;
            tail = tempNode;
        }
    }

    /**
     *
     * @param val
     * @param pos : valid values 0 < pos <=size
     */
    public void insertAtPosition(int val, int pos) {
        Node nodeToBeInserted = new Node(val, null);
        Node counterNode = head;
        //check position is less than total size
        if (pos <= (size + 1) && pos > 0) {
            //if the position is starting position
            if (pos == 1) {
                insertAtBeginning(val);
            } else {
                for (int i = 1; i < size; i++) {
                    if (i == (pos - 1)) {
                        Node temp = counterNode.next;
                        counterNode.next = nodeToBeInserted;
                        nodeToBeInserted.next = temp;
                        break;
                    }
                    counterNode = counterNode.next;
                }
            }

        } else {
            System.out.println("Please provide valid position");
        }

    }

    /**
     * removes and returns first element
     *
     * @return
     */
    public Object remove() {
        Node removedNode;
        if (size == 0) {
            System.out.println("Linked list is empty !!! remove operation can't be performed");
            return null;
        } else {
            removedNode = head;
            head = head.next;
            size--;
            return removedNode.data;
        }
    }
/**
 * 
 * @param pos
 * @return 
 */
    public Object removeAtPosition(int pos) {
        Node removedNode = new Node();
        if (size == 0) {
            System.out.println("Linked list is empty !!! removeAtPosition operation can't be performed");
            return null;
        } else if (pos == 1) {
            return remove();
        } else {
            if (pos <= size) {
                Node counter = head;
                for (int i = 1; i <= size; i++) {
                    if (i == (pos - 1)) {
                        Node tempNode = counter;
                        removedNode = tempNode.next;
                        tempNode.next = removedNode.next;
                        break;
                    }
                    counter = counter.next;
                }
                size--;
                return removedNode.data;
            } else {
                System.out.println("Please provide valid position");
                return null;
            }
        }
    }
/**
 * 
 */
    public void display() {
        if (size == 0) {
            System.out.println("Linked list is empty!!!");
        } else {
            Node counter = head;
            while (counter != null) {
                System.out.print(counter.data + "->");
                counter = counter.next;
            }
        }
        System.out.println();
    }
}

class Node {

    Object data;
    Node next;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
