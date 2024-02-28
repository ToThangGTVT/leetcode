import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("START");
        System.out.println(solution.lengthOfLongestSubstring("zdvdfr"));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Integer, String> hashtable = new HashMap<>();
        hashtable.put(0, "");
        int index = 0;
        for (Character character: s.toCharArray()) {
            if (hashtable.containsValue(String.valueOf(character))) {
                index++;
            }
            hashtable.put(index, hashtable.get(index) + character);
            if (hashtable.size() > max) {
                max = hashtable.size();
            }

            System.out.println(hashtable);
            System.out.println("============================");
        }

        return max;
    }
}