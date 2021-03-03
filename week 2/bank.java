package week_2_basics;

import java.util.Random;

public class bank {
        protected int units;
        protected String name;

    public bank(String name, int units) {
  
        //Constructor initilizes objects
        this.name = name;
        this.units = units;
        Account[] checkingAccounts = new Account[units];
        InvestmentAccounts[] investmentAccounts = new InvestmentAccounts[units]; 
        Random balanceGenerator = new Random();

     {
        for (int i = 0; i < units; i++) {
            int RandomChecking = balanceGenerator.nextInt(10001);
            checkingAccounts[i] = new Account("Checking" + i, RandomChecking);
            int RandomInvestment = balanceGenerator.nextInt(10001);
            investmentAccounts[i] = new InvestmentAccounts("Growth" + i, RandomInvestment);
            System.out.println(checkingAccounts[i].getBalance());
            System.out.println(investmentAccounts[i].getBalance());
        }
    }
    }
}