package JavaPracticeGitHub.C24_StackQueue;

public class QueueCircularVector {

    private int maxElements = 5;
    private int read = 0;
    private int write = 0;
    private int[] circularVector = new int[maxElements];

    public QueueCircularVector(){}

    public QueueCircularVector(int maxElements){
        this.maxElements = maxElements;
        this.circularVector = new int[maxElements];
    }

    public int peek(){
        if(this.isEmpty()){
            System.out.println("Queue is empty!");
            return 0;
        }

        return this.circularVector[this.read];
    }

    public boolean enqueue(int e){
        if(this.read  == (this.write + 1) % this.circularVector.length){
            System.out.println("Queue is full!");
            return false;
        }
        circularVector[this.write] = e;
        System.out.println("circular length : " + this.circularVector.length);
        this.write = (this.write + 1) % this.circularVector.length;
        return true;
    }

    public int dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is empty!");
            return 0;
        }

        int returnedValue = this.circularVector[this.read];
        this.read = (this.read + 1) % this.circularVector.length;
        return returnedValue;
    }

    public boolean isEmpty(){
        return this.read == this.write;
    }
}
