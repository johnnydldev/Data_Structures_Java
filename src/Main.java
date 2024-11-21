import Tree.Node;
import Tree.Tree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void printTree(Node node){
        if(node != null){
            printTree(node.left);
            System.out.print(node.data+"\t");
            printTree(node.right);
        }

    }//End print tree

    public static int sizeTree(Node node){
        int counter = 0;

        if(node != null){
            counter++;
            counter += sizeTree(node.left);
            counter += sizeTree(node.right);
        }

        return counter;
    }//End size tree

    public static void main(String[] args) {



        Node root = new Node(5);
        root.insert(root, 6);
        root.insert(root, 4);
        root.insert(root, 9);
        root.insert(root, 7);
        root.insert(root, 11);
        root.insert(root, 8);

        printTree(root);

        System.out.println("\nNode.Node's number is: "+sizeTree(root));

    }

}