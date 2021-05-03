package JavaPracticeGitHub.C24_StackQueue;

public class MainQueue {
    public static void main(String[] args) {

        QueueCircularVector queue = new QueueCircularVector();

        System.out.println(queue.enqueue(1));
        System.out.println(queue.enqueue(2));
        System.out.println(queue.enqueue(3));
        System.out.println(queue.enqueue(4));
        System.out.println(queue.enqueue(5));
        System.out.println(queue.enqueue(6));
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println();
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println();
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println();
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println();
        System.out.println(queue.peek());

    }
}
