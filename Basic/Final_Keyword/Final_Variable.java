package Basic.Final_Keyword;

class Bike{  
    final int speedlimit=90;//final variable  
    void run(){  
    // speedlimit=400;  // compile time error because final variable value not change 
    System.out.println(speedlimit + " Km Per hours...");
    }  
    public static void main(String args[]){  
    Bike obj=new  Bike();  
    obj.run();  
    }  
   }//end of class 
