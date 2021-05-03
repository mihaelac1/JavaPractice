package JavaPracticeGitHub.P3_AplicatiiStiveCozi;

import java.util.*;

public class CreateAndEvaluateRPN {

    public static Deque<String> postfixNotation(String s) {

        s = s.replaceAll("\\s", "");

        Deque<String> myStack = new LinkedList<>();
        Deque<String> postFixQueue = new LinkedList<>();

        int cursor = 0;

        while (cursor < s.length()) {
            //1.1 citeste entitatea
            String c = String.valueOf(s.charAt(cursor));
            boolean sign = false;

            if(cursor == s.length() - 1 && getPrecedence(c) >= 0){
                System.out.println("Error! Invalid Expression!");
                return new LinkedList<>(Arrays.asList(s));
            }

            if((cursor == 0 && c.equals("-")) || (cursor > 0 && c.equals("-") && getPrecedence(String.valueOf(s.charAt(cursor - 1))) >= 0) ){
                sign = true;
                cursor++;
                c = String.valueOf(s.charAt(cursor));
            }

            //1.2 daca entitatea este un operand
            if (isDigit(c)) {
                StringBuilder number = new StringBuilder(c);
                while(cursor + 1 < s.length() && isDigit(String.valueOf(s.charAt(cursor + 1)))) {
                        number.append(s.charAt(cursor + 1));
                        cursor++;
                    }
                if(sign){
                    int toAdd = Integer.parseInt(number.toString()) * (-1);
                    postFixQueue.offer(String.valueOf(toAdd));
                }else {
                    postFixQueue.offer(number.toString());
                }
            }

            //1.3 daca entitatea este un operator
            else if (getPrecedence(c) >= 0) {
                while (!myStack.isEmpty() && (getPrecedence(c) < getPrecedence(myStack.peek()) ||
                        (getPrecedence(c) == getPrecedence(myStack.peek()) && associate(myStack.peek()).equals("sd"))) && !myStack.peek().equals("(")) {
                    postFixQueue.offer(myStack.pop());
                }
                myStack.push(c);
            }

            //1.4 daca entitatea este o paranteza-stanga
            else if (c.equals("(")) {
                myStack.push(c);
            }

            //1.5 daca entitatea este o paranteza-dreapta
            else if (c.equals(")")) {

                while (!myStack.isEmpty() && !myStack.peek().equals("(")) {
                    postFixQueue.offer(myStack.pop());
                }

                if (myStack.isEmpty()) {
                    System.out.println("Error! Wrong parantheses!");
                    return null;
                }
                myStack.pop();
            }else{
                System.out.println("Error! Invalid Expression.");
                return new LinkedList<>(Arrays.asList(s));
            }

            cursor++;
        }

        while (!myStack.isEmpty()) {
            if (myStack.peek().equals("(")) {
                System.out.println("Error! Wrong parantheses!");
                return null;
            }
            postFixQueue.offer(myStack.pop());
        }

        return postFixQueue;
    }

    private static int getPrecedence(String str) {

        return switch (str) {
            case "+", "-" -> 11;
            case "*", "/" -> 12;
            case "^" -> 13;
            default -> -1;
        };
    }

    private static String associate(String str) {

        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            return "sd";
        } else if (str.equals("^")) {
            return "ds";
        } else {
            return "";
        }
    }

    private static boolean isDigit(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;

    }

    public static int expressionEvaluation(Deque<String> postFixQueue){

        if(postFixQueue.isEmpty()){
            System.out.println("Error! Invalid Expression!");
            return Integer.MAX_VALUE;
        }
        Deque<Integer> postFixEval = new LinkedList<>();

        while(!postFixQueue.isEmpty()){

            String operation = postFixQueue.peek();

            if(getPrecedence(operation) >= 0){

                if(postFixQueue.isEmpty()){
                    System.out.println("Error! Postfixed expression is wrong. ");
                    break;
                }
                int op1 = postFixEval.pop();

                if(postFixQueue.isEmpty()){
                    System.out.println("Error! Postfixed expression is wrong. ");
                    break;
                }
                int op2 = postFixEval.pop();

                switch(operation){
                    case "+" -> postFixEval.push(op1 + op2);
                    case "-" -> postFixEval.push(op2 - op1);
                    case "/" -> postFixEval.push(op2 / op1);
                    case "*" -> postFixEval.push(op1 * op2);
                    case "^" -> postFixEval.push((int)Math.pow(op2, op1));
                    default -> System.out.println("Error! Postfixed expression is wrong.");
                };
            }else if((operation.matches("-?\\d+"))){
               postFixEval.push(Integer.parseInt(operation));
            }
            else{
                System.out.println("Error! Postfixed expression is wrong.");
                return Integer.MAX_VALUE;
            }
            postFixQueue.pop();
        }

        int result = postFixEval.pop();

        if(!postFixEval.isEmpty()){
            System.out.println("Error! Postfixed expression is wrong.");
            return Integer.MAX_VALUE;
        }

        return result;
    }

    public static void main(String[] args) {
//        String op = "5+2*-3ijk";
        String op = "((10 * (6 / ((9 + 3) * -11))) + 17) + 5";

        System.out.println("RPN? : " + postfixNotation(op));

        System.out.println("result expression: " + expressionEvaluation(postfixNotation(op)));

    }
}
