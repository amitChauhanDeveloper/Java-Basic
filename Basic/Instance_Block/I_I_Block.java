package Basic.Instance_Block;

class Bike {

  int speed;

  Bike() {
    System.out.println("speed is " + speed);
  }

  {
    speed = 100; // I I Block
  }
}

class I_I_Block {

  public static void main(String args[]) {
    Bike b1 = new Bike();
    Bike b2 = new Bike();
  }
}
