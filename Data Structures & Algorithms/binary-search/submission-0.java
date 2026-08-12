class Solution {
    public int search(int[] A, int t) {
        int n=A.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int m=(r-l)/2+l;
            if(A[m]==t){
                return m;
            }else if(A[m]>t){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return -1;
    }
}
