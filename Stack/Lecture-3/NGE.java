
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        int n=indices.length;
        int m=arr.length;
        int res[]=new int[n];
        
        for(int i=0;i<n;i++){
            int idx=indices[i];
            int count=0;
            
        
        for(int j=idx+1;j<m;j++){
            if(arr[j]>arr[idx]){
                count++;
            }
            
        }
          res[i]=count;
            
        }
        return res;
        
    }
}
