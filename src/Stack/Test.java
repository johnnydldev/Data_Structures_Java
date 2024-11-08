package Stack;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        StackGeneric<Character> stack = new StackArrayGeneric<Character>(3);
        stack.push('u');
        stack.push('y');
        stack.push('l');
        stack.push('e');

        System.out.println("Size of stack: "+stack.size());
        System.out.print("Values in stack are: ");

        while(!stack.empty()){
            System.out.print("\t"+stack.pop());
        }

        /*Scanner scann = new Scanner(System.in);

        int j=0;
        String word;
        boolean isPalindrome = true;
        StackGeneric<Character> stack;

        System.out.println("Enter a word:");
        word = scann.nextLine();

        stack = new StackArrayGeneric<Character>(word.length());

        int length;
        if(word.length()%2==0){
            length = word.length()/2;
        }else{
            length = (word.length()/2)+1;
        }
        //System.out.println("The word size is: "+length);

        for(int i = word.length()-1; i >= length-1; i--){
            stack.push(word.charAt(i));
        }

        j = length-1;

        while(!stack.empty() && isPalindrome){
            if(stack.pop() != word.charAt(j))
                isPalindrome = false;

            j--;
        }

        if(isPalindrome){
            System.out.println("The word "+word+" is a palindrome");
        }else{
            System.out.println("The word "+word+" isn't a palindrome");
        }*/

    }//End main

}//End class test
