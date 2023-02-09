package Basic;

//Java Program to demonstrate the use of the parameterized constructor.
public class ParameterizedCons {

  int id;
  String name;

  //creating a parameterized constructor
  ParameterizedCons(int i, String n) {
    id = i;
    name = n;
  }

  //method to display the values
  void display() {
    System.out.println(id + " " + name);
  }

  public static void main(String args[]) {
    //creating objects and passing values
    ParameterizedCons s1 = new ParameterizedCons(111, "Amit");
    ParameterizedCons s2 = new ParameterizedCons(222, "Ankit");
    //calling method to display the values of object
    s1.display();
    s2.display();
  }
}
