package Basic;

//Java program to initialize the values from one object to another object.
class CopyCons {

  int id;
  String name;

  //constructor to initialize integer and string
  CopyCons(int i, String n) {
    id = i;
    name = n;
  }

  //constructor to initialize another object
  CopyCons(CopyCons s) {
    id = s.id;
    name = s.name;
  }

  void display() {
    System.out.println(id + " " + name);
  }

  public static void main(String args[]) {
    CopyCons s1 = new CopyCons(111, "Amit");
    CopyCons s2 = new CopyCons(s1);
    s1.display();
    s2.display();
  }
  // Without copy constructor
  /* int id;  
    String name;  
    CopyCons(int i,String n){  
    id = i;  
    name = n;  
    }  
    CopyCons(){}  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    CopyCons s1 = new CopyCons(111,"Amit");  
    CopyCons s2 = new CopyCons();  
    s2.id=s1.id;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();  
   }   */
}
