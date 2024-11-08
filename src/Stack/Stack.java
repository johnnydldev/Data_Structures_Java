package Stack;

public class Stack {
    private final static int size = 100;
    private int top;
    private int[] sArray;

    public Stack(){this(size);}

    public Stack(int size){
        this.top = 0;
        this.sArray = new int[size];
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

    public int pop(){
        if(empty())
            throw new RuntimeException("Stack empty");

        this.top--;
        return this.sArray[this.top];

    }//End pop method

    public void push(int item){
        if(full())
            throw new RuntimeException("Stack full");

        this.sArray[this.top] = item;
        this.top++;
    }//End push method

}//End class Stack
