package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

import java.util.concurrent.TimeUnit;

//used to implement a mechanism for sharing surprises
abstract class AbstractGiveSurprise {
    private IBag bag;
    private int waitTime;
    private Factory factoryBag = new Factory();

    public AbstractGiveSurprise(String typeOfBag, int waitTime){
        this.bag = this.factoryBag.makeBag(typeOfBag);
        this.waitTime = waitTime;
    }

    public void put(ISurprise surprise){
        this.bag.put(surprise);
    }

    public void put(IBag bag){
        this.bag.put(bag);
    }

    public void give(){
       this.bag.takeOut().enjoy();
    }

    public void giveAll(){
        while(!this.bag.isEmpty()){
            this.bag.takeOut().enjoy();
            try {
                TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public boolean isEmpty(){
        return this.bag.isEmpty();
    }

    abstract void giveWithPassion();

    @Override
    public String toString() {
        return "AbstractGiveSurprise{" +
                "bag=" + bag +
                '}';
    }
}
