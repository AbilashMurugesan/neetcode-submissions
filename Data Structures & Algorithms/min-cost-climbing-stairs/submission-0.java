class Solution {
    public int minCostClimbingStairs(int[] A) {
        int n=A.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(help(A,0,dp),help(A,1,dp));
    }
    private int help(int[] A,int idx,int[] dp){
        if(idx>=A.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        return dp[idx]= A[idx]+Math.min(help(A,idx+1,dp),help(A,idx+2,dp));
    }
}