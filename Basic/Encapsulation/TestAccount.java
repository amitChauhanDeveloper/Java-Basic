package Basic.Encapsulation;

//A Java class to test the encapsulated class Account.
public class TestAccount {

  public static void main(String[] args) {
    //creating instance of Account class
    Account acc = new Account();
    //setting values through setter methods
    acc.setAcc_no(36127120560L);
    acc.setName("Amit Chauhan");
    acc.setEmail("amitharidwarchauhan@gmail.com");
    acc.setAmount(500000f);
    //getting values through getter methods
    /* System.out.println(
      acc.getAcc_no() +
      " " +
      acc.getName() +
      " " +
      acc.getEmail() +
      " " +
      acc.getAmount()
    ); */
    System.out.println("Account No : " + acc.getAcc_no());
    System.out.println("Account Holder Name: " + acc.getName());
    System.out.println("Account Holder Email : " + acc.getEmail());
    System.out.println("Balance: " + acc.getAmount());
  }
}
