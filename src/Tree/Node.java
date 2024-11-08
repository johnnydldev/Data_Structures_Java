package Tree;

public class Node {

    public int data;
    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
    }

    public Node newNode(int data){
        Node root = new Node(data);
        root.left = null;
        root.right = null;

        return root;
    }//End create new node

    public Node insert(Node node, int data){
        if(node == null){
            return newNode(data);
        }else{
            if(data <= node.data){
                node.left = insert(node.left, data);
            }else{
                node.right = insert(node.right, data);
            }

            return node;
        }
    }//End insert node data



}//End Node class
