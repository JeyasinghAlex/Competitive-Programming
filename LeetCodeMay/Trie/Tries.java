package LeetCodeChallenges.LeetCodeMay.Trie;

public class Tries {

    public static void main(String[] args) {
            Trie obj = new Trie();
            obj.insert("alex");
            obj.insert("pravin");
            obj.insert("jebasuthen");
            obj.delete("alex");

        System.out.println(obj.search("alex"));
        System.out.println(obj.search("jebasuthen"));
        System.out.println(obj.search("pravin"));
        System.out.println(obj.startWith("prakjb"));

    }
}
