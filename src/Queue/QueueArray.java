package Queue;

public class QueueArray {

    private final static int size = 100;
    private int front;
    private int rear;
    private int count;
    private int[] queue;

    public QueueArray(){
        this.front = 0;
        this.rear = 0;
        this.count = 0;
        this.queue = new int[this.size];
    }

    public QueueArray(int size){
        this.front = 0;
        this.rear = 0;
        this.count = 0;
        this.queue = new int[size];
    }

    public int dequeue(){
        int item;

        if(empty())
            throw  new RuntimeException("Queue empty");

        item = this.queue[this.front];
        this.front = (++this.front)%this.queue.length;
        this.count--;

        return item;
    }//End dequeue method

    public void enqueue(int item){
        if(full())
            throw new RuntimeException("Queue full");

        this.queue[this.rear] = item;
        this.rear = (++this.rear)%this.queue.length;
        this.count++;
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

    //Return the item allocate on front without delete from the queue
    public int peek(){
        return queue[front];
    }//End peek method

    public int size(){ return this.count; }//End size of queue

}//End class
