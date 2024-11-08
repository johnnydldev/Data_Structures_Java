package Stack;

public interface StackGeneric<T> {
    public boolean empty();
    public boolean full();
    public T peek();
    public T pop();
    public void push(T item);
    public int size();
}//End interface
