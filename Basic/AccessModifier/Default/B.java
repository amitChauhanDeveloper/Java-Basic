package Basic.AccessModifier.Default;

//save by B.java  
import Basic.AccessModifier.Default.*;  
class B{  
  public static void main(String args[]){  
   A obj = new A();//Compile Time Error  
   obj.msg();//Compile Time Error  
   
  }  
}  
