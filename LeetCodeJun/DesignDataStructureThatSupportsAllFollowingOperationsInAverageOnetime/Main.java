package LeetCodeChallenges.LeetCodeJun.DesignDataStructureThatSupportsAllFollowingOperationsInAverageOnetime;

public class Main {
    public static void main(String[] args) {
      RandomizedSet obj = new RandomizedSet();
      boolean param_1 = obj.insert(1);
      boolean param_2 = obj.remove(2);
      int param_3 = obj.getRandom();
        System.out.println(param_1 + " " +  param_2 + " " + param_3);
    }
}
