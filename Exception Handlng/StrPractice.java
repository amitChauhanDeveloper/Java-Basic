public class StrPractice {
    public static void main(String args[]){

        // String 
        /* String s1="abc";
        String s2= new String("abc"); 
        String s3=s1; // assign the value in s3
        System.out.println(s3=s1); 
        System.out.println(s1==s2); // two instance object and one reference variable
        System.out.println(s1.equals(s2)); // only compare equality s1 & s2
        System.out.println(s3.equals(s1)); // only compare equality s3 & s1
        System.out.println(s3.equals(s2));  // only compare equality s3 & s2
        System.out.println(s1.equalsIgnoreCase(s2)); // abc and ABC ignore both are same
        System.out.println(s3==s1); // both are same variable
        System.out.println(s3==s2); // one instance object and one variable */

        // String Buffer
        /* StringBuffer buffer=new StringBuffer("hello");
        buffer.append("java");
        System.out.println(buffer); */

        // String Builder
        /* StringBuilder builder=new StringBuilder("hello");
        builder.append("java");
        System.out.println(builder); */

        //Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.  

        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Amit");
        //sb.append(" Chauhan");

        for (int i=0;i<10000;i++){
            sb.append(" Chauhan");
            //System.out.println(sb);
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Amit");
        //sb2.append(" Chauhan");

        for (int i=0;i<10000;i++){
            sb2.append(" Chauhan");
            //System.out.println(sb2);
            
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
        
    }
}
