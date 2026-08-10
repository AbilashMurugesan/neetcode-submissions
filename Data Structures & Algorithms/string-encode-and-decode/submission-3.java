class Solution {

    public String encode(List<String> A) {
        StringBuilder sb=new StringBuilder();
        for(String a:A){
            sb.append(a.length()).append("#").append(a);
        }
        return sb.toString();
    }

    public List<String> decode(String A) {
        int n=A.length();
        int i=0;
        List<String> res=new ArrayList<>();
        while(i<n){
            int j=i;
            while(A.charAt(j)!='#'){
                j++;
            }
            int l=Integer.parseInt(A.substring(i,j));
            i=j+1;
            res.add(A.substring(i,i+l));
            i=i+l;
        }
        return res;
    }
}
