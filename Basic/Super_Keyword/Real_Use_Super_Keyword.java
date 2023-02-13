package Basic.Super_Keyword;

class Person {

  int id;
  String name;

  Person(int id, String name) {
    this.id = id;
    this.name = name;
  }
}

class Emp extends Person {

  float salary;

  Emp(int id, String name, float salary) {
    super(id, name); //reusing parent constructor
    this.salary = salary;
  }

  void display() {
    System.out.println(id + " " + name + " " + salary);
  }
}

class Real_Use_Super_Keyword {

  public static void main(String[] args) {
    Emp e1 = new Emp(1, "amit", 5000);
    e1.display();
  }
}
