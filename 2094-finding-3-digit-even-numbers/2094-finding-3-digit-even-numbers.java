class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];

        for (int d : digits) {
            freq[d]++;
        }

        List<Integer> ans = new ArrayList<>();

        for (int num = 100; num <= 998; num += 2) {

            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            int[] temp = new int[10];

            temp[a]++;
            temp[b]++;
            temp[c]++;

            boolean possible = true;

            for (int i = 0; i < 10; i++) {
                if (temp[i] > freq[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                ans.add(num);
            }
        }

        int[] res = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}