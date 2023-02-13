package Basic.Final_Keyword;

// This program is a run time error because final class not extends...
final class Bike {

}

class Honda extends Bike {

  void run() {
    System.out.println("running safely with 100kmph");
  }

  public static void main(String args[]) {
    Honda honda = new Honda();
    honda.run();
  }
}
