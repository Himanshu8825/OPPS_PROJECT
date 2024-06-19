package CAR_SHOWROOM;

import java.util.Scanner;

public class Cars extends ShowRoom implements utility {

    String carName;
    String carColor;
    String carFuelType;
    int carPrice;
    String carType;
    String carTransmission;

    public void getDetails(){
        System.out.println("Car Name: " + carName);
        System.out.println("Car Color: " + carColor);
        System.out.println("Car Fuel Type: "+ carFuelType );
        System.out.println("Car Price: " + carPrice);
        System.out.println("Car Type: "+ carType);
        System.out.println("Car Transmission "+ carTransmission);
    }

    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("============================ *** Enter Car Details *** =======================");
        System.out.println();
        System.out.println("Enter car name: ");
        carName = sc.nextLine();
        System.out.println("Enter car color");
        carColor = sc.nextLine();
        System.out.println("Enter the car fuel type (PETROL/DIESEL): ");
        carFuelType = sc.nextLine();
        System.out.println("Enter the car price");
        carPrice = sc.nextInt();
        System.out.println("Enter the car type (SEDAN/SUV/HATCHBACK): ");
        carType = sc.nextLine();
        System.out.println("Enter car transmission(AUTOMATIC/MANUAL) : ");
        carTransmission = sc.nextLine();
        totalCarInStoks++;
    }

}
