package Basic.Final_Keyword;

class Bike11{  
    int cube(final int n){  
     n=n+2;//can't be changed as n is final  
     n*n*n;  
    }  
    public static void main(String args[]){  
      Bike11 b=new Bike11();  
      b.cube(5);  
   }  
  }