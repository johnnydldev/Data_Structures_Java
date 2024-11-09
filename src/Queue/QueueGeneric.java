package Queue;

public class QueueGeneric<T> {

    private final static int size = 100;
    private int front;
    private int rear;
    private int count;
    private T[] queue;

    public QueueGeneric(){
        this.front = 0;
        this.rear = 0;
        this.count = 0;
        this.queue = (T[])new Object[this.size];
    }

    public QueueGeneric(int size){
        this.front = 0;
        this.rear = 0;
        this.count = 0;
        this.queue = (T[]) new Object[size];
    }

    public T dequeue(){
        T item = null;

        if(empty()){
            System.out.println("Queue empty");

        }else{
            item = this.queue[this.front];
            this.front = (++this.front)%this.queue.length;
            this.count--;
        }

        return item;
    }//End dequeue method

    public void enqueue(T item){
        if(full()){
            System.out.println("Queue full");
        }else{
            this.queue[this.rear] = item;
            this.rear = (++this.rear)%this.queue.length;
            this.count++;
        }

    }//End enqueue method

    public boolean empty(){
        boolean result = false;

        if(this.count==0)
            result = true;

        return result;
    }//End empty method

    public boolean full(){
        boolean result = false;

        if(this.rear == this.queue.length )
            result = true;

        return result;
    }//End full method

    public int size(){ return this.count; }//End size of queue


}//End queue generic
