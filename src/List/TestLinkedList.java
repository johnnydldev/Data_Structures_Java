package List;

import List.LinkedList.LinkedList;
import List.LinkedList.LinkedListOrdered;
import List.LinkedList.LinkedListUnordered;

public class TestLinkedList {

    public static void main(String[] args){
        LinkedList<String> scores = new LinkedListUnordered<String>();

        scores.insert("Rogelio");
        scores.insert("Wanda");
        scores.insert("Andrea");
        scores.insert("Sergio");
        scores.insert("Orlando");
        scores.insert("Zaira");
        scores.insert("Benito");
        scores.insert("Alejandro");

        System.out.println("The list size is: "+scores.size()+" \nThe values are:");
        scores.printValues();

        //System.out.println("\nThe list indexes are:");
        //scores.printIndexes();

        scores.remove(4);

        System.out.println("\n\nThe list size is: "+scores.size()+" \nThe values are:");
        scores.printValues();
        System.out.println("\nThe list indexes are:");
        scores.printIndexes();



        scores.edit(2, "Paola");

        System.out.println("\n\nThe list size is: "+scores.size()+" \nThe values are:");
        scores.printValues();

        System.out.format("The value of index two is: %n%S",scores.get(2));

        System.out.format("%n%B",scores.isEmpty());

    }//End main method

}//End test linked list
