class Solution {
    public int maxProfit(int[] A) {
        int n=A.length;
        int cs=A[n-1];
        int max=0;
        for(int i=n-2;i>=0;i--){
            int a=A[i];
            if(a>cs){
                cs=a;
            }
            max=Math.max(max,cs-a);
        }
        return max;
    }
}
