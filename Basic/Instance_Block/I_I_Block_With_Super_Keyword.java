package Basic.Instance_Block;

class A {

  A() {
    System.out.println("parent class constructor invoked");
  }
}

class B extends A {

  B() {
    super();
    System.out.println("child class constructor invoked");
  }
 
  {
    System.out.println("instance initializer block is invoked");
  }
}

class I_I_Block_With_Super_Keyword {

  public static void main(String args[]) {
    B b = new B();
  }
}
