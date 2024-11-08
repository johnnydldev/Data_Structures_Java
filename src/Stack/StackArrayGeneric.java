package Stack;

public class StackArrayGeneric<T> implements StackGeneric<T>{

    private final static int size = 100;
    private int top;
    private T[] sArray;

    public StackArrayGeneric(){this(size);}

    public StackArrayGeneric(int size){
        this.top = 0;
        this.sArray = (T[])new Object[size];
    }

    public boolean empty(){
        boolean isEmpty;

        isEmpty = (this.top == 0);

        return isEmpty;
    }//End empty method

    public boolean full(){
        boolean isFull;

        isFull = (this.top == this.sArray.length);

        return isFull;
    }//End full method

    public T peek(){
        if(empty())
            throw new RuntimeException("Stack empty");

        this.top--;
        T peekValue = this.sArray[this.top];
        this.top++;

        return peekValue;
    }//End peek method

    public T pop(){
        if(empty())
            throw new RuntimeException("Stack empty");

        this.top--;
        return this.sArray[this.top];

    }//End pop method

    public void push(T item){
        if(full())
            expandStack();

        this.sArray[this.top] = item;
        this.top++;
    }//End push method

    public int size(){
        int sizeValue = 0;

        if(!empty())
            sizeValue = top;


        return sizeValue;
    }//End size Method

    public void expandStack(){
        int newSize = this.sArray.length*2, counter = 0;
        int currentTop = top;

        T[] newArray = (T[]) new Object[newSize];

        for(int i = 0; i < currentTop; i++){
            newArray[i] = this.sArray[i];
        }

        this.sArray = (T[])new Object[newSize];

        for(int i = 0; i < currentTop; i++){
            this.sArray[i] = newArray[i];
        }

    }//End expand method

}//End class
