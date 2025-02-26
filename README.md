> [!NOTE]
> ### DATA STRUCTURES WITH JAVA

Custom data structures that you can consult its implementation
```
Stack
Queue
List
Tree
```

> [!IMPORTANT]
> The following data structures are on array based

**Stack** created with arrays this structure has the following methods to use:
```
`Constructor:` Allow you create a stack of 100 size or custom size specify inner the overload method.
`Empty:` Allow you determine if the stack is empty.
`Full:` Allow you determine if the stack is full.
`Push:` Allow you put on stack an item, if the stack is full it can be expanded of dinamic way.
`Pop:` Allow you take off stack an item (The item top) still stack be empty.
`Size:` Allow you know the number of items inner of stack.
`ExpandStack:` If the stack is full, it allow you expand stack to double size of itself.
`QueueReverse:` return a new queue with its items reversed, from rear to front.
```

> [!TIP]
> You can implement the stack doing the following steps
```ruby
    //Declare an object of parent interface StackGeneric and instancing a new StackArrayGeneric object 
    StackGeneric<Character> stack = new StackArrayGeneric<Character>(3);

    //Using the `push` method to input data of character type into our stack 
    stack.push('u');
    stack.push('y');
    stack.push('l');
    stack.push('e');

    //Show the stack size on elements number contains based
    System.out.println("Size of stack: "+stack.size());

    //Print the elements into the stack
    System.out.print("Values in stack are: ");

    //Iterate all items from last to first while the stack does not empty
    while(!stack.empty()){
        System.out.print("\t"+stack.pop());
    }

```
![for more information following link:](https://github.com/johnnydldev/Data_Structures_Java/blob/main/src/Stack/StackArrayGeneric.java)


**Queue** created with arrays this structure has the following methods to use:
```
`Constructor:` Allow you create a queue of 100 size or custom size specify inner the overload method.
`Empty:` Allow you determine if the queue is empty.
`Full:` Allow you determine if the queue is full.
`Enqueue:` Allow you put on queue an item.
`Dequeue:` Allow you take off queue an item (The item front) still queue be empty.
`Size:` Allow you know the number of items inner of queue.
`StackReverse:` return a new stack with its items reversed, from last to first.
```

**List** created with arrays this structure has the following methods to use:
```
Constructor: Allow you create a list of 100 size or custom size specify inner the overload method.
Empty: Allow you determine if the list is empty.
Full: Allow you determine if the list is full.
Insert: Allow you put on list an item.
Delete: Allow you take off list an item while the list don't be empty.
Size: Allow you know the number of items inner of list.
Search: return a boolean value according to was found in the list the item specify implementing 
the compareTo method of Java's Comparable class.
```

**Node** class for create liked list has the following methods to use:
```

Constructor: Allow you create a node with default value and next node in null or custom value specify inner the overload method.
Getters and Setters for data: getData() allow you get node's value, setData() allow you edit node's value.
Getters and Setters for next node: getNext() allow you get node's reference memory allocation, setNext() allow you edit node's reference memory allocation pointer.
output: Allow you print each item on list.
```

**LinkedList** interface for create liked list has the following methods to implement differents linkedList types as Linked List both ordered and unordered:
```
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
```

By implement the **LinkedList** interface use the following code:

```
    public class LinkedListUnordered<T extends Comparable<T>> implements LinkedList<T> {}
```

By create an object of **LinkedList** interface and create several linked list types use the following code:

```
    //Implement the interface LinkedList you can create unordered list
    LinkedList<Integer> scores = new LinkedListUnordered<Integer>();

    //Implement the interface LinkedList you can create ordered list
    LinkedList<Integer> scores = new LinkedListOrdered<Integer>();
```

**LinkedListUnordered** class for create liked list reference based that it can use indexes has the following methods to use:

```
    public void insert(T data){} --> Ingress a new value inner the list.

    public void edit(int index, T data); --> Set the new value given in the index specified if it exist inner list.

    public void remove(int index); --> Delete the value that belongs the index specified if it exist inner list.

    public T get(int index); --> Return the value or null if exist the element specified by index given.

    public int indexOf(T data); --> Return the first index that match with the value given or -1 if doesn't exist.

    public boolean isEmpty(); --> Return a boolean value according to list is empty or not.

    public void printValues(); --> Print the values inner list separates by tabulation.

    public void printValuesReverse(); --> Print the values in reverse order from enter.

    public void printIndexes(); --> Print the indexes of elements contains inner list.

    public int size(); --> Return the items number inner list.
```

For more information about it review the following link: ![link of LinkedListUnordered class in repository](https://github.com/johnnydldev/Data_Structures_Java/blob/main/src/List/LinkedList/LinkedListUnordered.java)

Example of implementation:
```
        //Create and instancing of scores object of LikedListUnordered class 
        LinkedList<Integer> scores = new LinkedListUnordered<Integer>();

        //Adding elements to list
        scores.insert(4);
        scores.insert(3);
        scores.insert(9);
        scores.insert(6);
        scores.insert(9);
        scores.insert(2);
        scores.insert(15);
        scores.insert(20);

        //Calling print values method
        scores.printValues();

        //Calling print indexes of items method
        System.out.println("\nThe list indexes are:");
        scores.printIndexes();

        //Delete a item in index 0
        scores.remove(0);

        //Getting the index value for fisrt element that match with 6 value 
        int index = scores.indexOf(6);

        //Editing the item with index 2 and assigning the 20 value
        scores.edit(2, 20);

        //Getting the value in index 2
        int value = scores.get(2);

        //Printing if the list is empty or not
        System.out.println(scores.isEmpty());

```