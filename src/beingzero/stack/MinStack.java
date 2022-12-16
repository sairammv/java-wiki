package beingzero.stack;
import java.util.Stack;
class MinStack {
    Stack<Pair> stack;
    public MinStack() {
        stack = new Stack();
    }

    public void push(int val) {
        if(stack.isEmpty()) {
            Pair pair = new Pair();
            pair.value = val;
            pair.min = val;
            stack.push(pair);
        }else {
            Pair pair = new Pair();
            pair.value = val;
            if(val > stack.peek().min){
                pair.min = stack.peek().min;
            }else {
                pair.min = val;
            }
            stack.push(pair);
        }
    }
    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }
}
class Pair{
    int value;
    int min;
}