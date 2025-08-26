// brute force

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            res.add(-1);
        }

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    res.set(i, arr[j]);
                    break;
                }
            }
        }

        return res;
    }
}

// optimal solution
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            res.add(-1);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();

            }
            if (!st.isEmpty()) {
                res.set(i, st.peek());

            }
            st.push(arr[i]);
        }
        return res;
    }
}