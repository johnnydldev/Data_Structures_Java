package Node;

import java.util.Scanner;

public class TestNode {

    private static Node list;

    public static void output(Node root){
        if(root != null){
            System.out.print(root.getData()+"\t");
            output(root.getNext());
        }
    }//Print nodes values

    public static Node assignValues(Node root){
        Scanner scann = new Scanner(System.in);
        String message = "Enter the value for the list, ingress a negative value to stop.";
        System.out.println(message);

        int value = scann.nextInt();

        if(value >= 0){
            if(root == null){
                root = new Node(value);
                root.setNext(assignValues(root.getNext()));
            }
        }

        return root;
    }//End assign values inner the list method

    public static void main(String[] args){

        list = assignValues(list);
        output(list);

    }//End main method

}//End node class
