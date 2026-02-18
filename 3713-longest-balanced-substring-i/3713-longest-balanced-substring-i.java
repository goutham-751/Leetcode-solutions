class Solution {
    public int longestBalanced(String s) {

        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];

            for (int j = i; j < n; j++) {

                freq[s.charAt(j) - 'a']++;

                int target = 0;
                boolean balanced = true;

                for (int f : freq) {
                    if (f > 0) {
                        if (target == 0) target = f;
                        else if (f != target) {
                            balanced = false;
                            break;
                        }
                    }
                }

                if (balanced) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
}
