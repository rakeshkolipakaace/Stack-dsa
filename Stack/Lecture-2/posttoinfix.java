// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        
        // code here
        Stack<String>st=new Stack<>();
        
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            
            if(c>='A'&&c<='Z'||c>='a'&&c<='z'||c>'0'&&c<9){
               st.push(String.valueOf(c));
            }
            else {
                String t1=st.pop();
                String t2=st.pop();
                String res= "(" + t2 + c + t1 + ")";
                st.push(res); 
            }
            
        }
        return st.peek();
        
    }
}
