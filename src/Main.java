// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Friend friend1=new Friend("Prajit",1000);
       Friend friend2=new Friend("Rajesh",1500);
       //transaction
    payToFriend transaction=new payToFriend(friend1,friend2,100);
    transaction.sendMoney();
    System.out.println("Money of Prajit "+friend1.getBalance()+" Money of Rajesh " +friend2.getBalance());
    }
}