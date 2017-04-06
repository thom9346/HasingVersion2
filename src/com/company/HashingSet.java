package com.company;

/**
 * Created by liseh on 23-03-2017.
 */
public class HashingSet {

    private int[] array = new int[10];
    private Node[] nodeArray = new Node[101];

    public boolean add(int tal) {


        //indsætte værdien i et array, HVIs det ikke findes i forvejen


        int length = array.length;
        int index = tal % length;

        if(array[index] == 0) { //if the index is empty, do this:
        array[index] = tal;
            System.out.println("på plads " + index + " er tallet " + tal);
        return true;
        }
        System.out.println("index already in user");
        return false;
    }

    public boolean addSeperateChaining(int number) {

        int index = number % nodeArray.length;
        Node front = nodeArray[index];


        if(front==null) {
            front = new Node(number);
        }

        else {
            Node current = front;
            while(current.next != null){
                if(current.value == number) {
                    return false;
                }
                current = current.next;
            }

            current.next = new Node(number);

        }
        System.out.println("returned true");
        return true;
    }
    public String toStringA(){

        //løb igennem array
        // 2. løb igennem hver linkedlist som hører til hver position i arrayet


        for (int i = 0; i < array.length; i++) {
            System.out.println("på index " + i + " er tallet " + array[i]);

        }

        return "";
    }
}
