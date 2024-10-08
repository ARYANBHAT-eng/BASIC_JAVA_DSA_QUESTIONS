import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Simpleinterest {
  public static void main(String[] args) throws java.lang.Exception {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int largest =Integer.MIN_VALUE;
  for (int i = 1; i <= n; i++) {
   for (int j = 1; j <= m; j++) {
    int a = scanner.nextInt();
    if (a>largest) {
      largest = a;
      
    }} }
    System.out.println(largest);
  }
}
// Scanner Sc = new Scanner(System.in);
// int n = Sc.nextInt();
// double maxScore = 80 * n;
// double marks = 0;
// for (int i = 1; i <= n; i++) {
// marks += Sc.nextDouble();
// }
// double finalPercentage = marks / maxScore * 100;

// {
// System.out.printf("%.2f", finalPercentage);
// System.out.print("%");
// }

// Scanner SC = new Scanner(System.in);

// int n = SC.nextInt();
// for (int i = 1; i <= n; i++) {
// int sq = SC.nextInt();
// long ans = (long) sq;
// System.out.println(ans * ans);

// }

// int n = SC.nextInt();
// int s = SC.nextInt();
// for (int i = 0; i < s; i++) {
// int O = SC.nextInt();

// if (n > O) {
// n -= O;
// System.out.println("Enjoy your dessert!");
// break;
// } else {
// System.out.println("Sorry, we are all out!");
// }
// }

// primitive datatypes use passbyValu
// non primitive data types use passbyRefrence
// 1 , x1231
// public static void add(int n, int[] arx, boolean qwe, String s, String[] S,
// boolean[] porn) {
// n = 100;
// arx[0] = 100;
// arx[1] = 200;
// qwe = false;
// s = "rahul";

// S[0] = "R";
// S[1] = "A";
// porn[0] = true;
// porn[1] = true;

// // n - x12001 = 100
// // arr[0] - x1231 = 100
// }

// public static void main(String[] args) {
// boolean[] porn = { false, false };
// int x = 1;
// int[] arr = new int[2];
// boolean flag = true;
// arr[0] = 1;
// arr[1] = 0;
// String s = new String("aryan");
// String[] str = { "rahul", "aryan" };

// // x - x100 , arr[0] - x1231 arr[1] - x1235
// System.out.println(porn[0] + " " + porn[1]);
// System.out.println(str[0] + " " + str[1]);
// System.out.println(s);
// System.out.println(flag);
// System.out.println(arr[0] + " " + arr[1]); // 1 0
// System.out.println(x); // 1
// add(x, arr, flag, s, str, porn);
// // 1 , x1231
// System.out.println(x);// 1
// System.out.println(arr[0] + " " + arr[1]);// 1 0
// System.out.println(flag);
// System.out.println(s);
// System.out.println(str[0] + " " + str[1]);
// System.out.println(porn[0] + " " + porn[1]);
// }

// }

// public static boolean isPalindrome(String word) {
// // Handle case sensitivity and non-alphanumeric characters
// int left = 0;
// int right = word.length() - 1;

// while (left < right) {
// if (word.charAt(left) != word.charAt(right)) {
// return false;
// }
// left++;
// right--;
// }
// return true;
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter a word: ");
// String word = scanner.nextLine();

// if (isPalindrome(word)) {
// System.out.println(word + " is a palindrome.");
// } else {
// System.out.println(word + " is not a palindrome.");
// }
// }
// }

// Scanner S = new Scanner(System.in);
// int n = S.nextInt();
// for (int i = 0; i < n; i++) {
// int T = S.nextInt();
// int H = S.nextInt();

// if (T >= 30 && H >= 90) {
// System.out.println("Hot and Humid");
// } else if (T >= 30 && H < 90) {
// System.out.println("Hot");
// } else if (T < 30 && H >= 90) {
// System.out.println("Cool and Humid");
// } else if (T < 30 && H < 90) {
// System.out.println("Cool");
// } else {
// System.out.println("Invalid Input");
// }

// }
// Scanner sc = new Scanner(System.in);
// int age = sc.nextInt();
// String name = sc.nextLine();

// System.out.println("hello" + name + " next year you will be " + (age + 1) +
// "year");

// Scanner sc = new Scanner(System.in);
// String R = sc.nextLine();
// int P = 0;
// String name = "";
// String yearOfBirth = "";
// for (int i = 0; i < R.length(); i++) {
// char x = R.charAt(i);
// if (x == ' ') {
// P = 1;
// continue;
// }
// if (P == 0)
// name += x;
// else
// yearOfBirth += x;

// }
// int yearOfBirth_New = Integer.parseInt(yearOfBirth);
// int age = 2024 - yearOfBirth_New;
// System.out.println("Happy Birthday " + name + "! Your current age is " +
// age);
// String x = null;
// x = scanner.nextLine();
// for (char y : x.toCharArray()) {
// System.out.println(y);
// }
// Scanner s = new Scanner (System.in);
// int n = s.nextInt();
// int[] N = new int [n];

// for(int i =0;i<n;i++){

// N[i] = s.nextInt();
// }
// for (int i = n-1; i >=0; i--)
// System.out.print(N[i] + " ");

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] numbers = new int[n];

// System.out.println("Enter the numbers:");
// for (int i = 0; i < n; i++) {
// numbers[i] = sc.nextInt();
// }

// System.out.println("Reversed order:");
// for (int i = n - 1; i >= 0; i--)
// System.out.print(numbers[i] + " ");