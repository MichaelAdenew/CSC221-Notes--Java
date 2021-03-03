

public  class ConceptTester {  //this is a fake constuctor that is written only because of syntax
    public static void main(String[] args) {  //main function, only in conceptTester
        Account a = new Account("Account 1", 2000);  //creating an object, a, of type account
        Account b = new Account("Account 2", 4000);
                                                          //oop -- working with objects
        boolean successfulwithdrawal = b.withdraw(100);   //class -- an object or more commonly, a group of objects
        if (successfulwithdrawal) {                       //list is considered a class because it has objects [1,3,5] & attributes (length, adding, etc)
            System.out.println("Success");
        } else {
            System.out.println("You're too broke!");
        }

        a.deposit(400);
        b.withdraw(300);

        System.out.println(" Balance a has " + a.getBalance());
        System.out.println(" Balance b has " + b.getBalance());
   
       
        Account [] otherAccounts = new Account [10];  //declares an array of integers called otherAccounts using default constructor ; makes memory for 10 integers and have otherAccounts refer to it
        
        
        for (int i = 0; i < otherAccounts.length; i ++) {  //for loop that initilizes the individual array position with a value
            otherAccounts [i] = new Account ("Account" + i, 1000 + i * 1000);
            System.out.println("This account is named " + otherAccounts[i].getName());
            System.out.println(otherAccounts[i].getName() + " has " + otherAccounts[i].getBalance());
   
        }
        otherAccounts[0].setName("Zero");
        System.out.println("otherAccounts[0]" + "is named " + otherAccounts[0].getName());
        
    }
  
    
}
