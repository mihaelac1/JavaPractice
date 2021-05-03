package JavaPracticeGitHub.Algorithms;

import java.util.*;

public class InsertDeleteGetRandom380 {
    ArrayList<Integer> myArrayList;

    /**
     * Initialize your data structure here.
     */
    public InsertDeleteGetRandom380() {
        this.myArrayList = new ArrayList<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (this.myArrayList.add(val)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (this.myArrayList.remove(Integer.valueOf(val))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        Random rand = new Random();
        return this.myArrayList.get(rand.nextInt(this.myArrayList.size()));
    }

    public static void main(String[] args) {
        int val = 2;
        InsertDeleteGetRandom380 obj = new InsertDeleteGetRandom380();
        obj.insert(1);
        obj.insert(5);
        obj.insert(8);
        System.out.println(obj.insert(val));
        System.out.println(obj.remove(val));
        System.out.println(obj.getRandom());
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

