package Basic.Final_Keyword;

class Bike{  
    int cube(final int n){  
     n=n+2;//can't be changed as n is final  
     n*n*n;  
    }  
    public static void main(String args[]){  
      Bike b=new Bike();  
      b.cube(5);  
   }  
  }
