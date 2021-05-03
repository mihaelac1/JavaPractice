package JavaPracticeGitHub.C24_StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementsStacksUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int topElement;

    /** Initialize your data structure here. */
    public ImplementsStacksUsingQueues() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        topElement = x;
        q1.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

        while(q1.size() > 1){
            topElement = q1.poll();
            q2.offer(topElement);
        }

        int returnedElement = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return returnedElement;
    }

    /** Get the top element. */
    public int top() {
        return topElement;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
