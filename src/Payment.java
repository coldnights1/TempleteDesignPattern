public  abstract class Payment {
    Friend friend1,friend2;
    Integer RequestedMoney;
    public abstract void ValidateRequest();
    public abstract void DebitMoney();
    public abstract void Calculatefees();
    public abstract void creditMoney();
    //final is used so no one can override
    public void sendMoney(){
        ValidateRequest();
        DebitMoney();
        Calculatefees();
        creditMoney();
    }
}
