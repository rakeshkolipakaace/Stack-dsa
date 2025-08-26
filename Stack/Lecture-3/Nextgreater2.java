class Solution {
    public int[] nextGreaterElements(int[] nums) {

        // brute force
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int nextIndex = (i + j) % n;
                if (nums[nextIndex] > nums[i]) {
                    ans[i] = nums[nextIndex];
                    break;
                }
            }
        }
        return ans;

        // optimal
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 1; i < 2 * n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i % n]) {
                ans[st.pop()] = nums[i % n];
            }
            st.push(i % n);

        }
        return ans;

    }
}