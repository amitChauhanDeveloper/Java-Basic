public class JavaFinallyBlock {

  public static void main(String args[]) {
    // finally block

    /* try 
      {
        System.out.println("finally topic.."); // statement 1
        int a=100,b=0,c;
        c=a/b;
        System.out.println(c); // statement 2
        System.out.println("Last Statement.."); // statement 3
        
      } 
      catch (ArithmeticException a) 
      {
        System.out.println("Can't Divide by zero.."); // statement 4
      }
      finally
      {
        System.out.println("Finally blocks always execute.."); // statement 5

      }
      System.out.println("Main method end.."); // statement 6 */

    // Nested finally block

    try {
      String a = "amit";
      System.out.println(a.toUpperCase());
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      try {
        System.out.println(100 / 3F);
      } catch (ArithmeticException a) {
        System.out.println(a);
      } finally {
        System.out.println("finally block always execute..");
      }
    }
    System.out.println("main method end...");
  }
}
