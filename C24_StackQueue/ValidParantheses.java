package JavaPracticeGitHub.C24_StackQueue;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParantheses {
    public static boolean isValid(String s) {
        Deque<Character> myStack = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                myStack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && !myStack.isEmpty() && myStack.peek() == '('){
                myStack.pop();
            }
            else if(s.charAt(i) == ']' && !myStack.isEmpty() && myStack.peek() == '['){
                myStack.pop();
            }
            else if(s.charAt(i) == '}' && !myStack.isEmpty() && myStack.peek() == '{'){
                myStack.pop();
            }else{
                return false;
            }
        }

        if(myStack.isEmpty()){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
