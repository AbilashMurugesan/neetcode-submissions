class Solution {
    public int findMin(int[] A) {
        int n=A.length;
        if(n==1){
            return A[0];
        }
        if(A[0]<A[n-1] && A[0]<A[1]){
            return A[0];
        }
        // 9 8 7 6 5
        if(A[0]>A[n-1] && A[n-1]<A[n-2]){
            return A[n-1];
        }
        int s=1;
        int e=n-2;
        while(s<=e){
            int m=(e-s)/2+s;
            if(A[m]<A[m-1] && A[m]<A[m+1]){
                return A[m];
            }else if(A[0]<A[m]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
}