package Basic.Constructor;

//Java program to overload constructors  

public class ConsOverloading {
    
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    ConsOverloading(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    ConsOverloading(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    ConsOverloading s1 = new ConsOverloading(111,"Amit");  
    ConsOverloading s2 = new ConsOverloading(222,"Ankit",22);  
    s1.display();  
    s2.display();  

   }  
}
