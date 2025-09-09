import java.util.Stack;

class MyQueue {
    Stack<Integer> Stin;
    Stack<Integer> Stout;

    public MyQueue() {
        Stin = new Stack<>();
        Stout = new Stack<>();
    }

    // Enqueue
    public void push(int x) {
        Stin.push(x);
    }

    // Dequeue
    public int pop() {
        if (Stout.isEmpty()) {
            while (!Stin.isEmpty()) {
                Stout.push(Stin.pop());
            }
        }
        return Stout.pop();
    }

    // Peek
    public int peek() {
        if (Stout.isEmpty()) {
            while (!Stin.isEmpty()) {
                Stout.push(Stin.pop());
            }
        }
        return Stout.peek();
    }

    // Empty check
    public boolean empty() {
        return Stin.isEmpty() && Stout.isEmpty();  // use && instead of &
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */