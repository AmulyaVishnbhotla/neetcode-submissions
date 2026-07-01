class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(char i:s.toCharArray()){
            if(i == '[' || i == '{'|| i == '('){
                stack.push(i);
            }

            else if(i == ']' || i == '}'|| i == ')'){
                if(stack.isEmpty())
                    return false;
                char tmp = stack.peek();
                if(tmp == '[' && i != ']' ||
                    tmp == '{' && i != '}' ||
                    tmp == '(' && i != ')'
                ){
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }
}
