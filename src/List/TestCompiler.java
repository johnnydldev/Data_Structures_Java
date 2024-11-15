package List;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestCompiler {

    private static ListGeneric<String> list = new ListGeneric<String>();


    public static void main(String[] args) throws IOException {

        createOpTable();
        checkOpCodes();

    }//End main method

    public static void createOpTable() throws IOException {
        Scanner scanner = new Scanner(new File("C:\\Users\\JohnnyDL\\Documents\\Cursos\\Java\\DataStructures\\src\\List\\opCodes.txt"));
        String code;
        while (scanner.hasNextLine()){
            code = scanner.nextLine();
            list.insert(code.trim());
        }//End load codes loop
        scanner.close();
        list.output();
        System.out.println("\n");
    }//End create operation codes table

    public static void checkOpCodes() throws IOException {
        Scanner scanner = new Scanner(new File("C:\\Users\\JohnnyDL\\Documents\\Cursos\\Java\\DataStructures\\src\\List\\assemblyCode.txt"));
        String code, tempCode; int length = 0;

        System.out.print("SYMBOL\t\tOPCODE\t\tOPERAND\t\tERROR\n");
        System.out.println("______________________________________________________________________________");

        while(scanner.hasNextLine()){
            code = scanner.nextLine();
            length = code.length();

            System.out.print(code);

            if(length >= 20){
                tempCode = code.substring(10, 20).trim();
                if(!list.search(tempCode)){
                    System.out.printf("\t\t\t\t\tInvalid Opcode: %s", tempCode);
                }
            }else {
                tempCode = code.substring(10, length).trim();
                if(!list.search(tempCode)){
                    System.out.printf("\t\t\t\t\t\t\tInvalid Opcode: %s", tempCode);
                }
            }
            System.out.println();

        }
        scanner.close();

    }//End check operation codes


}//End test compiler class
