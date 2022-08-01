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

    @Test
    public void testCopy(){
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

        SinglyLinkedList<Integer> actual = new SinglyLinkedList<Integer>();
        actual = sll.copy();

        Assert.assertNotEquals(actual, sll);
        Assert.assertEquals(actual.get(3), sll.get(3));
        Assert.assertEquals(actual.get(15), sll.get(15));
    }

    @Test
    public void testSort1(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(3);
        sll.add(4);
        sll.add(6);
        sll.add(2);
        sll.add(5);

        SinglyLinkedList<Integer> sorted = new SinglyLinkedList<Integer>();
        sorted = sll.sort();

        Assert.assertEquals(sorted.get(5), 6);
    }

    @Test
    public void testSort2() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(41);
        sll.add(2);
        sll.add(37);
        sll.add(4);
        sll.add(35);
        sll.add(64);
        sll.add(11);
        sll.add(221);
        sll.add(31);
        sll.add(41);
        sll.add(15);
        sll.add(16);

        SinglyLinkedList<Integer> sorted;
        sorted = sll.sort();

        Assert.assertEquals(sorted.get(2), 11);
    }

    @Test
    public void testSort3(){
        SinglyLinkedList<String> sll = new SinglyLinkedList<String>();
        sll.add("aaa");
        sll.add("aae");
        sll.add("aad");
        sll.add("aaf");
        sll.add("aab");
        sll.add("aac");
        SinglyLinkedList<String> sorted;
        sorted = sll.sort();

        Assert.assertEquals(sorted.get(2), "aac");
    }

    @Test
    public void testReverse1(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);

        SinglyLinkedList<Integer> reversed;
        reversed = sll.reverse();

        Assert.assertEquals(reversed.get(5), 1);
    }

    @Test
    public void testReverse2(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);

        SinglyLinkedList<Integer> reversed;
        reversed = sll.reverse();

        Assert.assertEquals(reversed.get(0),6);
    }

    @Test
    public void testSubString(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);

        SinglyLinkedList<Integer> subs;
        subs = sll.subString(2, 4);

        Assert.assertEquals(subs.get(0),3);
        Assert.assertEquals(subs.get(1),4);
    }

}
