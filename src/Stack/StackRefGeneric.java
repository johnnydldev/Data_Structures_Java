package Stack;

public class StackRefGeneric<T> implements StackGeneric<T> {

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public void push(T item) {

    }

    @Override
    public int size() {
        return 0;
    }

}//End class Stack by References
