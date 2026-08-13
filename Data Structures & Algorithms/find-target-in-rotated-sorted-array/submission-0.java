class Solution {
    public int search(int[] A, int t) {
        // 9 8 7 6 1 2 3 4
        int s=0;
        int n=A.length;
        int e=n-1;
        while(s<=e){
            int m=(e-s)/2+s;
            if(A[m]==t){
                return m;
                // 1 2 3 4
            }else if(A[s]<=A[m]){
                if(A[s]<=t && t<A[m]){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }else{
                // 1 2 3 4
                if(A[m]<t && t<=A[e]){
                    s=m+1;
                }else{
                    e=m-1;
                }
            }
        }
        return -1;
    }
}
