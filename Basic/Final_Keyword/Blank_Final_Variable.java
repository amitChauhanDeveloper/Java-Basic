package Basic.Final_Keyword;

class Bike10 {

  final int speedlimit; //blank final variable

  Bike10() {
    speedlimit = 70;
    System.out.println(speedlimit);
  }
}

class Blank_Final_Variable {
  public static void main(String args[]) {
    new Bike10();
  }
}


