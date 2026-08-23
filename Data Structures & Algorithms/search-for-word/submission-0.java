class Solution {
    public boolean exist(char[][] A, String t) {
        int rs=A.length;
        int cs=A[0].length;
        for(int r=0;r<rs;r++){
            for(int c=0;c<cs;c++){
                if(help(A,t,r,c,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean help(char[][] A, String t, int r,int c,int idx){
        int rs=A.length;
        int cs=A[0].length;
        if(idx==t.length()){
            return true;
        }else if(r<0 || r>=rs || c<0 || c>=cs || A[r][c]!=t.charAt(idx) || A[r][c]=='#'){
            return false;
        }else{
            char a=A[r][c];
            A[r][c]='#';
            boolean res=help(A,t,r+1,c,idx+1) || help(A,t,r,c+1,idx+1) || help(A,t,r-1,c,idx+1) || help(A,t,r,c-1,idx+1);
            
             
            A[r][c]=a;

            return res;
        }
    }
}