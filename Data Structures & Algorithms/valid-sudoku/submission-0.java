class Solution {
    public boolean isValidSudoku(char[][] A) {
        Map<Integer,Set<Character>> rm=new HashMap<>();
        Map<Integer,Set<Character>> cm=new HashMap<>();
        Map<String,Set<Character>> matMap=new HashMap<>();

        int rs=A.length;
        int cs=A[0].length;
        for(int r=0;r<rs;r++){
            for(int c=0;c<cs;c++){
                char a=A[r][c];
                if(a=='.'){
                    continue;
                }
                if(rm.containsKey(r) && rm.get(r).contains(a)) {
                    return false;
                }else{
                    rm.putIfAbsent(r,new HashSet<>());
                    rm.get(r).add(a);
                }
                if(cm.containsKey(c) && cm.get(c).contains(a)){
                    return false;
                }else{
                    cm.putIfAbsent(c,new HashSet<>());
                    cm.get(c).add(a);
                }
                int rr=r/3;
                int rc=c/3;

                String mat=rr+""+rc;
                if(matMap.containsKey(mat) && matMap.get(mat).contains(a)){
                    return false;
                }else{
                    matMap.putIfAbsent(mat,new HashSet<>());
                    matMap.get(mat).add(a);
                }
            }
        }
        return true;
    }
}
