package com.zipcodewilmington.singlylinkedlist;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinglyLinkedListTest {

    @Test
    public void testAdd(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(5);
        int actual = sll.getHead().data;

        Assert.assertEquals(5, actual);
    }

    @Test
    public void testSetHead(){
        Node<Integer> n = new Node<Integer>(4);
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.setHead(n);

        Assert.assertEquals(n, sll.getHead());
    }

}
