package easy;

public class LongestCommonPrefix {
    
    public boolean isValid(String s) {
        
        int i = 0;
        
        if(s == null || s == "" || s.length() % 2 == 1 ) {
            return false;
        }
        
        while(i <= s.length()) {
            switch(s.charAt(i)) {
                case '(':
                    if(s.charAt(i + 1) != ')') {
                        return false;
                    }
                    i += 2;
                    break;
                case '{':
                    if(s.charAt(i + 1) != '}') {
                        return false;
                    }
                    i += 2;
                    break;
                case '[':
                    if(s.charAt(i + 1) != ']') {
                        return false;
                    }
                    i += 2;
                    break;
                default: 
                    return false;
            }
        }
    
        return true;
    }

}
