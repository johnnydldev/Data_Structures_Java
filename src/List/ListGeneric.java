package List;

public class ListGeneric<T extends Comparable<T>> {

    private static final int size = 100;
    private int count;
    private int position;
    private T[] list;
    private T reference;

    public ListGeneric(){
        this.count = 0;
        this.position = 0;
        this.list = (T[]) new Comparable[this.size];
    }//End constructor to create a list with size of 100

    public ListGeneric(int size){
        this.count = 0;
        this.position = 0;
        this.list = (T[]) new Comparable[size];
    }//End overload of constructor with one integer parameter to assign the list size

    public boolean delete(T item){
        boolean deleted = false;

        if(!empty()){
            if(search(item)){
                for(int i = position; i < count-1; i--){
                    list[i] = list[i+1];
                }
                count--;
                position = count;
                deleted = true;
            }
        }else{
            System.out.println("The list is empty.");
        }

        return deleted;
    }//End delete method

    public boolean empty(){
        boolean result = this.count == 0;

        return result;
    }//End empty method

    public boolean insert(T item){
        boolean inserted = false;

        if(!full()){//If the list is different of full, the item is inserted.
            if(!search(item)){
                list[position] = item;//Insert the item in the list.
                position++;//Increment the position value in one unit.
                count++;//Increment the count value in one.
                inserted = true;//The value of inserted is changed to true.
            }
        }else{
            System.out.println("List is full");
        }

        return inserted;
    }//End insert method

    public boolean full(){
        boolean result = this.count == this.list.length;

        return result;
    }//End full method

    public void output(){
        if(!empty()){
            int position = 0;
            while (position < count){
                System.out.print("\t"+list[position]);
                position++;
            }
        }else{
            System.out.println("List empty.");
        }
    }//End output method

    public boolean search(T item){
        boolean found = false;

        for(int i = 0; i < count; i++){
            if(list[i].compareTo(item) >= 0){
                if(list[i].compareTo(item) == 0){
                    position = i;
                    found = true;
                    break;
                }
                position = count;
                break;
            }
        }

        return found;
    }//End search method

    public int size(){ return this.count; }//End size method
    
}//End list generic class
