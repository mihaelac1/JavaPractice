package JavaPracticeGitHub.C24_StackQueue;

import java.util.LinkedList;

public class MinStackTwoStacks {
    private LinkedList<Integer> myStack = new LinkedList<>();
    private LinkedList<Integer> myMinStack = new LinkedList<>();

    public MinStackTwoStacks() {}

    public void push(int val) {
        myStack.add(0,val);
        if(!myMinStack.isEmpty()){
            int min = myMinStack.get(0);
            if(val <= min){
                myMinStack.add(0,val);
            }
        }else{
            myMinStack.add(0, val);
        }
    }

    public void pop() {
        int lastAddedElement = myStack.remove(0);
        if(!myMinStack.isEmpty()){
            if(lastAddedElement == myMinStack.get(0)){
                myMinStack.remove(0);
            }
        }
    }

    public int top() {
        return myStack.get(0);
    }

    public int getMin() {
        return myMinStack.get(0);
    }

}
