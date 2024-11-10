package Queue;

import Stack.StackArrayGeneric;

import java.util.Scanner;

public class TestStackReverse {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = 5;
        StackArrayGeneric<Character> stack = new StackArrayGeneric<Character>(length), stackReverse = new StackArrayGeneric<Character>(length);
        QueueGeneric<Character> queue = new QueueGeneric<Character>(length);

        for(int i = 0; i < length; i++){
            System.out.println("Enter the character to number "+i);
            char temp = scanner.next().charAt(0);
            stack.push(temp);
        }//End loop to filling stack

        stackReverse = queue.stackReverse(stack);

        while(!stackReverse.empty()){
            System.out.print("\t"+stackReverse.pop());
        }//print stack reverse items

    }//End main method

}//End test stack reverse
