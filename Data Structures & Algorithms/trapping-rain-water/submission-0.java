class Solution {
    public int trap(int[] A) {
        int n=A.length;
        int[] l=new int[n];
        int[] r=new int[n];

        // 0,2,0,3,1,0,1,3,2,1
        int max=0;
        for(int i=0;i<n;i++){
            int a=A[i];
            max=Math.max(max,a);
            l[i]=max;
        }
        max=0;
        for(int i=n-1;i>=0;i--){
            int a=A[i];
            max=Math.max(max,a);
            r[i]=max;
        }
        int res=0;
        for(int i=0;i<n;i++){
            int min=Math.min(l[i],r[i]);
            res+=min-A[i];
        }
        return res;
    }
}
