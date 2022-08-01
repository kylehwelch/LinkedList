package com.zipcodewilmington.singlylinkedlist;

public class SinglyLinkedList<T extends Comparable<T>> {

    Node<T> head = null;
    Node<T> tail = null;

    public SinglyLinkedList(){
        head = null;
    }

    public Node<T> getHead(){
        return head;
    }

    public void setHead(Node<T> node){
        head = node;
    }

    public void add(T data){
        Node<T> node = new Node(data);
        Node<T> previous = null;
        if (head == null){
            head = node;
            return;
        }
        if (head.next == null) {
            head.next = node;
            return;
        }
        tail = head.next;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next= node;
    }

    public Integer find(T inputData){
        int index = 0;
         if (head == null) {
             return -1;
         }
         if (head.data == inputData || head.data.equals(inputData)) {
             return index;
         }
         Node<T> node = head.next;
         index = 1;
         while (node.data != inputData || !node.data.equals(inputData)) {
             if (node.next == null) {
                 index = -1;
                 break;
             }
             node = node.next;
             index++;
         }
        return index;
    }

    public boolean contains (T inputData) {
//        Node<T> current = head;
//        if (current.data == inputData) {
//            return true;
//        }
//        while (current.data != inputData || current.next != null) {
//            if (current.data == inputData) {
//                return true;
//            }
//            current = current.next;
//        }
//        return false;
        return this.find(inputData) > -1;
    }

    public void remove (Integer index) {
        Node<T> current = head;
        Node<T> previous = null;
        if (index == 0) {
            head = head.next;
            return;
        }
        int count = 0;
        while (current != null && count < index) {
            previous = current;
            current = current.next;
            count++;
        }
        previous.next = previous.next.next;
    }

    public Integer size (){
        return (this.find(tail.data) +2);
    }

    public T get(int index){
        Node<T> current = head;
        int count = 0;
        if (head == null) return null;
        while (current != null || count <= index) {
            if (count == index) {
                return current.data;
            }
            if (current.next == null) {
                count++;
                break;
            }
            current = current.next;
            count++;
        }
        return null;
    }

    public SinglyLinkedList<T> copy(){
        SinglyLinkedList<T> sllCopy = new SinglyLinkedList<>();
        for (Node <T> node = head ; node != null ; node = node.next) {
            sllCopy.add(node.data);
        }
        return sllCopy;
    }

    public SinglyLinkedList<T> sort() {
        T tmp;
        Node<T> current = head;
        Node<T> theNext;
        while (current != null) {
            theNext = current.next;
            while (theNext != null) {
                if (current.data.compareTo(theNext.data) > 0) {
                    tmp = current.data;
                    current.data = theNext.data;
                    theNext.data = tmp;
                }
                theNext = theNext.next;
            }
            current = current.next;
        }
        return this;
    }

    public SinglyLinkedList<T> reverse(){




        return this;
    }

}