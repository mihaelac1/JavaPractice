package JavaPracticeGitHub.C26_HashTable;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarRentalSystem {
    private static Scanner sc = new Scanner(System.in);
    private static int totalRented = 0;
    private HashMap<String, String> rentedCars =
            new HashMap<String, String>(100, 0.5f);

    private static HashMap<String, RentedCars> ownersInformations =
            new HashMap<String, RentedCars>(100, 0.5f);


    private static int getCarsNo(String ownerName){
        return ownersInformations.get(ownerName).sizeArray();
    }

    private static RentedCars getCarsList(String ownerName){
        if(ownersInformations.containsKey(ownerName)){
            System.out.println("Proprietarul " + ownerName + " are urmatoarele vehicule inchiriate ");
        }else{
            System.out.println("Proprietarul " + ownerName + " nu are nici o masina inchiriata.");
        }
        return ownersInformations.get(ownerName);
    }


    private static String getPlateNo() {
        System.out.println("Introduceti numarul de inmatriculare:");
        return sc.nextLine();
    }

    private static String getOwnerName() {
        System.out.println("Introduceti numele proprietarului:");
        return sc.nextLine();
    }

    private static int getTotalRented() {
        return totalRented;
    }

    // search for a key in hashtable
    private boolean isCarRent(String plateNo) {
        if(rentedCars.containsKey(plateNo.toUpperCase())){
            System.out.println("The vehicle with the plate no " + plateNo + " is in the database!");
        }else{
           System.out.println("The vehicle with the plate no " + plateNo + " isn't in the database!");
        }
        return rentedCars.containsKey(plateNo.toUpperCase());
    }

    // get the value associated to a key
    private String getCarRent(String plateNo) {
        if(rentedCars.containsKey(plateNo.toUpperCase())) {
            return rentedCars.get(plateNo.toUpperCase());
        }else{
            return "The vehicle with the plate no " + plateNo + "isn't in the database";
        }
    }

    // add a new (key, value) pair
    private void rentCar(String plateNo, String ownerName) {
        if(rentedCars.containsKey(plateNo.toUpperCase())){
            System.out.println("Error! The vehicle is already in the list!");
        }else {
            rentedCars.put(plateNo.toUpperCase(), ownerName);

            if(ownersInformations.containsKey(ownerName.toLowerCase())){
                RentedCars carsToAdd = ownersInformations.get(ownerName.toLowerCase());
                carsToAdd.addRentedCars(plateNo.toUpperCase());
                ownersInformations.put(ownerName.toLowerCase(), carsToAdd);
            }else{
                RentedCars carsToAdd = new RentedCars();
                carsToAdd.addRentedCars(plateNo.toUpperCase());
                ownersInformations.put(ownerName.toLowerCase(), carsToAdd);
            }

            totalRented++;
        }
    }

    // remove an existing (key, value) pair
    private void returnCar(String plateNo) {
        if(rentedCars.containsKey(plateNo.toUpperCase())){
            System.out.println("The vechile with the plateNo " + plateNo + " was succesful deleted!");
            rentedCars.remove(plateNo.toUpperCase());
            totalRented--;

        }else{
            System.out.println("The vehicle with the plate no" + plateNo + "isn't in the database.");
        }

    }

    private static void printCommandsList() {
        System.out.println("help         - Afiseaza aceasta lista de comenzi");
        System.out.println("add          - Adauga o noua pereche (masina, sofer)");
        System.out.println("check        - Verifica daca o masina este deja luata");
        System.out.println("remove       - Sterge o masina existenta din hashtable");
        System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
        System.out.println("totalRented  - Afiseaza numarul de masini inchiriate");
        System.out.println("quit         - Inchide aplicatia");
    }

    public void run() {
        boolean quit = false;
        while(!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String command = "";
            boolean nOK = true;
            while(nOK){
                try{
                    command = sc.nextLine();
                    nOK = false;
                }catch (InputMismatchException e){
                    System.out.println("Va rugam introduceti o comanda valida.");
                }
            }

            switch(command) {
                case "help":
                    printCommandsList();
                    break;
                case "add":
                    rentCar(getPlateNo(), getOwnerName());
                    break;
                case "check":
                    System.out.println(isCarRent(getPlateNo()));
                    break;
                case "remove":
                    returnCar(getPlateNo());
                    break;
                case "getOwner":
                    System.out.println(getCarRent(getPlateNo()));
                    break;
                case "totalRented":
                    System.out.println(CarRentalSystem.getTotalRented());
                    break;
                case "getCarsNo":
                    System.out.println(CarRentalSystem.getCarsNo(getOwnerName()));
                    break;
                case "getCarsList":
                    System.out.println(CarRentalSystem.getCarsList(getOwnerName()));
                    break;
                case "quit":
                    System.out.println("Aplicatia se inchide...");
                    quit = true;
                    break;
                default:
                    System.out.println("Unknown command. Choose from:");
                    printCommandsList();
            }
        }
    }

    public static void main(String[] args) {

        // create and run an instance (for test purpose)
        new CarRentalSystem().run();

    }
}
