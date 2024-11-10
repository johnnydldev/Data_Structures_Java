package Queue;

import Stack.StackArrayGeneric;

import java.util.Scanner;

public class TestStackReverse {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int lenght = 5;
        StackArrayGeneric<Character> stack = new StackArrayGeneric<Character>(lenght), stackReverse = new StackArrayGeneric<Character>(lenght);
        QueueGeneric<Character> queue = new QueueGeneric<Character>(lenght);

        for(int i = 0; i < lenght; i++){
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
