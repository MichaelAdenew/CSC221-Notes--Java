package week_2_basics;

public  class MichaelConceptTester {
    public static void main(String[] args) {
        Account a = new Account("Account 1", 2000);
        Account b = new Account("Account 2", 4000);

        boolean successfulwithdrawal = b.withdraw(100);
        if (successfulwithdrawal) {
            System.out.println("Success");
        } else {
            System.out.println("You're too broke!");
        }

        a.deposit(400);
        b.withdraw(300);

        System.out.println(" Balance a has " + a.getBalance());
        System.out.println(" Balance b has " + b.getBalance());
   
       
        Account [] otherAccounts = new Account [10];
        
        
        for (int i = 0; i < otherAccounts.length; i ++) {
            otherAccounts [i] = new Account ("Account" + i, 1000 + i * 1000);
            System.out.println("This account is named " + otherAccounts[i].getName());
            System.out.println(otherAccounts[i].getName() + " has " + otherAccounts[i].getBalance());
   
        }
        otherAccounts[0].setName("Zero");
        System.out.println("otherAccounts[0]" + "is named " + otherAccounts[0].getName());
        // System.out.println("This account is named " + specialAccount.getName());
        // System.out.println(specialAccount.getName() + " has " + specialAccount.getBalance());

   
    }
  
    
}
