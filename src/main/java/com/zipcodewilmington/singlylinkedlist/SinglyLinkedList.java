package com.zipcodewilmington.singlylinkedlist;

public class SinglyLinkedList<T> {

    Node<T> head = null;

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
        if (head == null){
            head = node;
            return;
        }
        if (head.next == null) {
            head.next = node;
            return;
        }
        Node<T> tail = head.next;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail = node;
    }

    public Integer find(T input){
        int index = 0;
         if (head == null) {
             return -1;
         }
         if (head.data == input || head.data.equals(input)) {
             return index;
         }
         Node<T> node = head.next;
         index = 1;
         while (node.data != input || !node.data.equals(input)) {
             if (node.next == null) {
                 index = -1;
                 break;
             }
             node = node.next;
             index++;
         }
        return index;
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

    public boolean contains (T input) {
        boolean answer = false;
        Node<T> current = head;
        if (current.data == input) {
            return true;
        }
        while (current.data != input || current.next != null) {
            if (current.data == input) {
                answer = true;
                break;
            }
            current = current.next;
        }
        return answer;
    }
}
