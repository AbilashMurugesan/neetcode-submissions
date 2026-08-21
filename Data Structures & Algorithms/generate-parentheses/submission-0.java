class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        help(n,0,0,new StringBuffer(""),res);
        return res;
    }
    private void help(int n,int oc,int cc,StringBuffer sb,List<String> res){
        if((oc+cc)==n*2){
            res.add(sb.toString());
            return ;
        }
        if(oc<n){
            sb.append("(");
            help(n,oc+1,cc,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
        if(cc<oc){
            sb.append(")");
            help(n,oc,cc+1,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
