package easy;

import java.util.Scanner;

public class PalindromeNumber {

    /**
     * 
     * Given an integer num, return true if x is palindrome integer.
     * An integer is palindrome when it reads the same backward as forward.
     * For example, 121 is palindrome while 123 is not.
     * Follow up: Could you solve it without converting the integer to string?
     * 
     * @param num
     * @return
     */
    public static boolean isPalindrome(int num) { // ex: num = 12321
        if (num < 0) {
            return false;
        }

        int reversed = 0;
        int remainder, original = num;

        while (num != 0) {
            // num의 첫째자리수를 저장
            remainder = num % 10;

            // reversed에 저장된 숫자를 10을 곱해서 1의 자릿수를 비우고, 거기에 remainder를 넣음
            reversed = reversed * 10 + remainder;

            // 이전에 넣은 첫째자리수를 없앤다.
            num /= 10;

            System.out.println("remainder = " + remainder);
            System.out.println("reversed  = " + reversed);
        }

        return original == reversed;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Insert any integer: ");
        int num = scnr.nextInt();
        System.out.println(isPalindrome(num));
        scnr.close();
    }

}
