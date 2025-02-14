
import java.util.Stack;


// problem link https://leetcode.com/problems/online-stock-span/
// [[], [100], [80], [60], [70], [60], [75], [85]]
// Output
// [null, 1, 1, 1, 2, 1, 4, 6]

class StockSpanner {
    private Stack<int[]> st; // Stack to store {price, span}

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1];
        }

        st.push(new int[]{price, span});
        return span;
    }
}
