class Solution {
    public boolean isValid(String s) {
        Stack<Character> strStack = new Stack<>();

        for (char i:s.toCharArray()) {
            if (i == '{' || i == '[' || i == '(') {
                strStack.push(i);
            } else if (i == '}' || i == ']' || i == ')') {
                if (strStack.isEmpty()) {
                    return false;
                } else {
                    char tmp = strStack.peek();
                    if (tmp == '[' && i != ']' || tmp == '{' && i != '}'
                        || tmp == '(' && i != ')') {
                        return false;
                    }
                    strStack.pop();
                }
            }
        }

        return strStack.isEmpty();
    }
}
