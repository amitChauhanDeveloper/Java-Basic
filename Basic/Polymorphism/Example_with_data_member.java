package Basic.Polymorphism;

/* program not run ( Exception in thread "main" java.lang.NoSuchFieldError: speedlimit
        at Basic.Polymorphism.Example_with_data_member.main(Example_with_data_member.java:18) ) */
        
//Runtime polymorphism can't be achieved by data members.
class Bike {

  int speedlimit = 90;
}

class Honda3 extends Bike {

  int speedlimit = 150;
}

class Example_with_data_member {

  public static void main(String args[]) {
    Bike obj = new Honda3();
    System.out.println(obj.speedlimit); //90
  }
}
