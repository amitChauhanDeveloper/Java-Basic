package Basic.Constructor;

import Basic.AccessModifier.Public.A;  
  

//* class C extends A{ }

class B extends A{  
  public static void main(String args[]){  
   B obj = new B();  
   obj.msg();  

   /* C obj1 = new C();
    obj1.msg(); */
  }  
}  
