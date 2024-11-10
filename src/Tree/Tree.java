package Tree;

public class Tree {
    public Node root;

    public Tree(){
        this.root = null;
    }

    public Tree(Node node){
        this.root = node;
    }

    //*** On develoment ***
    public void printTree(Node node){
        if(node != null){
            printTree(node.left);
            System.out.print(node.data+"\t");
            printTree(node.right);
        }

    }//End print tree

    //*** On develoment ***
    public int sizeTree(Node node){
        int counter = 0;

        if(node != null){
            counter++;
            counter += sizeTree(node.left);
            counter += sizeTree(node.right);
        }

        return counter;
    }//End size tree


}//End tree class
