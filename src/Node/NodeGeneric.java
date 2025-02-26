package Node;

import Stack.StackArrayGeneric;
import Stack.StackGeneric;

public class NodeGeneric<T extends Comparable<T>> {

    private T data;
    private int index = -1;
    private NodeGeneric<T> next;

    public NodeGeneric(){
        this.data = null;
        this.next = null;
    }//main constructor void

    public NodeGeneric(T data){
        this.data = data;
        this.next = null;
    }//End override constructor method

    public NodeGeneric(T data, NodeGeneric<T> next){
        this.data = data;
        this.next = next;
    }//End override constructor with data and next node parameters method

    public T getData(){
        return this.data;
    }//End get data method

    public void setData(T data){
        this.data = data;
    }//End set data method

    public NodeGeneric<T> getNext(){
        return this.next;
    }//End get next node method

    public void setNext(NodeGeneric<T> next){
        this.next = next;
    }//End set next node method

    public int getIndex(){
        return this.index;
    }//End get index

    public void setIndex(int value){
        this.index = value;
    }//

    public void outputReverse(NodeGeneric<T> node){
        if(node != null){
            System.out.print(node.getData()+"\t");
            output(node.getNext());
        }
    }//End print data nodes method

    public void output(NodeGeneric<T> node){
        StackGeneric<T> values = new StackArrayGeneric<T>();

        if(node != null){
            values.push(node.getData());
            output(node.getNext());
        }

        while(!values.empty()){
            System.out.print(values.pop()+"\t");
        }

    }//End normal print method

    public void outputIndexes(NodeGeneric<T> node){
        StackGeneric<Integer> indexes = new StackArrayGeneric<Integer>();

        if(node != null){
            indexes.push(node.getIndex());
            outputIndexes(node.getNext());
        }

        while(!indexes.empty()){
            System.out.print(indexes.pop()+"\t");
        }
    }//End normal print method


}//End class node generic
