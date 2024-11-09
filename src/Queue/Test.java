package Queue;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char option = 'E';
        QueueArray queue = new QueueArray(5);


        while(true){
            System.out.println("############################");
            System.out.println("Enter a option:\n*letter E to enqueue.\n*letter D to dequeue.\n*letter S to Stop.");
            System.out.println("############################");

            option = scanner.next().charAt(0);

            if(option == 'E' || option == 'e'){
                queue.enqueue(scanner.nextInt());
            }else if(option == 'D' || option == 'd'){
                System.out.println(queue.dequeue());
            }else if(option == 'S' || option == 's'){
                System.out.println("Exiting ...");
                break;
            }else{
                System.out.println("############################");
                System.out.println("Incorrect option, choose an option correct.");
                System.out.println("Enter a option:\n*letter E to enqueue.\n*letter D to dequeue.\n*letter S to Stop.");
                System.out.println("############################");

            }

        }//End loop to enter or take off values


    }//End main method

}//End test class of queue
