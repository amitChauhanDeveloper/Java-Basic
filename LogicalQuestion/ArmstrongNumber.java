package LogicalQuestion;

import java.util.Scanner;

//An Armstrong Number is a special positive number whose sum of cubes of its digit is equal to that number.
//The number 154 is an Armstrong number because if we perform the sum of cubes of each digit, it will result in the same number.

/* 
= 153
     3    3    3
= (1) +(5) +(3) 
= 1+125+27
= 153
Let's understand the logic of checking whether a number is Armstrong or not. */

public class ArmstrongNumber {

  public static void main(String[] args) {
    int sumOfCube = 0, a, temp;
    int number = 153;
    temp = number;
    while (number > 0) {
      a = number % 10; //Getting last digit
      number = number / 10; //Removing last digit from number
      sumOfCube = sumOfCube + (a * a * a ); //Calculating sum of cubes of digits 
    }
    if (temp == sumOfCube) System.out.println(
      temp + " is an armstrong number"
    ); else System.out.println(temp + " is not an armstrong number");

    /* int n, arm = 0, rem, c;
    System.out.println("Enter a number : ");
    Scanner r = new Scanner(System.in);
    n = r.nextInt();

    c = n;

    while (n > 0) {
      rem = n % 10;
      arm = (rem * rem * rem) + arm;
      n = n / 10;
    }
    if (c == arm) {
      System.out.println(c + " is an armstrong ");
    } else System.out.println(c + " is not an armstrong number"); */
  }
}
