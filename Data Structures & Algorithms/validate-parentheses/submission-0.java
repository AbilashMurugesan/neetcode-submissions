class Solution {
    public boolean isValid(String A) {
        Stack<Character> s=new Stack<>();
        for(char c:A.toCharArray()){
            if(c=='(' || c =='{' || c=='['){
                s.push(c);
            }else{
                if(s.size()==0){
                    return false;
                }
                if(c==')'){
                    if(s.pop()!='('){
                        return false;
                    }
                }
                if(c=='}'){
                    if(s.pop()!='{'){
                        return false;
                    }
                }
                if(c==']'){
                    if(s.pop()!='['){
                        return false;
                    }
                }
            }
        }
        return s.size()==0;
    }
}
