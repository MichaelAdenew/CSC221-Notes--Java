package week_2_basics;

public class MichaelAccount {
    protected int balance;
    protected String name;

    public MichaelAccount(){
        this.balance = 0;
        this.name = "default";
    }

    public MichaelAccount(String name, int balance){
        this.balance = balance;
        this.name = name;
    }
    
    double getBalance() {
        return balance;
    }

    void setBalance(int balance){
        this.balance = balance;
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    boolean withdraw(double amount){
        if(this.balance< amount){
            return false;
        }else{
            this.balance-= amount;
            return true;
        }

    }

    void deposit(int amount){
        this.balance+= amount;
    }

    // Overriding toString()...
    public String toString(){
        return "Name: "+this.name+ ", Balance: "+this.balance; 
    }
}