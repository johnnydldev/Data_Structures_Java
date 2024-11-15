package List;

public class ListArray {

    private static final int size = 100;
    private int count;
    private int position;
    private int[] list;

    public ListArray(){
        this.count = 0;
        this.position = 0;
        this.list = new int[this.size];
    }//End constructor to create a list with size of 100

    public ListArray(int size){
        this.count = 0;
        this.position = 0;
        this.list = new int[size];
    }//End overload of constructor with one integer parameter to assign the list size

    public boolean delete(int item){
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

    public boolean insert(int item){
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
            this.position = 0;
            while (position < count){
                System.out.print("\t"+list[position]);
                position++;
            }
        }else{
            System.out.println("List empty.");
        }
    }//End output method

    public boolean search(int item){
        boolean found = false;

        for(int i = 0; i < count; i++){
            if(item >= list[i]){
                if(item == list[i]){
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

}//End list array class
