package Stack;

import Queue.QueueGeneric;

import java.util.Scanner;
import java.util.Stack;

public class TestQueueReverse {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = 6;

        StackArrayGeneric<Integer> stack = new StackArrayGeneric<Integer>(length);
        QueueGeneric<Integer> queueOriginal = new QueueGeneric<Integer>(length), queueReversed = new QueueGeneric<Integer>(length);

        for(int i = 0; i < length; i++){
            String message = STR."Enter the value of item \{i} of queue";
            System.out.println(message);
            int value = scanner.nextInt();
            queueOriginal.enqueue(value);
        }//End filling loop of queue

        queueReversed = stack.queueReverse(queueOriginal);

        while(!queueReversed.empty()){
            System.out.print("\t"+queueReversed.dequeue());
        }//Printing of queue reversed

    }//End main method

}//End test queue reverse class
