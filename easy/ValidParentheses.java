package easy;

import java.util.ArrayList;

public class ValidParentheses {
    
    /**
     * 
     * Given a string s containing just the characters '(', ')', '{', '}', 
     * '[' and ']', determine if the input string is valid.
     * 
     * An input string is valid if:
     * 1. Open brackets must be closed by the same type of brackets.
     * 2. Open brackets must be closed in the correct order.
     * 
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        
        ArrayList<Character> stack = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) == '(') {
                stack.add(')');
            }
            else if(s.charAt(i) == '{') {
                stack.add('}');
            }
            else if(s.charAt(i) == '[') {
                stack.add(']');
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                else if(s.charAt(i) == stack.get(stack.size() - 1)) {
                    stack.remove(stack.size() - 1);
                }
                else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));      // ( ) [ ] { }
        System.out.println(isValid("({})"));        // ( { } )
        System.out.println(isValid("(])"));         // ( ]
        System.out.println(isValid(")"));           // )
    }
}
