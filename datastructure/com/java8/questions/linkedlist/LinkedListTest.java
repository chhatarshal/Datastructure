package com.java8.questions.linkedlist;

public class LinkedListTest {

    public static void main(String args[]) {

        //creating LinkedList with 5 elements including head
        LinkedList linkedList = new LinkedList();
        linkedList.appendIntoTail(new LinkedList.Node("101"));
        linkedList.appendIntoTail(new LinkedList.Node("201"));
        linkedList.appendIntoTail(new LinkedList.Node("301"));
        linkedList.appendIntoTail(new LinkedList.Node("401"));
        linkedList.appendIntoTail(new LinkedList.Node("201"));

        System.out.println("Linked List : " + linkedList);

        if(linkedList.isCyclic()){
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        }else{
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }    

      //creating LinkedList with 5 elements including head
        linkedList = new LinkedList();
        linkedList.appendIntoTail(new LinkedList.Node("101"));
        LinkedList.Node cycle = new LinkedList.Node("201");
        linkedList.appendIntoTail(cycle);
        linkedList.appendIntoTail(new LinkedList.Node("301"));
        linkedList.appendIntoTail(new LinkedList.Node("401"));
        linkedList.appendIntoTail(cycle);
        
        if(linkedList.isCyclicB()){
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        }else{
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }    


    } 
   
}