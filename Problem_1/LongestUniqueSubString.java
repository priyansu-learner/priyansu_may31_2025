import java.util.HashSet;

public class LongestUniqueSubString {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        // Set to store unique characters in the current window
        HashSet<Character> set = new HashSet<>();

        // Two pointers (sliding window)
        int left = 0, right = 0;

        while (right < n) {
            // If character not in set, add and move right pointer
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                // Character repeated, remove from left side
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input1 = "abcabcbb";
        String input2 = "bbbbb";

        System.out.println("Input: " + input1 + " → Output: " + lengthOfLongestSubstring(input1)); // 3
        System.out.println("Input: " + input2 + " → Output: " + lengthOfLongestSubstring(input2)); // 1
    }
}
