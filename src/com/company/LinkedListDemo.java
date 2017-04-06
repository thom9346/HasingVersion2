package com.company;

/**
 * Created by liseh on 23-03-2017.
 */
public class LinkedListDemo {

    private Node front;

    public void add(int number) {
        if(front==null) {
            front = new Node(number);
        }
        else {
            Node current = front;
            while(current.next != null){
                current = current.next;
            }

            current.next = new Node(number);

        }
    }

}
