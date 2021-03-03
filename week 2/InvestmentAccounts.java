package week_2_basics;

public class InvestmentAccounts extends Account {
    private float interestRate;
    public void applyInterest(){
        balance = (int) ((int) balance * (1 + interestRate));
    }
    public boolean withdraw() {
        System.out.println("Can't allow withdraw");
        return false;
    }
    public InvestmentAccounts(String name, int balance) {
        this.balance = balance;
        this.name = name; 
    }
}
