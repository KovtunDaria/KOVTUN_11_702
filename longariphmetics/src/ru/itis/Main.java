package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number1 = scanner.next();
        String number2 = scanner.next();
        byte[] digits1 = toArray(number1);
        byte[] digits2 = toArray(number2);
        byte[] sum = sum(digits1, digits2);

        System.out.print(number1 + " + " + number2 + " = ");

        if (sum[sum.length-1] == 0 && sum.length!=1) {
            for (int i = sum.length-2; i >= 0; i--) {
                System.out.print(sum[i]);
            }
        } else {
            for (int i = sum.length-1; i >= 0; i--) {
                System.out.print(sum[i]);
            }
        }
    }

    static private byte[] toArray(String number) {
        byte[] input = new byte[number.length()];
        for (int i=0; i < number.length(); i++) {
            input[number.length()-i-1] = (byte)(number.charAt(i) - '0');
        }
        return input;
    }

    static private byte[] sum(byte[] a, byte[] b) {
        byte[] result = new byte[Math.max(a.length, b.length)+1];

        boolean fin = false;
        for (int i = 0; i < result.length-1; i++) {

            if (!fin && (a.length == i || b.length == i)) {
                fin = true;
            }

            if (!fin) {
                if (a[i] + b[i] >= 10) {
                    result[i] += (a[i] + b[i]) % 10;
                    result[i + 1] += 1;
                } else {
                    result[i] += a[i]+b[i];
                }
            } else {
                if (a.length > b.length) {
                    result[i] += a[i];
                } else {
                    result[i] += b[i];
                }
            }
        }
        return result;
    }
}
