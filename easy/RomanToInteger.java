package easy;
import java.util.Scanner;

public class RomanToInteger {

    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * 'I' represents the value of 1.
     * 'V' represents the value of 5.
     * 'X' represents the value of 10.
     * 'L' represents the value of 50.
     * 'C' represents the value of 100.
     * 'D' represents the value of 500.
     * 'M' represents the value of 1000.
     * For example, 2 is written as II in Roman numeral, just two one's added together. 
     * 12 is written as XII, which is simply X + II. 
     * The number 27 is written as XXVII, which is XX + V + II. 
     * <p>
     * Roman numerals are usually written largest to smallest from left to right. 
     * However, the numeral for four is not IIII. Instead, the number four is 
     * written as IV. Because the one is before the five we subtract it making four. 
     * The same principle applies to the number nine, which is written as IX. 
     * There are six instances where subtraction is used:
     * 
     * 'I' can be placed before V (5) and X (10) to make 4 and 9.
     * 'X' can be placed before L (50) and C (100) to make 40 and 90. 
     * 'C' can be placed before D (500) and M (1000) to make 400 and 900.
     * 
     * Given a Roman numeral, this class converts it to an integer value. 
     * 
     * @param s a Roman numeral
     * @return the integer value of the Roman numeral parameter
     */
    public static int romanToInt(String s) {
        int value = 0;
        int index = 0;
        while (index < s.length()) {
            switch (s.charAt(index)) {
                case 'I':
                    if (index + 1 < s.length() && s.charAt(index + 1) == 'V') {
                        value += 4;
                        index += 2;
                    } else if (index + 1 < s.length() && s.charAt(index + 1) == 'X') {
                        value += 9;
                        index += 2;
                    } else {
                        value += 1;
                        index += 1;
                    }
                    break;

                case 'V':
                    value += 5;
                    index += 1;
                    break;
               
                case 'X':
                    if (index + 1 < s.length() && s.charAt(index + 1) == 'L') {
                        value += 40;
                        index += 2;
                    } else if (index + 1 < s.length() && s.charAt(index + 1) == 'C') {
                        value += 90;
                        index += 2;
                    } else {
                        value += 10;
                        index += 1;
                    }
                    break;
                
                case 'L':
                    value += 50;
                    index += 1;
                    break;
                    
                case 'C':
                    if (index + 1 < s.length() && s.charAt(index + 1) == 'D') {
                        value += 400;
                        index += 2;
                    } else if (index + 1 < s.length() && s.charAt(index + 1) == 'M') {
                        value += 900;
                        index += 2;
                    } else {
                        value += 100;
                        index += 1;
                    }
                    break;
                    
                case 'D':
                    value += 500;
                    index += 1;
                    break;
                    
                case 'M':
                    value += 1000;
                    index += 1;
                    break;

            }
        }


        return value;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Insert any Roman numeral:");
        System.out.println("ex: III (=3), LVIII (=58), MCMXCIV (=1994)");
        String input = scnr.next();
        System.out.println(romanToInt(input));
        scnr.close();

    }
}