package Queue;

import Stack.StackArrayGeneric;
import Stack.StackGeneric;

import java.util.Scanner;

public class TestPalindrome {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word; int wLenght = 0;
        System.out.println("Enter a word to evaluate if it is a palindrome:");
        word = scanner.nextLine();
        wLenght = word.length();

        StackGeneric<Character> stack = new StackArrayGeneric<Character>(wLenght);
        QueueGeneric<Character> queue = new QueueGeneric<Character>(wLenght);

        for(int i = 0; i < wLenght; i++){
            char temp = word.charAt(i);
            queue.enqueue(temp);
            stack.push(temp);
        }//End loop to enter characters on queue and stack

        boolean isPalindrome = true;

        for(int i = 0; i < wLenght; i++){
            if(queue.dequeue() != stack.pop())
                isPalindrome = false;
        }//End loop to evaluate the characters of word

        if(isPalindrome){
            System.out.println("The word "+word+" is a palindrome.");
        }else{
            System.out.println("The word "+word+" isn't a palindrome.");
        }

    }//End main method

}//End test palindrome with queue and stack
