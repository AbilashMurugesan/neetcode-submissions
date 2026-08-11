class Solution {
    public int evalRPN(String[] A) {
        Stack<Integer> stack=new Stack<>();
        for(String c:A){
            switch(c){
                case "+"->{
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a+b);
                }
                case "-"->{
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a-b);
                }
                case "*"->{
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a*b);
                }
                case "/"->{
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a/b);
                }
                default->{
                    stack.push(Integer.parseInt(c));
                }
            }
        }
        return stack.pop();
    }
}
