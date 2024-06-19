package CAR_SHOWROOM;

import java.util.Scanner;

public class ShowRoom implements utility {
    String shorRoomName ;
    String showRoomAddress;
    int totalEmployees;
    int totalCarInStoks=0;
    String managerName;

    public void getDetails(){
        System.out.println("ShorRoom Name : " + shorRoomName);
        System.out.println("ShorRoom Address :" + showRoomAddress);
        System.out.println("Manager Name :" + managerName);
        System.out.println("Total Employees :"+ totalEmployees);
        System.out.println("Totals Car In Stocks :" + totalCarInStoks);
    }

    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("============================ *** Enter SHow Room Details *** =======================");
        System.out.println();
        System.out.println("ShowRoom Name");
        shorRoomName = sc.nextLine();
        System.out.println("ShowRoom Address: ");
        showRoomAddress = sc.nextLine();
        System.out.println("Manager Name: ");
        managerName = sc.nextLine();
        System.out.println("Total Employess: ");
        totalEmployees = sc.nextInt();
        System.out.println("Cars Stocks: ");
        totalCarInStoks = sc.nextInt();
    }
}
