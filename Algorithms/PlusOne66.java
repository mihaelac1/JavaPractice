package JavaPracticeGitHub.Algorithms;

import java.util.*;

public class PlusOne66 {
    public static int[] plusOne(int[] digits) {
        int carry = 0;
        int i = digits.length - 1;
        if (digits[i] + 1 >= 10) {
            digits[i] = 0;
            carry = 1;
        } else {
            digits[i] = digits[i] + 1;
        }

        while (i > 0 && carry == 1) {
            i--;
            if (digits[i] + carry >= 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = digits[i] + carry;
                carry = 0;
            }
        }

        if (carry == 1) {
            digits = Arrays.copyOf(digits, digits.length + 1);
            for (i = digits.length - 1; i > 0; i--) {
                digits[i] = digits[i - 1];
            }
            digits[0] = carry;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {8, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
