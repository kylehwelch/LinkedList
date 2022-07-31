package com.zipcodewilmington.singlylinkedlist;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinglyLinkedListTest {

    @Test
    public void testSetHead(){
        Node<Integer> n = new Node<Integer>(4);
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.setHead(n);

        Assert.assertEquals(n, sll.getHead());
    }
    @Test
    public void testAdd(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(5);
        int actual = sll.getHead().data;

        Assert.assertEquals(actual, 5);
    }

    @Test
    public void testFind(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        int actual = sll.find(6);

        Assert.assertEquals(actual, 5);
    }

    @Test
    public void testContainsFalse(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        boolean actual = sll.contains(7);

        Assert.assertEquals(actual, false);
    }

    @Test
    public void testContainsTrue(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        boolean actual = sll.contains(4);

        Assert.assertEquals(actual, true);
    }

    @Test
    public void testRemoveFalse(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        sll.remove(2); // removed int 3

        Assert.assertFalse(sll.contains(3));
    }

    @Test
    public void testRemoveTrue(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        sll.remove(2); // removed int 3

        Assert.assertTrue(sll.contains(4));
    }

    @Test
    public void testSize1(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        int actual = sll.size();

        Assert.assertEquals(actual, 6);
    }

    @Test
    public void testSize2(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        sll.add(11);
        sll.add(21);
        sll.add(31);
        sll.add(41);
        sll.add(15);
        sll.add(16);
        int actual = sll.size();

        Assert.assertEquals(actual, 12);
    }

    @Test
    public void testGet1(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        sll.add(11);
        sll.add(21);
        sll.add(31);
        sll.add(41);
        sll.add(15);
        sll.add(16);
        int actual = sll.get(1);

        Assert.assertEquals(actual, 2);
    }

    @Test
    public void testGet2(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        sll.add(11);
        sll.add(21);
        sll.add(31);
        sll.add(41);
        sll.add(15);
        sll.add(16);
        int actual = sll.get(8);

        Assert.assertEquals(actual, 31);
    }
}
