package collectionFramework.digitProgram;

import java.util.Scanner;

public class Digit {

    // Each Digit
    public static void getDigit(int a) {
        int newNum = 0;
        while (a > 0) {
            newNum = a % 10;
            System.out.println(newNum);
            a = a / 10;
        }

    }

    // Even Digit
    public static void getEvenDigit(int a) {
        int newNum = 0;
        while (a > 0) {
            newNum = a % 10;
            if (newNum % 2 == 0) {
                System.out.println(newNum);
            }
            a = a / 10;
        }

    }

    // Odd Digit
    public static void getOddDigit(int a) {
        int newNum = 0;
        while (a > 0) {
            newNum = a % 10;
            if (newNum % 2 != 0) {
                System.out.println(newNum);
            }
            a = a / 10;
        }

    }

    // digit > 5
    public static void getDigitGreater(int a) {
        int newNum = 0;
        while (a > 0) {
            newNum = a % 10;
            if (newNum > 5) {
                System.out.println(newNum);
            }
            a = a / 10;
        }

    }

    // Count digit in a Number
    public static void getCountDigit(int a) {
        int count = 0;
        int newNum = 0;
        while (a > 0) {
            newNum = a % 10;
            count++;
            a = a / 10;
        }

        System.out.println(count);
    }

    // count even Digit
    public static void countEvenDigit(int a) {
        int count = 0;
        int newNum = 0;
        while (a > 0) {
            newNum = a % 10;
            if (newNum % 2 == 0) {
                count++;
            }
            a = a / 10;
        }
        System.out.println(count);
    }

    // count odd digit

    public static void countOddDigit(int a) {
        int count = 0;
        int newNum = 0;
        while (a > 0) {
            newNum = a % 10;
            if (newNum % 2 != 0) {
                count++;
            }
            a = a / 10;
        }
        System.out.println(count);
    }

    // Biggest digit of num
    public static void getDigitMax(int a) {
        int newNum = 0;
        int maxi = a % 10;
        while (a > 0) {
            newNum = a % 10;
            if (maxi < newNum) {
                maxi = newNum;
            }
            a = a / 10;
        }
        System.out.println(maxi);

    }

    // Difference of bigest and smallest

    public static void diffBwMaxAndMin(int a) {
        int newNum = 0;
        int maxi = a % 10;
        int min = a % 10;
        while (a > 0) {
            newNum = a % 10;
            if (maxi < newNum) {
                maxi = newNum;
            }

            if (min > newNum) {
                min = newNum;
            }
            a = a / 10;
        }
        System.out.println(maxi - min);

    }

    // check product of digit even or odd

    public static void getProductEvenOdd(int a) {
        int newNum = 0;
        int res = 1;
        while (a > 0) {
            newNum = a % 10;
            res = res * newNum;
            a = a / 10;
        }
        System.out.println(res);
    }

    // calculate sum of digit

    public static void getDigitSum(int a) {
        int newNum = 0;
        int res = 0;
        while (a > 0) {
            newNum = a % 10;
            res = res + newNum;
            a = a / 10;
        }
        System.out.println(res);
    }

    // sum of even digit
    public static void getEvenDigitSum(int a) {
        int newNum = 0;
        int res = 0;
        while (a > 0) {
            newNum = a % 10;
            if (newNum % 2 == 0) {
                res = res + newNum;
            }

            a = a / 10;
        }
        System.out.println(res);
    }

    // Factorial Of Each Digit
    public static void getFactorialOfDigit(int a) {
        int num = 0;
        int res = 0;
        while (a > 0) {
            num = a % 10;
            int fact = 1;
            int i = 1;
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            System.out.println(num + "! =" + fact);
            a = a / 10;
        }

    }

    // Factorial Of each Digit
    public static void getFactorialSum(int a) {
        int num = 0;
        int res = 0;
        while (a > 0) {
            num = a % 10;
            int fact = 1;
            int i = 1;
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            res = res + fact;
            a = a / 10;
        }
        System.out.println(res);
    }

    // Number is STRONG OR nOT

    public static boolean isStrong(int a) {
        int num = 0;
        int original = a;
        int res = 0;
        while (a > 0) {
            num = a % 10;
            int i = 1;
            int fact = 1;
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            res = res + fact;
            a = a / 10;
        }
        if (original == res) {
            return true;
        }
        return false;
    }

    // Reverse the Number
    public static void getReverse(int num) {
        int val = 0;
        int res = 0;

        while (num > 0) {
            val = num % 10;
            res = res * 10 + val;

            num = num / 10;
        }
        System.out.println(res);
    }

    // Check palendrom or not

    public static boolean isPallendrome(int num) {
        int val = 0;
        int OldVal = num;
        int res = 0;

        while (num > 0) {
            val = num % 10;
            res = res * 10 + val;

            num = num / 10;
        }
        if (OldVal == res) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        // getDigit(n);
        // getEvenDigit(n);
        // getOddDigit(n);
        // getDigitGreater(n);
        // getCountDigit(n);
        // countEvenDigit(n);
        // countOddDigit(n);
        // getDigitMax(n);
        // diffBwMaxAndMin(n);
        // getProductEvenOdd(n);
        // getDigitSum(n);
        // getEvenDigitSum(n);
        // getFactorialSum(n);
        // getFactorialOfDigit(n);
        // if(isStrong(n)) {
        // System.out.println("Number is Strong Number");
        // }else {
        // System.out.println("Number is Not Strong");
        // }

        // getReverse(n);

        if (isPallendrome(n)) {
            System.out.println("Number is Pallendrome Number");
        } else {
            System.out.println("Number is Not Pallendrome Number");
        }
        sc.close();
    }
}
