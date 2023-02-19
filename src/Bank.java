public class Bank{
   private int balans;

    public Bank() {
    }

    public int getBalans() {
        return balans;
    }

    public void setBalans(int balans) {
        this.balans = balans;
    }

    public void pay(int sum){
        balans-=sum;
    }
    public void deposit(int sum){
        balans+=sum;
    }
    public void transfer(int sum){
        balans-=sum;
    }
    public void  withdraw(int sum){
        balans-=sum;
    }
    public void logOut(){

    }
}
