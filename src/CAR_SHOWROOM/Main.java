package CAR_SHOWROOM;


import java.awt.*;
import java.util.Scanner;

interface utility{
    public void getDetails();
    public void setDetails();
}

public class Main {

    static void mainMenu(){
        System.out.println();
        System.out.println("============================ *** Welcome To ShowRoom Managment App *** =======================");
        System.out.println();
        System.out.println("============================ *** Enter  Your Choice *** =======================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("============================ *** Enter 0 to exits *** =======================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShowRoom showroom[] = new ShowRoom[5];
        Employees employees[] = new Employees[5];
        Cars cars[] = new Cars[5];

        int carCounter = 0;
        int showroomCounter = 0;
        int employeesCounter = 0;
        int choice = 100;

        while (choice != 0){
            mainMenu();
            choice = sc.nextInt();

            while(choice != 9 && choice != 0){
                switch (choice){
                    case 1:
                        showroom[showroomCounter] = new ShowRoom();
                        showroom[showroomCounter].setDetails();
                        showroomCounter++;
                        System.out.println();
                        System.out.println("1].ADD A NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 2:
                        employees[employeesCounter] = new Employees();
                        employees[employeesCounter].setDetails();
                        employeesCounter++;
                        System.out.println();
                        System.out.println("2].ADD A EMPLOYEES");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        cars[carCounter] = new Cars();
                        cars[carCounter].setDetails();
                        carCounter++;
                        System.out.println();
                        System.out.println("3].ADD A NEW CARS");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 4:
                        for(int i = 0 ; i < showroomCounter; i++){
                            showroom[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXITS");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for(int i = 0 ; i < employeesCounter; i++){
                            employees[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXITS");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for(int i = 0 ; i < carCounter; i++){
                            cars[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXITS");
                        choice = sc.nextInt();
                        break;

                    default:
                        System.out.println("Please enter a valid choice");
                }
            }
        }

    }
}
