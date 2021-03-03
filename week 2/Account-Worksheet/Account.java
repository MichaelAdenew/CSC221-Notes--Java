package week_2_basics;

public class Account {
    protected int balance;
    protected String name;

    public Account(){  //this is a constructor
        //constuctors intilize objects. So if you want to create an object that that has attributes and does tasks, create an object.
        this.balance = 0;
        this.name = "default";
    }

    public Account(String name, int balance){ //another constuctor that takes in parameters
        this.balance = balance;
        this.name = name;
    }
    
    int getBalance(){
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

    boolean withdraw(int amount){
        if(this.balance< amount){
            return false;
        }else{
            this.balance-= amount;
            return true;
        }

    }

	public void deposit(int i) {
	}

    // void deposit(int amount){
    //     this.balance+= amount;
    // }

    // // Overriding toString()...
    // public String toString(){
    //     return "Name: "+this.name+ ", Balance: "+this.balance; 
    // }
}