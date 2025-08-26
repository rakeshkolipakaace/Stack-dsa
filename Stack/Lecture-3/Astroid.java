//Brute force

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         List<Integer> list = new ArrayList<>();
        for (int a : asteroids) list.add(a);

        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < list.size() - 1; i++) {
                int left = list.get(i);
                int right = list.get(i + 1);
                if (left > 0 && right < 0) {
                    if (Math.abs(left) > Math.abs(right)) {
                        list.remove(i + 1); 
                    } else if (Math.abs(left) < Math.abs(right)) {
                        list.remove(i);
                    } else { 
                        list.remove(i + 1);
                        list.remove(i);
                    }
                    changed = true;
                    break; 
                }
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
        
    }
}



//optimal


class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       
        Stack<Integer>st=new Stack<>();

        

        for(int a:asteroids){
            boolean destroy=false;
            while(!st.isEmpty()&&a<0&&st.peek()>0){
                int sum=a+st.peek();
            
            if(sum<0){
                st.pop();
            }
            else if(sum>0){
                 destroy=true;
                 break;
            }
            else{
                st.pop();
               destroy=true;
                 break;
            }
        }
         if(!destroy){
            st.push(a);
        }

     }
     int s=st.size();
    int res[]=new int[s];

   for(int i=s-1;i>=0;i--){
    res[i]=st.pop();
   }
   return res;
   
        
    }
}