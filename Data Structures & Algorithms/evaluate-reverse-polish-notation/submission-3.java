class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();

        for (String i : tokens) {
            if (!i.equals("+") && !i.equals("-") && !i.equals("*") && !i.equals("/")) {
                stack.push(Integer.parseInt(i));
            } else {
                if (!stack.isEmpty()) {
                    int first = stack.pop();
                    int second = stack.pop();
                    int result = 0;
                    switch (i) {
                        case "/":
                            result = second/first;
                            break;
                        case "+":
                            result = first + second;
                            break;
                        case "-":
                            result = second - first;
                            break;
                        case "*":
                            result = first * second;
                            break;
                        default:
                            break;
                    }
                    stack.push(result);
                }
            }
        }
        return stack.pop();
    }
}
