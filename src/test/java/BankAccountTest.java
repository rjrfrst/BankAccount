import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    //It is possible to use the @BeforeEach to insert the properties
    //By using the @BeforeEach, I do not have to repeat the inputs per test
    //For this assignment, I will not use @BeforeEach to practice what I have learned

    //Testing methods
    //Test depositing balance

    @Test
    void canAddMoney() {
        //Given
        BankAccount bankOne = new BankAccount("John",
                "Doe",
                "2022-10",
                9899);
        //When
        bankOne.depositMoney(500);
        //Then
        assertThat(bankOne.getBalance()).isEqualTo(500);
    }

    //Test withdrawing balance
    @Test
    void canSubtractMoney(){
        //Given
        BankAccount bankOne = new BankAccount("John",
                "Doe",
                "2022-10",
                9899);
        //When
        bankOne.depositMoney(500);
        bankOne.withdrawMoney(50);
        //Then
        assertThat(bankOne.getBalance()).isEqualTo(450);

    }

    //Test adding interest
    @Test
    void canAddInterest(){
        //Given
        BankAccount bankOne = new BankAccount("John",
                "Doe",
                "2022-10",
                9899);
        //When
        bankOne.depositMoney(100);
        bankOne.payInterest();
        //Then
        assertThat(bankOne.getBalance()).isEqualTo(600);

    }


    //Testing the getters and setters
    @Test
    void canGetFirstName(){
        //Given
        BankAccount bankOne = new BankAccount(
                "John",
                "Doe",
                "2022-10",
                9899);
        //It is not needed to insert the inputBalance since it has been set
        //When
        String firstName = bankOne.getFirstName();
        //Then
        assertThat(firstName).isEqualTo("John");
    }

    @Test
    void canSetFirstName(){
        //Given
        BankAccount bankOne = new BankAccount("John",
                "Doe",
                "2022-10",
                9899);
        //When
        bankOne.setFirstName("James");
        String firstName = bankOne.getFirstName();
        //Then
        assertThat(firstName).isEqualTo("James");
    }

    @Test
    void canGetLastName(){
        //Given
        BankAccount bankOne = new BankAccount("John",
                "Doe",
                "2022-10",
                9899);
        //When
        String lastName = bankOne.getLastName();
        //Then
        assertThat(lastName).isEqualTo("Doe");
    }

    @Test
    void canSetLastName(){
        //Given
        BankAccount bankOne = new BankAccount("John",
                "Doe",
                "2022-10",
                9899);
        //When
        bankOne.setLastName("Smith");
        String lastName = bankOne.getLastName();;
        //Then
        assertThat(lastName).isEqualTo("Smith");
    }

    @Test
    void canGetDateOfBirth(){
        //Given
        BankAccount bankOne = new BankAccount(
                "John",
                "Doe",
                "2022-10",
                9899);
        //When
        String dateOfBirth = bankOne.getDateOfBirth();
        //Then
        assertThat(dateOfBirth).isEqualTo("2022-10");
    }

    @Test
    void canSetDateOfBirth(){
        //Given
        BankAccount bankOne = new BankAccount(
                "John",
                "Doe",
                "2022-10",
                9899);
        //When
        bankOne.setDateOfBirth("October-2022");
        String dateOfBirth = bankOne.getDateOfBirth();
        //Then
        assertThat(dateOfBirth).isEqualTo("October-2022");
    }

    @Test
    void canGetAccountNumber(){
        //Given
        BankAccount bankOne = new BankAccount("John",
                "Doe",
                "2022-10",
                9899);
        //When
        int accountNumber = bankOne.getAccountNumber();
        //Then
        assertThat(accountNumber).isEqualTo(9899);
    }

    @Test
    void canSetAccountNumber(){
        //Given
        BankAccount bankOne = new BankAccount("John",
                "Doe",
                "2022-10",
                9899);
        //When
        bankOne.setAccountNumber(9999);
        int accountNumber = bankOne.getAccountNumber();
        //Then
        assertThat(accountNumber).isEqualTo(9999);
    }

    @Test
    void canGetBalance(){
        //Given
        BankAccount bankOne = new BankAccount(
                "John",
                "Doe",
                "2022-10",
                9899);
        //When
        int balance = bankOne.getBalance();
        //Then
        assertThat(balance).isEqualTo(0);
    }

    @Test
    void canSetBalance(){
        //Given
        BankAccount bankOne = new BankAccount("John",
                "Doe",
                "2022-10",
                9899);
        //When
        bankOne.setBalance(100);
        int balance = bankOne.getBalance();
        //Then
        assertThat(balance).isEqualTo(100);
    }












} // Last curly bracket
