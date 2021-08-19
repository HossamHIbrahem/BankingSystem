/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.util.Scanner;

/**
 *
 * @author hossam
 */

public class ATM {
    
    Scanner customerInput = new Scanner(System.in);

    int bankAccountNumber, pin, userChoice;
    String customerName;
    float balance,money,withdrawalMoney;
    

    public void setCustomerCardDetails(){
        System.out.println("What is your PIN ");

        
        pin = customerInput.nextInt();
        
        Scanner customerInputName = new Scanner(System.in);

        System.out.println("What is your name ");
        
        customerName = customerInputName.nextLine();
        
        System.out.println("what is your bank Account Number ");
        
        bankAccountNumber = customerInput.nextInt();
        
        System.out.println("Can you please enter your balance ");
        balance = customerInput.nextFloat();
        
    }
    public void getCustomerCardDetails(){
        System.out.println("Welcome " + customerName);
        System.out.println("your bank number is " +bankAccountNumber);
        System.out.println("you have " +balance);
        System.out.println("How i can help you ?");
        AskingForServices();
        
        
    }
    public void deposit(){
        System.out.println("Please enter the deposited amount ");
        Scanner userMoney = new Scanner(System.in);
        money = userMoney.nextFloat();
        balance = balance + money;
        
        System.out.println("your new balance is " +balance );
        System.out.println("Do you want something else?");
        
        AskingForServices();
        
    }
    public void withdraw(){
        System.out.println("How much you want to withdraw ");
        Scanner customerInputName = new Scanner(System.in);
        withdrawalMoney = customerInputName.nextFloat();
        
        if (withdrawalMoney > balance){
            System.out.println("Sorry, your balance is less than you want ");
            
        }
        else {
            balance = balance - withdrawalMoney;
            System.out.println("Please take the money");
            System.out.println("Please note that your balance is :" +balance );
            System.out.println("Do you want something else?");

            AskingForServices();
        }
    }
    public void checkYourBalance(){
        System.out.println("your balance is " +balance);
        System.out.println("Do you want something else?");

        AskingForServices();
    }
    public void AskingForServices(){
        System.out.println("1- Deposit \n 2- Withdraw \n 3-Check your balance \n 4- No");
        userChoice = customerInput.nextInt();
        
        switch(userChoice){
            case 1 :
                deposit();
                break;
            case 2 :
                withdraw();
                break;
            case 3 :
                checkYourBalance();
                break;
            case 4:
                System.out.println("Ok, Have a nice day ..");
                
        }
    }
}
