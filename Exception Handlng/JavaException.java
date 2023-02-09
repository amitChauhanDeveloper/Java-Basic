import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaException {

  public static void main(String args[]) {
    // Arithmetic exception (throw the unchecked exception in run time)
    try {
      int data = 100 / 0;
      System.out.println(data);
    } catch (ArithmeticException e) {
      System.out.println("Can't divided by zero");
    }

    int j = 100, k = 0, data;
    try {
      data = j / k; // may throw exception
      System.out.println(data);
    } catch (Exception e) { // handling the exception
      // resolving the exception in catch block
      System.out.println(j / (k + 2));
    }

    // NullPointerException (throw the unchecked exception in run time)
    try {
      String s = null;
      System.out.println(s.length());
    } catch (NullPointerException e) {
      System.out.println("Enter the string value ");
    }

    // NumberFormatException (throw the unchecked exception in run time)
    try {
      String s = "abc";
      int i = Integer.parseInt(s);
      System.out.println(i);
    } catch (NumberFormatException e) {
      System.out.println("Enter the integer value");
    }

    /* // No handle that is terminate the program (throw the checked exception in compile time)
        // Exception in thread "main" java.lang.NullPointerException at JavaException.main(JavaException.java:32)
        String s1 = null;
            System.out.println(s1.length()); */

    // ArrayIndexOutOfBoundsException (throw the unchecked exception in run time)
    try {
      int a[] = new int[5];
      a[10] = 50;
      System.out.println(a);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Declare correct index value");
    }

    /* // No handle that is terminate the program (throw the checked exception in compile time)
        //Exception in thread "main" java.lang.ArithmeticException: / by zero at JavaException.main(JavaException.java:40)
        int data = 100 / 0;
        System.out.println(data); */

    /* // generating the exception in catch block
    try {
      int data1 = 50 / 0; //may throw exception
      System.out.println(data1);
    } 
    
    // handling the exception
    catch (Exception e) {
      // generating the exception in catch block
      int data2 = 50 / 0; //may throw exception
      System.out.println(data2);
    } */

    PrintWriter pw;
    try {
      pw = new PrintWriter(""); //may throw exception
      pw.println("saved");
      System.out.println("File saved successfully");
    } catch (FileNotFoundException e) { // providing the checked exception handler
      System.out.println("file name is not null");
    }  
    
  }
}
