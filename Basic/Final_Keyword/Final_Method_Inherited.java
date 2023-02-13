package Basic.Final_Keyword;

class Bike {

    // final method is a inherited in java
  final void run() {
    System.out.println("running...");
  }
}

class Honda extends Bike {

  public static void main(String args[]) {
    new Honda().run();
  }
}


