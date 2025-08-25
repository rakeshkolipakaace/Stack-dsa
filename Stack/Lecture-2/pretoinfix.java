// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String> st = new Stack<>();

        for (int i = pre_exp.length() - 1; i >= 0; i--) {
            char c = pre_exp.charAt(i);

            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c > '0' && c < 9) {
                st.push(String.valueOf(c));
            } else {
                String t1 = st.pop();
                String t2 = st.pop();
                String res = "(" + t1 + c + t2 + ")";
                st.push(res);
            }

        }
        return st.peek();
    }
}
