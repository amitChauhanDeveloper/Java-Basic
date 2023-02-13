package Basic.Method_Overloading_and_Overriding;

class Adder {

  static int add(int a, int b) {
    return a + b;
  }

  static double add(double a, double b) {
    return a + b;
  }
}

class Changing_data_type{

  public static void main(String[] args) {
    System.out.println(Adder.add(20, 30));
    System.out.println(Adder.add(20.5, 30.3));
  }
}
