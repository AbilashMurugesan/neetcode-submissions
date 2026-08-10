class Solution {
    public int maxArea(int[] A) {
        int n=A.length;
        int l=0;
        int r=n-1;
        int max=0;

        while(l<r){
            int a=A[l];
            int b=A[r];
            // 1,7,2,5,4,7,3,6
            int min=0;
            if(a<b){
                
                min=a*(r-l);;
                l++;
            }else{
                
                min=b*(r-l);
                r--;
            }
            // int c=min
            // System.out.println(c);
            max=Math.max(max,min);
        }
        return max;
    }
}
