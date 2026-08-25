class Solution {
    public int climbStairs(int n) {
        // n;
        int res=0;
        int a=0;
        int b=1;
        if(n==0|| n==1){
            return n;
        }
        for(int i=0;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}