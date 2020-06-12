package LeetCodeChallenges.LeetCodeJun.DesignDataStructureThatSupportsAllFollowingOperationsInAverageOnetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizedSet {
/*    Design a data structure that supports all following operations in average O(1) time. */
    private List<Integer> list;
    private Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (list.contains(val))
            return false;
        else
            list.add(val);

        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!list.contains(val))
            return false;
        list.remove(new Integer(val));

        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
            return list.get(random.nextInt(list.size()));
    }
}
