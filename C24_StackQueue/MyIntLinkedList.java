package JavaPracticeGitHub.C24_StackQueue;

public class MyIntLinkedList<E> {
    private DoubleLinkedListNode<E> head;
    private DoubleLinkedListNode<E> tail;
    public int size = 0;

    //Constructs an empty list.
    public MyIntLinkedList(){}

    //Constructs a list containing the elements of the specified collection
    MyIntLinkedList(MyIntLinkedList<E> c){
        this.head = c.head;
        this.tail = c.tail;
        this.size = c.size;
    }

    //Inserts the specified element at the specified position in this list.
    public void add(int index, E e){
        if(index >= this.size){
            System.out.println("Index exceeds out of bounds");
            return;
        }
       if(index == 0 && this.head == null && this.tail == null){
           DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(e);
           this.tail = node;
           this.head = node;
           this.tail.prev(head);
           this.head.next(tail);
       }else if(index == 0){
           DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(e);
           node.next(this.head);
           node.prev(null);
           this.head = node;

       }else if(index == this.size - 1){
           DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(e);
           this.tail.next(node);
           this.tail = node;
       }
       else{
           DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(e);
           DoubleLinkedListNode<E> it = this.head;
           int counter = 0;
           while(counter < index - 1){
               it = it.next();
               counter++;
           }
           node.next(it.next());
           it.next(node);
       }
       this.size++;
   }

   //Appends the specified element to the end of this list.
    public boolean add(E e){
        if(this.head == null && this.tail == null){
            DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(e);
            this.tail = node;
            this.head = node;
            this.tail.prev(head);
            this.head.next(tail);
        } else{
            DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(e);
            this.tail.next(node);
            node.prev(tail);
            this.tail = node;
        }
        this.size++;
        return true;
    }

    //Returns the number of elements in this list.
    public int size() {
        return size;
    }

    //Returns the element at the specified position in this list.
    public E get(int index){
        if(index > this.size || index < 0){
            return null;
        }
        DoubleLinkedListNode<E> it = this.head;
        int counter = 0;
        while(counter < index){
            it = it.next();
            counter++;
        }
        return it.value();
    }

    //Removes the element at the specified position in this list.
    public E removeElementAtIndex(int index){
        if(index >= this.size || index < 0){
            return null;
        }
        this.size--;
        if(index == 0){
            E value = this.head.value();
            this.head = this.head.next();
            this.head.prev(null);
            return value;
        }

        if(index == this.size - 1){
            E value = this.tail.value();
            this.tail = this.tail.prev();
            this.tail.next(null);
            return value;
        }

        DoubleLinkedListNode<E> it = this.head;
        int counter = 0;
        while(counter < index - 1){
            it = it.next();
            counter++;
        }

        DoubleLinkedListNode<E> aux = it.next();
        it.next(it.next().next());
        it.next().prev(it);
        return aux.value();
    }

    //Retrieves and removes the head (first element) of this list.
    public E remove(){
        if(this.size == 0){
            return null;
        }
        this.size--;
        DoubleLinkedListNode<E> aux = head;
        head = head.next();
        head.prev(null);
        return aux.value();
    }

    //Removes the first occurrence of the specified element from this list, if it is present.
    public boolean remove(E e){
        if(this.size == 0){
            return false;
        }

        DoubleLinkedListNode<E> it = this.head;
        int counter = 0;
        while(it != null){
            if(it.value().equals(e)){
                this.size--;
                if(counter == 0) {
                    this.head = this.head.next();
                    this.head.prev(null);
                    return true;
                }
                if(counter == this.size){
                    this.tail = this.tail.prev();
                    this.tail.next(null);
                    return true;
                }
                it.next(it.next().next());
                it.next().prev(it);
                return true;
            }
            it = it.next();
            counter++;
        }

        return false;
    }

    //Removes all of the elements from this list.
    public void clear(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Returns true if this list contains the specified element.
    public boolean contains(E e){
        if(this.size == 0){
            return false;
        }

        if(this.indexOf(e) >= 0){
            return true;
        }else{
            return false;
        }
    }

    //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    public int indexOf(E e){
        if(this.size == 0){
            return -1;
        }

        int index = 0;

        DoubleLinkedListNode<E> it = this.head;
        while(it != null){
            if(it.value().equals(e)){
                return index;
            }
            it = it.next();
            index++;
        }

        return -1;
    }

    //Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
    public int lastIndexOf(E e){
        if(this.size == 0){
            return -1;
        }

        int index = 0;
        int returnedIndex = -1;

        DoubleLinkedListNode<E> it = this.head;
        while(it != null){
            if(it.value().equals(e)){
                returnedIndex = index;
            }
            it = it.next();
            index++;
        }

        return returnedIndex;
    }

    //Replaces the element at the specified position in this list with the specified element.
    public E set(int index, E e){
        if(this.size == 0 || index > this.size  || index < 0){
            return null;
        }

        int counter = 0;

        DoubleLinkedListNode<E> it = this.head;

        while(counter < index ){
            it = it.next();
            counter++;
        }
        E aux = it.value();
        it.value(e);

        return aux;

    }

    //Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
    public boolean addAll(MyIntLinkedList<E> c){
       return addAll(this.size - 1, c);
    }

    //Inserts all of the elements in the specified collection into this list, starting at the specified position.
    public boolean addAll(int index, MyIntLinkedList<E> c){
        if(c.size() == 0 || index < 0 || index > this.size){
            return false;
        }


        if(index == 0){
            c.tail.next(this.head);
            this.head.prev(c.tail);
            this.tail = c.tail;
            this.head = c.head;
            this.size += c.size;
            return true;
        }

        if(index == this.size - 1){
            this.tail.next(c.head);
            c.head.prev(this.tail);
            this.tail = c.tail;
            this.size += c.size;
            return true;
        }

        int counter = 0;
        DoubleLinkedListNode<E> it = this.head;
        while(counter < index - 1){
            it = it.next();
            counter++;
        }
        DoubleLinkedListNode<E> nextNode = it.next();
        it.next(c.head);
        c.head.prev(it);
        c.tail.next(nextNode);
        nextNode.prev(c.tail);
        this.size += c.size;
        return true;
    }

    //Returns an array containing all of the elements in this list in proper sequence (from first to last element).
    public Object[] toArray(){
        Object[] myArray = new Object[this.size];
//        E[] myArray = new E[this.size];
        DoubleLinkedListNode<E> it = this.head;
        int counter = 0;
        while(it!= null){
            myArray[counter] = it.value();
            it = it.next();
            counter++;
        }
        return myArray;
    }


    public void printList(){
        if(this.size == 0){
            System.out.println("Empty list.");
        }
        DoubleLinkedListNode<E> it = this.head;
        while(it != null){
            System.out.print(it.value() + ", ");
            it = it.next();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        if(this.size == 0){
            return "head=" + head+
                    ", tail=" + tail;
        }
        return "head=" + head.value() +
                ", tail=" + tail.value();
    }
}
