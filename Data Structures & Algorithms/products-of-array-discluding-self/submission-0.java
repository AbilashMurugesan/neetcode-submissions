class Solution {
    public int[] productExceptSelf(int[] A) {
        // 1  2  3  4
        // 1  2  6  24
        // 24 24 12 4
        // 24 12 8  6
        int n=A.length;
        int[] r=new int[n];
        int[] l=new int[n];  

        int s=1;
        for(int i=0;i<n;i++){
            int a=A[i];
            s*=a;
            l[i]=s;
        } 
        s=1;
        for(int i=n-1;i>=0;i--){
            int a=A[i];
            s*=a;
            r[i]=s;
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(l[i]+" "+r[i]);
        // }
        for(int i=0;i<n;i++){
            int le=1;
            int re=1;
            if(i>0){
                le=l[i-1];
            }
            if(i<n-1){
                re=r[i+1];
            }
            A[i]=le*re;
        }
        return A;
    }
}