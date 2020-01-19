import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MinMaxStack stack = new MinMaxStack();

        stack.push(5);
        System.out.println(stack.getMin());
        System.out.println(stack.getMax());
        System.out.println(stack.peek());
        stack.push(7);
        System.out.println(stack.getMin()); 
        System.out.println(stack.getMax());
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.getMin());
        System.out.println(stack.getMax());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.getMin());
        System.out.println(stack.getMax());
        System.out.println(stack.peek());

    }
}

class MinMaxStack {
    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> minArray = new ArrayList<>();
    ArrayList<Integer> maxArray = new ArrayList<>();

    public int peek() {
        if (stack.size() != 0) {
            return stack.get(stack.size() - 1);
        }
        return -1;
    }

    public int pop() {
        if (stack.size() != 0) {
            minArray.remove(stack.size() - 1);
            maxArray.remove(stack.size() - 1);
            int num = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return num;
        }
        return -1;
    }

    public void push(Integer number) {
        stack.add(number);
        if (minArray.size() != 0) {
            int min = minArray.get(minArray.size() - 1);
            minArray.add(Math.min(min, number));

            int max = maxArray.get(maxArray.size() - 1);
            maxArray.add(Math.max(max, number));
        } else {
            minArray.add(number);
            maxArray.add(number);
        }
    }

    public int getMin() {
        if (stack.size() != 0) {
            return minArray.get(stack.size() - 1);
        }
        return -1;
    }

    public int getMax() {
        if (stack.size() != 0) {
            return maxArray.get(stack.size() - 1);
        }
        return -1;
    }
}