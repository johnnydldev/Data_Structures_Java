package List;

import List.LinkedList.LinkedList;
import List.LinkedList.LinkedListOrdered;
import List.LinkedList.LinkedListUnordered;

public class TestLinkedList {

    public static void main(String[] args){
        LinkedList<Integer> scores = new LinkedListUnordered<Integer>();

        scores.insert(4);
        scores.insert(3);
        scores.insert(9);
        scores.insert(6);
        scores.insert(9);
        scores.insert(2);
        scores.insert(15);
        scores.insert(20);

        System.out.println("The list size is: "+scores.size()+" The values are:");
        scores.printValues();

        System.out.println("\nThe list indexes are:");
        scores.printIndexes();

        scores.remove(0);
        System.out.println("\nThe list size is: "+scores.size()+" The values are:");
        scores.printValues();

        scores.indexOf(6);

        scores.remove(6);
        System.out.println("\nThe list size is: "+scores.size()+" The values are:");
        scores.printValues();
        //scores.printIndexes();

        scores.remove(3);
        System.out.println("\nThe list size is: "+scores.size()+" The values are:");
        scores.printValues();
        scores.edit(2, 20);

        System.out.println();
        scores.printValues();

        scores.get(2);

        System.out.println(scores.isEmpty());

    }//End main method

}//End test linked list
