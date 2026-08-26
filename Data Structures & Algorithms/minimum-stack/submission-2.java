class MinStack {

    class augInt {
        int val;
        int min;

        augInt(int val, int min) {
            this.val = val;
            this.min = min;
        }

    }
    
    private int min;
    private ArrayList<augInt> stack;
    
    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        if (val < min) { min = val; }
        stack.add(new augInt(val, min));
    }
    
    public void pop() {
        if (stack.size() == 1) {
            stack.remove(stack.size()-1);
            min = Integer.MAX_VALUE;
        } else {
            stack.remove(stack.size()-1);
            min = getMin();
        }

    }
    
    public int top() {
        return stack.get(stack.size()-1).val;
    }
    
    public int getMin() {
        return stack.get(stack.size()-1).min;
    }
}
