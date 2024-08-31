
// public static void main(String[] args) {
// int x = 10;
// int y = 5;
// int z = x-- - --y + x++ + ++y;
// System.out.println(z);
// }

// public static void main(String[] args) {
// int x = 5;
// int result = x++ - --x + x-- - --x;
// System.out.println(result);
// }

// public static void main(String[] args) {
// int x = 12;
// x = x++;
// x = x++;
// x = x++;
// x = ++x;
// x = x++;
// System.out.println(x);

// int a = 8;
// int b = 12;
// int c = ++a + b++;
// c--;
// --b;
// int d = c-- + ++b + ++a;
// int e = a + ++b + c + d++;
// System.out.println(++e);
// }

// public static void main(String[] args) {
// // int a = 12;
// // int b = a++;
// // b++;
// // int c = a++ + --b;

// // int a = 10;
// // a++;
// // int b = ++a;
// // int c = a++ + ++b;
// // b++;

// // System.out.println(a);
// // System.out.println(b);
// // System.out.println(c);
// }

//public static void main(String[] args) {
// int x = 12;
// int y = x++ + ++x;
// y++;
// int z = ++y;
// int p = x++ - ++y + z++;

// int a = 12;
// int b = ++a;
// b++;
// int c = a++ + --b;
// int d = a++ + ++b + c++;
// d++;
// c--;

// int a = 12;
// a++;
// ++a;
// int b = a++;
// b++;
// int c = a++ + --b;
// c--;
// --b;
// int d = ++a + b++ + --c;
// System.out.println(a);
// System.out.println(b);
// System.out.println(c);
// System.out.println(d);

// int a = 20;
// int b = 30;
// System.out.println(a++ > 25 && b++ > 20);
// System.out.println(a);
// System.out.println(b);

// int a = 20;
// int b = 30;
// System.out.println(a++ > 25 || b++ > 20);
// System.out.println(a);
// System.out.println(b);

// int x = 10;
// int y = 5;
// int z = (x > y) ? (x < 15 ? x : y) : (x > 5 ? y : x);

// System.out.println(z);

// int x = 10;
// int y = 5;
// int z = 7;
// int result = (x < y) ? (y < z) ? z : y : x;
// System.out.println(result);

// int a = 5;
// int b = 10;
// int c = (a > b) ? b++ : (a < b) ? --b : b;
// System.out.println(c);

// }
//}
/* Conditonal OPERATOR */
// public class Practice {
//     public static void main(String[] args) {
//         // int a = 10;
//         // int b = 8;
//         // int c = a > b ? a : b;
//         // System.out.println(c);

//         Scanner sc = new Scanner(System.in);

//         // char ch = sc.next().charAt(0);
//         // int num = sc.nextInt();

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         // String res = (ch >= 'a' && ch <= 'z') ? "character is alphabate" : "Character
//         // is not alphabate";

//         // String res = (ch >= 'a' && ch <= 'z') ? ch + " UpeerCase" : ch + "
//         // LowerCase";

//         // String res = (num % 5 == 0 && num % 11 == 0) ? num + " is divisible by 5 and
//         // 7"
//         // : num + " is not divisible by 5 and 7";

//         // String res = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//         // || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
//         // ? ch + " alphabate is Vowel"
//         // : ch + " alphabate is Consonent";
//         String res = (a + b >= c) && (a + c >= b) && (c + b >= a) ? "triangle is valid" : "triangle is invalid";
//         System.out.println(res);

//     }

// }

public class Practice {

    public static void main(String[] args) {
        int x = 15;
        // if (x > 5) {
        // System.out.println("A");
        // } else if (x > 7) {
        // System.out.println("B");
        // } else {
        // System.out.println("C");
        // }

        if (x > 10)
            if (x < 20)
                System.out.println("A");
            else
                System.out.println("B");

    }

}