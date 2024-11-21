package List.LinkedList;

import Node.NodeGeneric;

public interface LinkedList<T extends Comparable<T>> {

    public void insert(T data);

    public void edit(int index, T data);

    public void remove(int index);

    public void remove(T data);

    public T get(int index);

    public int indexOf(T data);

    public boolean isEmpty();

    public void printValues();

    public void printValuesReverse();

    public void printIndexes();

    public int size();


}//End linked list class
