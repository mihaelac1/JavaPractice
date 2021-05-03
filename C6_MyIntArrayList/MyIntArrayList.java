package JavaPracticeGitHub.C6_MyIntArrayList;

import java.util.Arrays;

public class MyIntArrayList {

    private int[] elements;
    private int size;

    public MyIntArrayList(int initialCapacity) {
        this.elements = new int[initialCapacity];
    }

    public MyIntArrayList() {
        this(10);
    }

    public MyIntArrayList(MyIntArrayList c) {

        if(c == null){
            throw new NullPointerException();
        }
        //int idxC = 0;
        this.elements = new int[c.size];
        for(int i = 0; i < c.size; i++){
            this.elements[i] = c.elements[i];
        }
        this.size =  c.size;
    }

    public boolean add(int e) {
        if (this.size == this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
        this.elements[size] = e;
        this.size++;
        return true;
    }

    public void add(int index, int element) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        } else {
            if (this.size == this.elements.length) {
                this.elements = Arrays.copyOf(this.elements, this.size * 2);
            }
            this.size++;

            int aux1 = this.elements[index];
            this.elements[index] = element;

            for (int i = index + 1; i < this.size; i++) {
                int aux2 = this.elements[i];
                this.elements[i] = aux1;
                aux1 = aux2;
            }
        }
    }

    public int size() {
        return this.size;
    }

    public boolean contains(int e) {
        //index of - se poate folosi meth
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        return this.elements[index];
    }

    public int indexOf(int e) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int e) {
        for (int i = this.size - 1; i > 0; i--) {
            if (this.elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int e) {
        int firstIndex = -1;
//metoda indexOf
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == e) {
                firstIndex = i;
                break;
            }
        }
        if (firstIndex >= 0) {
            for (int i = firstIndex; i < this.size - 1; i++) {
                this.elements[i] = this.elements[i + 1];
            }
            this.size--;
            return true;
        }
        return false;
    }

    public int removeElementAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        int removedElement = this.elements[index];
        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;

        return removedElement;
    }

    public void clear() {
        this.size = 0;
    }

    public int set(int index, int e) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        int replacedElement = this.elements[index];
        this.elements[index] = e;

        return replacedElement;
    }

    public boolean addAll(MyIntArrayList c) {
        if(c == null){
            throw new NullPointerException();
        }
        int idxC = 0;
        this.elements = Arrays.copyOf(this.elements, this.size +  c.size);

        for(int i = this.size; i < this.size +  c.size; i++){
            this.elements[i] = c.elements[idxC++];
        }
        this.size = this.size +  c.size;
        return true;
    }

    public int[] toArray() {
        int[] newArrayElements = new int[size];
        for (int i = 0; i < this.size; i++) {
            newArrayElements[i] = this.elements[i];
        }
        return newArrayElements;
    }

    public void ensureCapacity(int minCapacity) {
        if (this.size < minCapacity) {
            this.elements = Arrays.copyOf(elements, minCapacity);
        }
    }

    public void trimToSize() {
        this.elements = Arrays.copyOf(elements, this.size);
    }

    protected void display() {
        System.out.println( Arrays.toString(this.elements));

    }
    //de adaugat AddAll cu index
}
