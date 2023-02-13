package Basic.Instance_Block;

class Bike {

  int speed;

  Bike() {
    System.out.println("constructor is invoked");
  }

  {
    System.out.println("instance initializer block invoked"); // I I Block
  }
}

class I_I_Block_And_Constructor {

  public static void main(String args[]) {
    Bike b1 = new Bike();
    Bike b2 = new Bike();
  }
}
