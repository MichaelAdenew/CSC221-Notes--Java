package week_2_basics;

import java.util.Random;


public class AccountTester {
    public static void main(String[] args) {
        Account a = new Account();
        Account b = new Account();

        a.balance += 40; 
        
        System.out.println("Balance of A is " + a.balance);

        
        
        // bank BankOfAmerica = new bank("Accounts" , 7);

        
    }

    // final static int NUM_OF_ACCOUNTS = 10;
    // public static void main(String[] args) {

    //     Random balanceGenerator = new Random();
    //     int someMoney = balanceGenerator.nextInt(10001);
    //     Account a = new Account("Michael",someMoney);
    //     System.out.println(a.getBalance());


    //     Account[] allAccounts = new Account[NUM_OF_ACCOUNTS];


        

    //     for(int i=0; i<NUM_OF_ACCOUNTS; i++){
    //          int generatedBalance = balanceGenerator.nextInt(10001);
    //          allAccounts[i] = new Account("default_name", generatedBalance);
    //       }

    //     for(int i=0;i<NUM_OF_ACCOUNTS;i++){
    //         System.out.println(allAccounts[i].toString());
    //         System.out.println(allAccounts[i].getBalance());
    //     }
    //     // System.out.println(allAccounts[5]);

    //     // allAccounts[5].deposit(100);

    //     // System.out.println(allAccounts[5]);

    //     // boolean isWithdrawable = allAccounts[5].withdraw(1000);

    //     // if(!isWithdrawable){
    //     //     System.out.println("Requested amount is larger than your balance!");
    //     // }
    //     // // }else{
    //     // //     System.out.println("Requested amount is larger than your balance!");
    //     // // }

    //     // InvestmentAccount myInvestmentAccount = new InvestmentAccount("name", 1000);
    
    //     // myInvestmentAccount.setBalance(100);
    //     // myInvestmentAccount.setName("name");

    //     // boolean isWithdrawable = myInvestmentAccount.withdraw(100);

    //     // if(!isWithdrawable) System.out.println("It's and Investment account, can't withdraw!");

    //     // System.out.println(myInvestmentAccount.balance;



    }  
