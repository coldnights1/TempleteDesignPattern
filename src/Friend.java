public class Friend {
    String name;
    Integer money;
    Friend(String name,Integer money){
        this.money=money;
        this.name=name;
    }
    Integer getBalance(){
        return this.money;
    }
}
