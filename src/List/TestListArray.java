package List;

import java.util.Scanner;

public class TestListArray {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char option = 'o'; boolean result = false, execute = true;

        ListArray list = new ListArray();

        while(execute){
            String message = "\n(I) to insert a integer value in the list.\n" +
                    "(D) to delete a integer value from list.\n(S) to stop the menu.\n(P) print list values.";
            System.out.println("Choose an option from menu:"+message);
            option = scanner.next().toUpperCase().charAt(0);

            switch(option){
                case 'I':
                    System.out.println("Enter the value of integer to ingress:");
                    int value = scanner.nextInt();
                    result = list.insert(value);
                    if(result){
                        System.out.println("Inserted value success.\n");
                    }else{
                        System.out.println("Insert value failed.\n");
                    }
                    break;
                case 'D':
                    System.out.println("Enter the value of integer to delete:");
                    int valueToDelete = scanner.nextInt();
                    result = list.delete(valueToDelete);
                    if(result){
                        System.out.println("Delete value success.\n");
                    }else{
                        System.out.println("Delete value failed.\n");
                    }
                    break;
                case 'P':
                    list.output();
                    System.out.println();
                    break;
                case 'S':
                    execute = false;
                    System.out.println("Exiting ...");
                    break;
                default:
                    System.out.println("Option chose not valid.\n");
                    break;
            }

        }//End loop



    }//End main method

}//End test class
