class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] A, int t) {
        Arrays.sort(A);
        help(A,0,t,new ArrayList<>());
        return res;
    }
    private void help(int[] A,int idx,int rs,List<Integer> ans){
        if(rs==0){
            res.add(new ArrayList<>(ans));
        }else{
            for(int i=idx;i<A.length;i++){
                int a=A[i];
                if(i>idx && a==A[i-1]){
                    continue;
                }
                
                if(a>rs){
                    break;
                }
                ans.add(a);
                help(A,i+1,rs-a,ans);
                ans.remove(ans.size()-1);
            }
        }
    }
}
