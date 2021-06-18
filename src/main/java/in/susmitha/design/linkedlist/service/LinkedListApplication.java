package in.susmitha.design.linkedlist.service;


import in.susmitha.design.linkedlist.model.LinkedList;

public class LinkedListApplication {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int element : arr){
            list.insertAtEnd(element);
        }
        System.out.println(list.deleteFront());
        list.print();
        System.out.println(list.deleteEnd());
        list.print();
        list.insertAtBeginning(11);
        list.print();
    }
}
