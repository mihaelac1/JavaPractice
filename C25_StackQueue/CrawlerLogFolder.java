package JavaPracticeGitHub.C25_StackQueue;

import java.util.Deque;
import java.util.LinkedList;

public class CrawlerLogFolder {

    public int minOperationsStack(String[] logs) {
        Deque<String> root = new LinkedList<>();

        for(String log : logs){
            switch(log){
                case "../" -> {
                    if(!(root.size() == 0)){
                        root.pop();
                    }
                }
                case "./" -> root.peek();
                default -> root.push(log);
            };
        }

        return root.size();
    }

    public int minOperationsCounter(String[] logs) {
        int counter = 0;

        for(String log : logs){

            if(log.equals("../")) counter = Math.max(0, --counter);
            else if(log.equals("./")) continue;
            else counter++;
        }
        return counter;
    }
}
