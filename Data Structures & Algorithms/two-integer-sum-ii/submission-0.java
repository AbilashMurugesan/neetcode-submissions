class Solution {
    public int[] twoSum(int[] A, int t) {
        int n=A.length;
        int l=0;
        int r=n-1;

        while(l<r){
            int a=A[l]+A[r];
            if(a>t){
                r--;
            }else if(a<t){
                l++;
            }else{
                return new int[]{l+1,r+1};
            }
        }
        return new int[]{-1,-1};
    }
}