package Basic;

public class thisKeyword {
    int x;
  
    // Constructor with a parameter
    public thisKeyword(int x) {
      this.x = x;
    }
  
    // Call the constructor
    public static void main(String[] args) {
        thisKeyword myObj = new thisKeyword(5);
      System.out.println("Value of x = " + myObj.x);
    }
  }
