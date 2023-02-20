package LogicalQuestion;

import java.util.Scanner;

//Creating PerfectNumber class
public class PerfectNumber {

  // Creating check() method that will return true when number will be perfect
  static boolean check(int number) {
    int sum = 1;

    // Finding all the divisors
    for (int j = 2; j * j <= number; j++) {
      if (number % j == 0) {
        if (j * j != number) sum = sum + j + number / j; else sum = sum + j;
      }
    }
    // Checking whether the sum of the divisors and number both are equal or not
    if (sum == number && number != 1) return true;

    return false;
  } 

  // Main() method
  public static void main(String[] args) {
    System.out.println("Perfect numbers between 0-5000:");
    for (int n = 2; n < 5000; n++) {
      if (check(n)) System.out.println(n + " is a perfect number");
    }

    int n,sum=0;
    System.out.print( " Enter a number : ");
    try (Scanner sc = new Scanner(System.in)) {
        n=sc.nextInt();
    }
    for(int i = 1; i<n; i++){

        if (n%i==0) {
            sum = sum + i;
        }
    }
    if (n==sum) {
        System.out.println(n + " perfect number... ");
        
    } else {
        System.out.println(n + " not perfect number...");
    }
  }
}
