package in.susmitha.design.linkedlist.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import in.susmitha.design.linkedlist.model.LinkedList;



class LinkedListApplicationTest {

    @Test
    public void testCaseInput(){
        int arr[] = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }
        LinkedList.Iterator iterator = list.iterator();

        Assertions.assertEquals(iterator.hasNext(),true);
        Assertions.assertEquals(iterator.next(),1);
        Assertions.assertEquals(iterator.next(),2);
        Assertions.assertEquals(iterator.next(),3);
        Assertions.assertEquals(iterator.next(),4);
        Assertions.assertEquals(iterator.next(),5);
        Assertions.assertEquals(iterator.hasNext(),false);


    }
    @Test
    public void testCaseInputAtBeginning(){
        int arr[] = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtBeginning(element);
        }
        LinkedList.Iterator iterator = list.iterator();

        Assertions.assertEquals(iterator.hasNext(),true);
        Assertions.assertEquals(iterator.next(),5);
        Assertions.assertEquals(iterator.next(),4);
        Assertions.assertEquals(iterator.next(),3);
        Assertions.assertEquals(iterator.next(),2);
        Assertions.assertEquals(iterator.next(),1);
        Assertions.assertEquals(iterator.hasNext(),false);
    }

    @Test
    public void testCaseDelete(){
        int[] arr = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }
        list.deleteFront();
        LinkedList.Iterator iterator = list.iterator();
        Assertions.assertEquals(iterator.next(),2);
        Assertions.assertEquals(list.deleteEnd(),true);
    }
    @Test
    public void testCaseInputAtGivenPosition(){
        int arr[] = {1,2,4};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }
        list.insertAtGivenPosition(3,3);
        LinkedList.Iterator iterator = list.iterator();

        Assertions.assertEquals(iterator.hasNext(),true);
        Assertions.assertEquals(iterator.next(),1);
        Assertions.assertEquals(iterator.next(),2);
        Assertions.assertEquals(iterator.next(),3);
        Assertions.assertEquals(iterator.next(),4);
        Assertions.assertEquals(iterator.hasNext(),false);
    }



    @Test
    public void testCaseSearchAndSize(){
        int[] arr = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }

        Assertions.assertEquals(list.check(3),true);
        Assertions.assertEquals(list.check(8),false);
        Assertions.assertEquals(list.getSize(),5);

    }
    @Test
    public void testCaseReverse(){

        int[] arr = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }
        list.reverse();
        LinkedList.Iterator iterator = list.iterator();
        Assertions.assertEquals(iterator.hasNext(),true);
        Assertions.assertEquals(iterator.next(),5);
        Assertions.assertEquals(iterator.next(),4);
        Assertions.assertEquals(iterator.next(),3);
        Assertions.assertEquals(iterator.next(),2);
        Assertions.assertEquals(iterator.next(),1);
        Assertions.assertEquals(iterator.hasNext(),false);

    }
}

