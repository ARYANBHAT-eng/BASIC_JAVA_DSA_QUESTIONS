import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.Formatter;

public class Main
public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("enter the number of candies:");
        int candies = SC.nextInt();
        
        System.out.print("enter the number of cousins:");
        int cousins = SC.nextInt();

        if (candies%cousins==0) {
            System.out.println("yes");}
        else{
                System.out.println("no");
            }
        }
    

/*
 * import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("enter the number of candies:");
        int candies = SC.nextInt();
        
        System.out.print("enter the number of cousins:");
        int cousins = SC.nextInt();

        if (candies % cousins == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
 */