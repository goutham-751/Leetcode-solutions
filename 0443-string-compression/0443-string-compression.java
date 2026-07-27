class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;
        while (read < chars.length) {
            int count = 0;
            char ch = chars[read];
            while (read < chars.length && ch == chars[read]) {
                count++;
                read++;
            }
            chars[write++] = ch;
            if (count > 1) {

                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}