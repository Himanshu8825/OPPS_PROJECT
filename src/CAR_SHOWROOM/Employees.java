package CAR_SHOWROOM;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends ShowRoom implements utility {
    String empID;
    String empName;
    int empAge;
    String empDepartment;

    public void getDetails(){
        System.out.println("Employee ID: "+ empID);
        System.out.println("Employee Name :" + empName);
        System.out.println("Employee Age :" + empAge);
        System.out.println("Employee Department :" + empDepartment);
        System.out.println("ShowRoom Name : " + shorRoomName);
    }

    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        empID = String.valueOf(uuid);
        System.out.println("============================ *** Enter Employees Details *** =======================");
        System.out.println("Enter the EmployeeID :");
        empID = sc.nextLine();
        System.out.println("Enter the Employee Name : ");
        empName = sc.nextLine();
        System.out.println("Enter the Employee Age :");
        empAge = sc.nextInt();
        System.out.println("Enter the Employee Department :");
        empDepartment = sc.nextLine();
        System.out.println("Show Room Name :");
        shorRoomName = sc.nextLine();
    }
}
