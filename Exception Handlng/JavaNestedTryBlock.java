public class JavaNestedTryBlock {

  public static void main(String[] args) {
    //outer try block
    try {
      //inner try block 1
      try {
        int b = 39 / 0;
        System.out.println(b);
      } catch (ArithmeticException e) { //catch block of inner try block 1
        System.out.println("Can't divided by zero (inner try block 1)");
      }

      //inner try block 2
      try {
        int a[] = new int[5];

        //assigning the value out of array bounds
        a[5] = 4;
      } catch (ArrayIndexOutOfBoundsException e) { //catch block of inner try block 2
        System.out.println("Declare correct index value (inner try block 2) ");
      }

      int data = 100 / 0;
      System.out.println(data);

    } catch (Exception e) { //catch block of outer try block
      System.out.println("handled the exception (outer catch)");
    }

    System.out.println("normal flow..");
  }
}
