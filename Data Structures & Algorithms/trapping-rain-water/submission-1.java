class Solution {
    public int trap(int[] A) {
         int n=A.length;
        int l=0;
        int r=n-1;
        int lmax=0;
        int rmax=0;
        int res=0;
        while(l<=r){
            // System.out.println(lmax+" "+rmax+" "+A[l]+" "+A[r]);
            if(lmax<rmax){
                if(A[l]>lmax){
                    lmax=A[l];
                }else{
                    res+=lmax-A[l];
                }
                l++;
            }else{
                if(A[r]>rmax){
                    rmax=A[r];
                }else{
                    res+=rmax-A[r];
                }
                r--;
            }
        }
        return res;
    }
}