/* 
Assignment No.9
Title:- Case Study. 

Problem Statement:- Using concepts of Object-Oriented programming develop solution for any one application: 

1) Banking system having following operations: 
1. Create an account 2. Deposit money 3. Withdraw money 4. Honor daily withdrawal limit 5. Check the balance 6. Display Account information. 

2) Inventory management system having following operations: 
1. List of all products 2. Display individual product information 3. Purchase 4. Shipping  5. Balance stock 6. Loss and Profit calculation. 

*/


// CODE
/* We will implement following case study:
    1) Banking system having following operations: 
        1. Create an account 2. Deposit money 3. Withdraw money 4. Honor daily withdrawal limit 5. Check the balance 6. Display Account information. 
*/


// FILE NAME: Assignment_9.java

import java.util.*;
import java.io.*;

public class Assignment_9
{
    public static void main(String[]args)
    {
        int op;
        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank();
        while(true)
        {
            System.out.println();
            System.out.print("1 - Create Account\n2 - Display Account\n3 - Check Balance\n4 - Deposit Amount\n5 - Withdraw Amount\n6 - Exit\n");
            System.out.println("Enter Your Choice: ");
            op = sc.nextInt();
            System.out.println();
            
            switch(op)
            {
                case 1: b1.createAccount();
                break;
                
                case 2: b1.displayInfo();
                break;
                
                case 3: b1.checkBalance();
                break;
                
                case 4: b1.depositAmount();
                break;
                
                case 5: b1.withdrawAmount();
                break;
                
                case 6: System.exit(0);
                break;
                
                default: System.out.println("Invalid input.");
            }
        }
    }
}



// FILE NAME: Bank.java
import java.io.*;
import java.util.*;

class Bank
{
    Scanner sc = new Scanner(System.in);
    Customer c1 = new Customer();
    SavingsAccount s1 = new SavingsAccount();
    Account a1 = new Account();
    
    void createAccount()
    {
        c1.setCustomerName();
        c1.setCustomerAge();
        a1.setAccId();
        a1.setAccountType();
        a1.setBalance();
        s1.setMinimumBalance();
    }


    void withdrawAmount()
    {
        int withdraw;
        System.out.print("Enter the amount you want to withdraw: ");
        withdraw = sc.nextInt();
        
        if(a1.getBalance() - withdraw < s1.getMinimumBalance())
        {
            System.out.println("Withdrawal Failed. Not enough balance.");
        }
        
        else if(withdraw > s1.getMinimumBalance())
        {
            System.out.println("Withdrawal Failed. Maximum limit of one transaction is "+s1.getMinimumBalance()+".");
        }
        
        else
        {
            a1.balance = a1.getBalance() - withdraw;
        }
    }

    void displayInfo()
    {
        String name = c1.getCustomerName();
        int age = c1.getCustomerAge();
        int accId = a1.getAccId();
        String accType = a1.getAccountType();
        int balance = a1.getBalance();
        int minBalance = s1.getMinimumBalance();
        System.out.println("Welcome, "+name+"! Below are your account details:");
        System.out.println("Age: "+age);
        System.out.println("Account Id: "+accId);
        System.out.println("Account Type: "+accType);
        System.out.println("Balance: "+balance);
        System.out.println("Minimum Balance: "+minBalance);
    }
    
    void depositAmount()
    {
        int deposit;
        System.out.print("Enter the amount you want to deposit: ");
        deposit = sc.nextInt();
        a1.balance = deposit + a1.getBalance();
    }

    void checkBalance()
    {
        int balance;
        balance = a1.getBalance();
        System.out.println("Balance: "+balance);
    }
    
}



// FILE NAME: Account.java

import java.io.*;
import java.util.*;

class Account
{
    Scanner sc = new Scanner(System.in);
    String accType;
    int accId;
    int balance;

    void setAccId()
    {
        System.out.print("Enter Account Id: ");
        accId = sc.nextInt();
    }
    
    void setBalance()
    {  
        System.out.print("Enter balance: ");
        balance = sc.nextInt();
    }

    void setAccountType()
    {
        System.out.print("Enter your account type: ");
        accType = sc.nextLine();
        accType = sc.nextLine();
    }

    public int getBalance()
    {
        return balance;
    }

    public int getAccId()
    {
        return accId;
    }

    public String getAccountType()
    {
        return accType;
    }
}

// FILE NAME: Customer.java

import java.io.*;
import java.util.*;

class Customer
{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;

    public String getCustomerName()
    {
        return name;
    }

    void setCustomerName()
    {
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }

    public int getCustomerAge()
    {
        return age;
    }

    void setCustomerAge()
    {
        try
        {
            System.out.print("Minimum age for creating an account is 18.\nEnter age: ");
            age = sc.nextInt();
            if(age<18)
            {
                throw new Exception("You are not old enough to create an account");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.exit(0);
        }
    }
}


// FILE NAME: SavingsAccount.java

import java.io.*;
import java.util.*;

class SavingsAccount
{ 
    Scanner sc = new Scanner(System.in);
    int minBalance; 
    
    void setMinimumBalance()
    {
        System.out.print("Enter minimum balance: ");
        minBalance = sc.nextInt();
    }

    public int getMinimumBalance()
    {
        return minBalance;
    }
}



//Output:

/*


1 - Create Account
2 - Display Account
3 - Check Balance
4 - Deposit Amount
5 - Withdraw Amount
6 - Exit
Enter Your Choice: 
1

Enter name: Yogesh
Minimum age for creating an account is 18.
Enter age: 19
Enter Account Id: 9
Enter your account type: Savings
Enter balance: 8000
Enter minimum balance: 1000

1 - Create Account
2 - Display Account
3 - Check Balance
4 - Deposit Amount
5 - Withdraw Amount
6 - Exit
Enter Your Choice: 
2

Welcome, Yogesh! Below are your account details:
Age: 19
Account Id: 9
Account Type: Savings
Balance: 8000
Minimum Balance: 1000

1 - Create Account
2 - Display Account
3 - Check Balance
4 - Deposit Amount
5 - Withdraw Amount
6 - Exit
Enter Your Choice: 
3

Balance: 8000

1 - Create Account
2 - Display Account
3 - Check Balance
4 - Deposit Amount
5 - Withdraw Amount
6 - Exit
Enter Your Choice: 
4

Enter the amount you want to deposit: 2000

1 - Create Account
2 - Display Account
3 - Check Balance
4 - Deposit Amount
5 - Withdraw Amount
6 - Exit
Enter Your Choice: 
3

Balance: 10000

1 - Create Account
2 - Display Account
3 - Check Balance
4 - Deposit Amount
5 - Withdraw Amount
6 - Exit
Enter Your Choice: 
5

Enter the amount you want to withdraw: 5000
Withdrawal Failed. Maximum limit of one transaction is 1000.

1 - Create Account
2 - Display Account
3 - Check Balance
4 - Deposit Amount
5 - Withdraw Amount
6 - Exit
Enter Your Choice: 
5

Enter the amount you want to withdraw: 1000

1 - Create Account
2 - Display Account
3 - Check Balance
4 - Deposit Amount
5 - Withdraw Amount
6 - Exit
Enter Your Choice: 
3

Balance: 9000

1 - Create Account
2 - Display Account
3 - Check Balance
4 - Deposit Amount
5 - Withdraw Amount
6 - Exit
Enter Your Choice: 
2

Welcome, Yogesh! Below are your account details:
Age: 19
Account Id: 9
Account Type: Savings
Balance: 9000
Minimum Balance: 1000

1 - Create Account
2 - Display Account
3 - Check Balance
4 - Deposit Amount
5 - Withdraw Amount
6 - Exit
Enter Your Choice: 
3

Balance: 9000

1 - Create Account
2 - Display Account
3 - Check Balance
4 - Deposit Amount
5 - Withdraw Amount
6 - Exit
Enter Your Choice: 
6

*/
