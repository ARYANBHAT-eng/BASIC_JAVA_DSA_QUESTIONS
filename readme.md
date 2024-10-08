   // type castting widening order:- byte -> short -> char -> int -> long -> float
        // -> double

        /*
         * int val1 = 1;
         * double val2 = val1;
         * System.out.println(val1);
         * System.out.println(val2);
         */
        // chnages the value of in double making my answe 1.0

        /*
         * int val1 = 2;
         * float val2 = val1;
         * System.out.println(val1);
         * System.out.println(val2);
         */
        // does the same as above just changes int into float

        // narrow casting order:-double -> float -> long -> int -> char -> short -> byte

        /*
         * float val1 = 9.5678f;
         * int val2 = (int) val1;
         * System.out.println(val1);
         * System.out.println(val2);
         * output will be 9 and similarly we can narrow caste
         * a double into int
         * double val1 = 1.8001d;
         * int val2 = (int) val1;
         * System.out.println(val1);
         * System.out.println(val2); here the output of val2 = 1
         * thus making our double into integer
         * NOW HERE IS REALTIME EXAMPLE
         * create a program to calculate the percentage of a user's score in relation to
         * the maximum score in a game.
         
        int maxSR = 700;
        int userSR = 504;
        float percentage = (float) userSR / maxSR * 100.f;
        System.out.println("user percentage is:" + percentage + "%");
        
        THUS OUR OUTPUT HERE IS 72%*/
         String greeting = "hello aryan how are you";
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());

        String random = "sneaking past the grumpy guard fluffy cat eyes glittered in the moonlight hoping to reach the overflowing fishbowl";
        System.out.println(random.indexOf("reach"));
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);
        String txt2 = "We are the so-called from the\tnorth where Vikings reside and all live in peace.";
        System.out.println(txt2);
        // we use / for escape characters such as ',",/.
        // /n /t are two of the importants
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(9, 69));
        System.out.println(Math.abs(-4.789));
        System.out.println(Math.sqrt(64));
        int vall1 = (int) (Math.random() * 101); // 0 to 100 always +1 to the last value upto which you want random

        System.out.println((vall1));




        else if condtions
        
/**
  Main
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //[when working with two condtions for example age and gender ,, gender is a string so therefore we need a seperate scanner class for it and is both the condtions work with an int data type then we dont need a seperate new scanner class for it]
        Scanner sx = new Scanner(System.in);
        String gender = sx.nextLine();

        if (age > 18) // || gender.equals("male")  [now if i dont want to use else if  condition and just use two conditions to categrize either a person is legal to drink or not i can just cut out the whole else if condtion with its statement and use the or || operater as shown along with the code and it will still work as same]
            System.out.println("legal to drink");
        else if (gender.equals("male"))
            System.out.println("legal to drink");
        else
            System.out.println("not legal to drink");

        sc.close();
        sx.close();
  // syntax for short hand else if [ variable = (condition) ? expressionTrue :  expressionFalse;]
    }
}
create a program to check wether the input int we have given is even or odd

/*  Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0)
            System.out.println("given number is even");
        else
            System.out.println("given number is odd");
            */
            // thus when we give it a input of a number and if reminder is 0 it will print it even otherwise its odd

            import java.util.*;
            
            
            
            //create a program to show wether x is equal , greater or lesser than y.

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == y)
            System.out.println("x is equal to y");

        else if (x > y)
            System.out.println("x is greater ");
        else
            System.out.println("x is lesser");

    }
}
//create a switch case program for days of week

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid input");
        }

    }
}
/*
         * //FOR LOOP
         * this code prints hello worl 10 times
         * for (int counter = 0; counter < 10; counter = counter + 1) 
         * System.out.println("helloworld");
         * 
         */
        /*
         * 
         * for (int i = 0; i < 11; i++) 
         * System.out.println(i );
         */
        /*
         * //WHILE LOOP
         * int i = 0;
         * while (i < 11) {
         * System.out.println(i);
         * i++;// i= i+1{we can use this also and vice versa}
         */
        // DO WHILE LOOP
        /*
         * int i = 0;
         * do {
         * System.out.println(i);
         * i++; // or i=i+1
         * 
         * } while (i < 11);
         */
       /*  int i = 12;
        while (i < 11) {
            System.out.println("rahul soogya 4 baje");
            i++;
        }
        do {
            System.out.println("rahul soogya 4 baje");
            i++;

        } while (i < 12);
    }// this shows when we use a do while loop even if for a false statement it will
     // still atleast execute it once and the check its condtion where as for other
     // types of loop the statement will simply not be executed*/

     /*  // WAP to calculate the sum of n natural numbers where n =9
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
*/
/* import java.util.*;

public class Main {
   
    // WAP to calculate the table of A number where n = 9
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i * n);
        }

    }
}*/
 // for (int i = 0; i < 10; i++) 
        // if (i == 4) {
        // break;
        // }
        // System.out.println(i); here once the statement is met such ass i==4 then it it will stop print as soon as it prints 4 numbers 
       /* for (int i = 0; i < 10; i++) 
            if (i == 4) {
                continue;
            }
            System.out.println(i);
         */
        //continue statement helps to skip if the condition is met
            /*
         * int i = 0;
         * while (i < 10) {
         * System.out.println(i);
         * i++;
         * if (i == 6) {
         * break;
         * 
         * }
         * 
         * }
         */
        // here we use break in a while loop
       /*int i = 0;
        while (i < 10) {
            if (i == 6) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }//here we use continue in while loop
    }*/


 Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        String[] carBrands = {
                "Acura", "Alfa Romeo", "Aston Martin", "Audi", "Bentley", "BMW", "Bugatti", "Buick",
                "Cadillac", "Chevrolet", "Chrysler", "Citroen", "Dacia", "Dodge", "Ferrari", "Fiat", "Ford",
                "Genesis", "GMC", "Honda", "Hyundai", "Infiniti", "Jaguar", "Jeep", "Kia", "Koenigsegg",
                "Lamborghini", "Land Rover", "Lexus", "Lincoln", "Lotus", "Maserati", "McLaren", "Mazda",
                "Mercedes-Benz", "Mini", "Mitsubishi", "Nissan", "Opel", "Peugeot", "Porsche", "Renault",
                "Rolls-Royce", "Saab (defunct)", "Subaru", "Suzuki", "Tesla", "Toyota", "Volkswagen", "Volvo"
        };
       
        carBrands[21] = "marutiSuzuki";
        System.out.println(carBrands[n]);
        System.out.println(carBrands.length);
        /*
         * the only differnce between an array of string and integer is
         * int [] rollNumbers={21,22,23,24,25,26,27,28,29,30}
         */

         
// create a function to claculate the sum of 2 numbers
import java.util.*;

public class Main {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("sum of the two numbers is : " + sum);

    }
}

// create a function to multiply  2 numbers
import java.util.*;

public class Main {
    public static int calculateProduct(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();

        System.out.println("Product of the two numbers is : " + calculateProduct(a, b));
        Sc.close();

    }
}

//wap to enter 3 numbers from the user and make a function to print their average
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int n1 = SC.nextInt();
        System.out.print("enter the second number: ");
        int n2 = SC.nextInt();
        System.out.print("enter the third number: ");
        int n3 = SC.nextInt();

        int average = ((n1 + n2 + n3) / 3);
        System.out.println("the average of the three numbers is : " + average);

    }
}

// import java.util.Scanner;

// public class AverageCalculator {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// // Get the three numbers from the user
// System.out.print("Enter the first number: ");
// double firstNumber = scanner.nextDouble();

// System.out.print("Enter the second number: ");
// double secondNumber = scanner.nextDouble();

// System.out.print("Enter the third number: ");
// double thirdNumber = scanner.nextDouble();

// // Call the function to calculate the average
// double average = calculateAverage(firstNumber, secondNumber, thirdNumber);

// // Print the average
// System.out.println("The average of the three numbers is: " + average);
// }

// // Function to calculate the average of three numbers
// public static double calculateAverage(double num1, double num2, double num3)
// {
// return (num1 + num2 + num3) / 3;
// }


// create a function to multiply  2 numbers
import java.util.*;

public class Main {
    public static void printFactorial(int n) {
        // now we will use loops
        if (n < 0) {
            System.out.println("invalid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        printFactorial(n); // call kia function ko
        Sc.close();

    }
}

//write a function to calculate the sum of odd numbers from 1 to n
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n, sum = 0;

        System.out.print("enter a positive integer :");
        Scanner SC = new Scanner(System.in);
        n = SC.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                sum += i;

            }
        }
        System.out.println("The sum of all odd numbers from 1 to " + n + "is:" + sum);
    }
}
// Your father has given you some money and you are trying to decide what you want to do with that money.
// Your friend gives you the idea of an investment that gives you simple interest for your money.

// If you invest a sum of p for t years at a rate of r%, the formula for simple interest will be -

// Interest = (p*r*t)/100

// Given the rate of interest and the time you can invest for, calculate the interest you will recieve.

// // Please make sure not to delete the WorkAtTech class
// // You can create additional non-public classes as well
// // But the main method should be in the WorkAtTech class
// class main {
//     public static void main(String[] args) throws java.lang.Exception {
//         double P, R, T, SI;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the principal amount :");
//         P = sc.nextDouble();

//         System.out.print("enter the rate of interest:");
//         R = sc.nextDouble();

//         System.out.print("enter the time period in years");
//         T = sc.nextDouble();

//         Formatter F = new Formatter();

//         SI = (P * R * T) / 100;
//         String FI = F.format("%.6f", SI).toString();
//         System.out.println(FI);
//         sc.close();
//     }
// }
// wap to check wether the candies given by your mother can be distributed equally between n number of cousins if yes then print yess otherwise print no
// import java.util.*;
// import java.io.*;
// import java.util.Scanner;
// import java.util.Formatter;

// public class SimpleInterest {
//     public static void main(String[] args) {
//         Scanner SC = new Scanner(System.in);

//         System.out.print("enter the number of candies:");
//         int candies = SC.nextInt();

//         System.out.print("enter the number of cousins:");
//         int cousins = SC.nextInt();

//         if (candies % cousins == 0) {
//             System.out.println("yes");
//         } else {
//             System.out.println("no");
//         }
//     }
// }
/*
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.Formatter;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("enter the radius:");
        double R = SC.nextDouble();

        System.out.print("enter the height:");
        double H = SC.nextDouble();

        double pi = 3.14;
        double cmPerLtrs = 1000.0;
        Formatter F = new Formatter();
        double volume = (pi * R * R * H);
        double volumeInLtrs = volume / cmPerLtrs;
        double price = volumeInLtrs * 40;
        String finalPrice = F.format("%.2f", price).toString();
        System.out.println(finalPrice);
        SC.close();

    }
}*/

// import java.util.*;
// import java.io.*;
// import java.util.Scanner;
// import java.util.Formatter;

// public class SimpleInterest {
//     public static void main(String[] args) {
//         Scanner SC = new Scanner(System.in);

//         System.out.print("Enter the N space-separated integers: ");
//         int x = SC.nextInt();

//         for (int i = 0; i < x; i++) {
//             int n = SC.nextInt();

//             if (n % 2 == 0) {
//                 System.out.println("Even");
//             } else {
//                 System.out.println("Odd");
//             }

//         }

//     }
// }
// }
// import java.util.Scanner;

// public class SimpleInterest {

// public static void main(String[] args) {
// // Scanner for user input
// Scanner scanner = new Scanner(System.in);

// // Get the number of elements (N)
// System.out.print("Enter the number of elements (N): ");
// int n = scanner.nextInt();

// // Initialize variables
// int maxNumber = Integer.MIN_VALUE; // Start with minimum possible value

// // Get the N integers
// System.out.print("Enter the N space-separated integers: ");
// for (int i = 0; i < n; i++) {
// int currentNumber = scanner.nextInt();

// // Update maxNumber if current number is greater
// if (currentNumber > maxNumber) {
// maxNumber = currentNumber;
// }
// }

// // Determine winner based on parity (even/odd) of maxNumber
// String result = (maxNumber % 2 == 0) ? "WON" : "LOST";

// // Display result
// System.out.println("You " + result);

// scanner.close();
// }
// }
WAP tp check wether the input number is divisible by 6 or not

import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Simpleinterest {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x % 6 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
//Given a temperature t in Centigrade, convert it into Fahrenheit.

import java.util.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Simpleinterest {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double tempInC = sc.nextDouble();

            double tempInF = (((9 * tempInC) / 5) + 32);
            System.out.printf("%.2f", tempInF);
            System.out.println();
        }
    }
}