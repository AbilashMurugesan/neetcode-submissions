class Solution {
    public boolean searchMatrix(int[][] A, int t) {
        int rs=A.length;
        int cs=A[0].length;
        int n=rs*cs;
        int s=0;
        int e=n-1;
        while(s<=e){
            int m=(e-s)/2+s;
            // rs=3 cs=4
            // m=11 m%rs m/cs 2,3 m/rs = 1 
            int c=m%cs;
            int r=m/cs;
            int mid=A[r][c];
            if(mid==t){
                return true;
            }else if(mid>t){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return false;
    }
}
