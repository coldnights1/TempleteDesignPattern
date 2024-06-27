public class payToFriend extends Payment{
 Friend sender,receiver;
 Integer RequestedMoney;
 payToFriend(Friend sender ,Friend receiver,Integer RequestedMoney){
     this.sender=sender;
     this.receiver=receiver;
     this.RequestedMoney=RequestedMoney;
 }
    public void ValidateRequest(){
        if(RequestedMoney>=100 && RequestedMoney+10<=sender.money){
            //allow
            System.out.println("Transaction initiated");
        }
        else {
            System.out.println("Transaction denied");
        }
    }
    public void DebitMoney(){
      sender.money-=(RequestedMoney+10);
    }
    public void Calculatefees(){
     Integer totalMoney=10+RequestedMoney;
     System.out.println("Amount Debited "+totalMoney);
    }
    public void creditMoney(){
        receiver.money+=RequestedMoney;
        System.out.println("Transaction completed");
    }
    public  final void  sendMoney(){
     ValidateRequest();
     DebitMoney();
     Calculatefees();
     creditMoney();
    }

}
