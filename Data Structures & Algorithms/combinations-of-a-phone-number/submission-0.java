class Solution {
    String[] map=new String[10];
    List<String> res=new ArrayList<>();
    public List<String> letterCombinations(String A) {
        if(A.length()==0){
            return res;
        }
        // Map<Integer,List<Character>> map=new HashMap<>();
        // map.add(2,Arrays.asList('a','b','c'));
        // map.add(3,Arrays.asList('d','e','f'));
        // map.add(4,Arrays.asList('g','h','i'));
        // map.add(5,Arrays.asList('j','k','l'));
        // map.add(6,Arrays.asList('m','n','o'));
        // map.add(7,Arrays.asList('p','q','r','s'));
        // map.add(8,Arrays.asList('t','u','v'));
        // map.add(9,Arrays.asList('w','x','y','z'));
        
        map[2]="abc";
        map[3]="def";
        map[4]="ghi";
        map[5]="jkl";
        map[6]="mno";
        map[7]="pqrs";
        map[8]="tuv";
        map[9]="wxyz";
        help(A,0,new String());
        return res;
    }

    private void help(String A,int idx,String ans){
        int n=A.length();
        if(idx==n){
            res.add(ans);
            return ;
        }
        String num=map[Character.getNumericValue(A.charAt(idx))];
        for(char c:num.toCharArray()){
            help(A,idx+1,ans+c);
        }
    }
}