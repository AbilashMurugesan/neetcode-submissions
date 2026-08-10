class Solution {
    public int longestConsecutive(int[] A) {
        Set<Integer> set=new HashSet<>();
        for(int a:A){
            set.add(a);
        }
        
        int max=0; 
        int n=A.length; 
        
        for(int i=0;i<n;i++){
            int a=A[i];
            int cc=0;
            if(set.contains(a-1)){
                continue;
            }else{
                while(set.contains(a)){
                    cc++;
                    a++;
                }
            }
            max=Math.max(cc,max);
        }
        return max;
    }
}
