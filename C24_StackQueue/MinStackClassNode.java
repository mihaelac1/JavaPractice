package JavaPracticeGitHub.C24_StackQueue;

public class MinStackClassNode {
    /** initialize your data structure here. */
    private Node head;

    public MinStackClassNode() {}

    public void push(int val) {
        if(this.head == null){
            this.head = new Node(val, val);
        }else{
            head = new Node(val, Math.min(val, this.head.min), this.head);
        }
    }

    public void pop() {
        this.head = this.head.next;
    }

    public int top() {
        return this.head.val;
    }

    public int getMin() {
       return this.head.min;
    }

    private class Node{
        int val;
        int min;
        Node next;

        private Node(int val, int min){
            this(val, min, null);
        }

        private Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

}
