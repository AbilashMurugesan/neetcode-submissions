class MinStack {

    Stack<MyPair> stack;
    public MinStack() {
        stack=new Stack<>();
    }
    
    public void push(int a) {
        if(stack.isEmpty()){
            stack.push(new MyPair(a,a));
        }else{
            int m=stack.peek().m>a?a:stack.peek().m;
            stack.push(new MyPair(a,m));
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek().a;
    }
    
    public int getMin() {
        return stack.peek().m;
    }
}

class MyPair{
    int a;
    int m;
    public MyPair(int a,int m){
        this.a=a;
        this.m=m;
    }
}
