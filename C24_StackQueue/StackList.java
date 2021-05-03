package JavaPracticeGitHub.C24_StackQueue;

public class StackList<E> {
    private MyIntLinkedList<E> list = new MyIntLinkedList<>();

    public E peek(){
        return list.get(list.size() - 1);
    }

    public void push(E element){
        this.list.add(element);
    }

    public E poop(){
        return list.removeElementAtIndex(list.size() - 1);
    }

    @Override
    public String toString() {
        return "StackList{" +
                "list=" + list +
                '}';
    }
}
