package JavaPracticeGitHub.C24_StackQueue;

import java.util.Deque;
import java.util.LinkedList;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        Deque<Integer> myStack = new LinkedList<>();

        int sum = 0;

        for(String op : ops){
            if(op.equals("+")){
                int nb1 = myStack.pop();
                int nb2 = myStack.pop();
                myStack.push(nb2);
                myStack.push(nb1);
                myStack.push(nb1 + nb2);

            }
            else if(op.equals("D")){
                myStack.push(myStack.peek() * 2);

            }else if(op.equals("C")){
                myStack.pop();
            }else{
                myStack.push(Integer.valueOf(op));
            }
        }

        for(int score : myStack){
            sum += score;
        }

        return sum;
    }
}
