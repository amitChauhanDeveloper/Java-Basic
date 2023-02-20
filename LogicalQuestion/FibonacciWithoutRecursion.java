package LogicalQuestion;

//Fibonacci series is a special type of series in which the next term is the sum of the previous two terms.
//For example, if 0 and 1 are the two previous terms in a series, then the next term will be 1(0+1).

public class FibonacciWithoutRecursion {

  public static void main(String args[]) {
    int number1 = 0, number2 = 1, number3, i, count = 5;
    //printing 0 and 1
    System.out.print("By Default " + number1 + " " + number2);

    //0 and 1 is already printed so loop will start with 2
    for (i = 2; i < count; i++) {
      number3 = number1 + number2;
      System.out.println(" " + number3);
      number1 = number2;
      number2 = number3;
    }
  }
}
