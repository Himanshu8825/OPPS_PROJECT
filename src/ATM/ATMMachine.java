package ATM;


import java.util.Scanner;

class ATM{
    double Balance;
    int PIN = 8825;

    public ATM(){
        checkPin();
    }

    public void checkPin(){
        System.out.println("Please enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int userPin = sc.nextInt();

        if(PIN == userPin){
            menu();
        }else{
            System.out.println("Please enter valid pin");
            checkPin();
        }
    }

    public void menu(){
        System.out.println("Please select menu:) ");
        System.out.println("Press '1' for balance enquary");
        System.out.println("Press '2' for Deposite Money");
        System.out.println("Press '3' for Withraw Money");
        System.out.println("Press '4' for Exit");
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();

        if(option == 1){
           checkBalance();
        }
        else if(option == 2){
            depositeMoney();
        }
        else if(option == 3){
            withdrowMoney();
        }
        else if(option == 4){
            return;
        }
        else{
            System.out.println("Please select a valid Input");
            menu();
        }
    }

    public void checkBalance(){
        System.out.println("Balance: "+ Balance);
        menu();
    }

    public void depositeMoney(){
        System.out.println("Please enter amount to deposite: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        Balance = Balance + amount;
        System.out.println("Your money deposited successfully......");
        menu();
    }

    public void withdrowMoney(){
        System.out.println("Please enter a withdrowal amount: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        if(amount > Balance){
            System.out.println("Insufficient Fund");
        }
        else{
            Balance = Balance-amount;
            System.out.println("Money withdawal successfully...");
        }

        menu();
    }

}