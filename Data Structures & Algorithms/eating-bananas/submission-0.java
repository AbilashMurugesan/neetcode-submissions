class Solution {
    public int minEatingSpeed(int[] A, int h) {
        int s=1;
        int e=1;
        int min=Integer.MAX_VALUE;
        for(int a:A){
            s=Math.min(s,a);
            e=Math.max(e,a);
        }
        // while(s<=e){
        //     int m=(e-s)/2+s;
        //     if(canEat(A,h,m)){
        //         res=m;
        //         e=m-1;
        //     }else{
        //         s=m+1;
        //     }
        // }
        while(s<=e){
            int m=(e-s)/2+s;
            System.out.println(m);
            if(canEat(A,h,m)){
                System.out.println(m+"------");
                if(m<min){
                    min=m;
                    e=m-1;
                }
            }else{
                s=m+1;
            }
        }
        return min;
    }
    private boolean canEat1(int[] A,int h,int k){
        int ch=0;
        for(int a:A){
            ch+=a/k;
            if(a%k!=0){
                ch++;
            }
            if(ch>h){
                return false;
            }
        }
        return true;
    }
    boolean canEat(int[] A,int t,int m){
        int n=A.length;
        int h=0;
        // System.out.println(A+" "+m);
        for(int i=0;i<n;i++){
            int div=A[i]/m;
            h+=div;
            int rem=A[i]%m==0?0:1;
            h+=rem;
            if(h>t){
                System.out.println("res"+" "+false);
                return false;
            }
        }
        System.out.println("res"+" "+true);
        return true;
    }
}
