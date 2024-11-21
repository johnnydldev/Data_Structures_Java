package List.LinkedList;

import Node.NodeGeneric;
import jdk.jshell.spi.ExecutionControl;

public class LinkedListUnordered<T extends Comparable<T>> implements LinkedList<T> {

    private NodeGeneric<T> root;
    private int nodeCount = 0;
    private int indexBase = 0;
    private NodeGeneric<T> result = new NodeGeneric<T>();
    private NodeGeneric<T> current , last = null;
    private T dataResult = null;
    private int indexResult = -1;



    public LinkedListUnordered(){
        this.root = null;
    }//End default constructor

    public LinkedListUnordered(T data){
        this.root = new NodeGeneric<T>(data);
    }//End add new first value constructor

    public void insert(T data){
        this.root = assignValues(this.root, data);
        assignIndex(this.root);
    }//End insert value method

    public void edit(int index, T data){

        if(this.nodeCount > 0 && index >= 0 && index < this.nodeCount){
            current = searchNode(this.root, index);
            current.setData(data);
        }

    }//End edit method

    public void remove(int index){

        if(this.nodeCount > 0){
            if(index >= 0 && index < this.nodeCount){
                if(index == 0 && this.root.getNext() != null){
                    current = root.getNext();
                    this.root = current;
                }else if(index > 0 && index == this.nodeCount-1){
                    current = searchNode(this.root, --index);
                    current.setNext(null);
                }else{
                    last = searchNode(this.root, index-1);
                    current = searchNode(this.root,index+1);
                    last.setNext(current);
                }
                this.nodeCount--;
            }

            assignIndex(this.root);
        }
    }//End remove item by index

    public void remove(T data){
    }//End remove item by value

    public T get(int index){
        T result = null;

        if(this.nodeCount > 0 && index >= 0 && index < this.nodeCount){
            result = searchData(this.root, index);
            dataResult = null;
        }

        return result;
    }//End get data node method

    public int indexOf(T data){
        int result = -1;

        if(this.nodeCount > 0){
            result = searchIndexByData(this.root, data);
            System.out.println("The result is: "+result);
            indexResult = -1;
        }

        return result;
    }//End get index by data method

    public boolean isEmpty(){
        return this.nodeCount <= 0;
    }//End return is empty method

    private NodeGeneric<T> assignValues(NodeGeneric<T> root, T data){
        NodeGeneric<T> newNode = new NodeGeneric<T>(data);

        if(root == null){
            root = newNode;
            this.nodeCount++;
        }else{
            root.setNext(assignValues(root.getNext(), data));
        }

        return root;
    }//End assign values method


    private NodeGeneric<T> searchNode(NodeGeneric<T> root, int index){

        if(root != null){
           if(root.getIndex() == index){
               result = root;
           }else{
               searchNode(root.getNext(), index);
           }
        }

        return result;
    }//End search node

    private T searchData(NodeGeneric<T> root, int index){

        if(root != null){
            if(root.getIndex() == index){
                dataResult = root.getData();
            }else{
                searchData(root.getNext(), index);
            }
        }

        return dataResult;
    }//End search node

    private int searchIndexByData(NodeGeneric<T> root, T data){

        if(root != null){
            if(root.getData().compareTo(data) == 0){
                indexResult = root.getIndex();
            }else{
                searchIndexByData(root.getNext(), data);
            }
        }

        return indexResult;
    }//End search node

    public void printValuesReverse(){

        if(this.root != null){
            this.root.output(this.root);
        }

    }//End print data nodes method

    public void printValues(){
       print(this.root);
    }//End print data nodes method

    public void printIndexes(){
        printIndex(this.root);
    }//End print data nodes method

    public int size(){
        return this.nodeCount;
    }//End get list size method

    private void print(NodeGeneric<T> node){

        if(node != null){
            System.out.print(STR."\{node.getData()}\t");
            print(node.getNext());
        }

    }//End print values method

    private void printIndex(NodeGeneric<T> node){

        if(node != null){
            System.out.print(node.getIndex()+"\t");
            printIndex(node.getNext());
        }

    }//End print indexes method

    private void assignIndex(NodeGeneric<T> root){

        if(root != null){
            root.setIndex(this.indexBase);
            ++this.indexBase;
            assignIndex(root.getNext());
        }

        this.indexBase = 0 ;

    }//End assign indexes method


}//End liked list unordered
