public class BankAccount {
    //Properties
    String firstName;
    String lastName;
    String dateOfBirth;
    int accountNumber;
    int balance;

    //Constructors

    public BankAccount(
            String inputFirstName,
            String inputLastName,
            String inputDateOfBirth,
            int inputAccountNumber){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0; //pre-set the balance to 0
        //Anything that is pre-set does not need to be in the parameters of the Constructor
    }


    //Create a method called deposit() that takes in an amount and updates the balance of the BankAccount object.
    //When depositing balance should increase
    //Creating method signatures
    public void depositMoney(int amount){
        this.balance += amount;
    }

    //Create a method called withdrawal() that takes in an amount and updates the balance of the BankAccount object.
    //When depositing balance should decrease
    //there should be an amount
    public void withdrawMoney(int amount){
        this.balance -= amount;
    }

    //Create a payInterest method which adds 10% to the BankAccount object's balance property

    public void payInterest(){
        int interestToAdd = this.balance * 5;
        this.balance += interestToAdd;
    }


    //Write and test getters and setters for all properties.
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }


} // Last curly bracket
