package Node;

public class Node {
    private int data;
    private Node next;

    public Node(){
        this.data = 0;
        this.next = null;
    }//main constructor void

    public Node(int data){
        this.data = data;
        this.next = null;
    }//End override constructor method

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }//End override constructor with data and next node parameters method

    public int getData(){
        return this.data;
    }//End get data method

    public void setData(int data){
        this.data = data;
    }//End set data method

    public Node getNext(){
        return this.next;
    }//End get next node method

    public void setNext(Node next){
        this.next = next;
    }//End set next node method

    public void output(Node node){
        if(node != null){
            System.out.print(node.getData()+"\t");
            if(node.getNext() != null){
                output(node.getNext());
            }
        }
    }//End print data nodes method


}//End node class
