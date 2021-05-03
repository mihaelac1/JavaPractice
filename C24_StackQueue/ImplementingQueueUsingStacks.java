package JavaPracticeGitHub.C24_StackQueue;

import java.util.Deque;
import java.util.LinkedList;

public class ImplementingQueueUsingStacks {


    Deque<Integer> s1 = new LinkedList<>();
    Deque<Integer> s2 = new LinkedList<>();
    int frontElement;

    /** Initialize your data structure here. */
    public ImplementingQueueUsingStacks() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {

        if(s1.size() == 0){
            frontElement = x;
        }

        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        while(!(s1.size() == 0)){
            s2.push(s1.pop());
        }

        int returnedValue = s2.pop();

        if(!(s2.size() == 0)){
            frontElement = s2.peek();
        }

        while(!(s2.size() == 0)){
            s1.push(s2.pop());
        }

        return returnedValue;
    }

    /** Get the front element. */
    public int peek() {
        return frontElement;

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.size() == 0;
    }
}
