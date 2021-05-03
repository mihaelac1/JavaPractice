package JavaPracticeGitHub.P1_SistemGestiuneInscrieri;

import java.io.*;
import java.util.*;

public class MainAutomaticTesting {

    private static GuestsList devMindEventList;
    private static int maxParticipants;

    private static File file = new File("./src/Homework/Proiect1_SistemGestiuneInscrieri/ScenariuTestProiect.txt");
    private static Scanner inputScanner;
    static {
        try {
            inputScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void help() {
        HandleUserInputAutomatic.help();
    }

    public static void add() {
        HandleUserInputAutomatic.inputAdd();
        String lastName = HandleUserInputAutomatic.inputLastName(inputScanner);
        String firstName = HandleUserInputAutomatic.inputFirstName(inputScanner);
        String email = HandleUserInputAutomatic.inputEmail(inputScanner);
        String phoneNumber = HandleUserInputAutomatic.inputPhoneNumber(inputScanner);
        Guest newGuest = new Guest(lastName, firstName, email, phoneNumber);
        int idx = devMindEventList.add(newGuest);
        if (idx == 0) {
            System.out.println("[" + newGuest.getLastName() + " " + newGuest.getFirstName() + "] Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
        } else if (idx > 0) {
            System.out.println("[" + newGuest.getLastName() + " " + newGuest.getFirstName() +
                    "] Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine " + devMindEventList.waitlist_no() + " Te vom notifica daca un loc devine disponibil.");
        } else {
            System.out.println("[" + newGuest.getLastName() + " " + newGuest.getFirstName() +
                    "] sunteti deja inscris la eveniment. Va multumim!");
        }
    }

    public static int check() {
        do {
            int option = Integer.valueOf(HandleUserInputAutomatic.login(inputScanner));
            switch (option) {
                case 1 -> {
                    String lastName = HandleUserInputAutomatic.inputLastName(inputScanner);
                    String firstName = HandleUserInputAutomatic.inputFirstName(inputScanner);

                    if (devMindEventList.check(lastName, firstName) >= 0) {
                        System.out.println("Persoana cautata este inscrisa!");
                    } else {
                        System.out.println("Persoana cautata nu este inscrisa!");
                    }
                    return devMindEventList.check(lastName, firstName);
                }
                case 2 -> {
                    String email = HandleUserInputAutomatic.inputEmail(inputScanner);
                    if (devMindEventList.check(email, option) >= 0) {
                        System.out.println("Persoana cautata este inscrisa!");
                    } else {
                        System.out.println("Persoana cautata nu este inscrisa!");
                    }
                    return devMindEventList.check(email, option);
                }
                case 3 -> {
                    String phoneNumber = HandleUserInputAutomatic.inputPhoneNumber(inputScanner);
                    if (devMindEventList.check(phoneNumber, option) >= 0) {
                        System.out.println("Persoana cautata este inscrisa!");
                    } else {
                        System.out.println("Persoana cautata nu este inscrisa!");
                    }
                    return devMindEventList.check(phoneNumber, option);
                }
            }
        } while (true);
    }

    public static void remove() {
        HandleUserInputAutomatic.inputDelete();
        int option = Integer.valueOf(HandleUserInputAutomatic.login(inputScanner));
        switch (option) {
            case 1 -> {
                String lastName = HandleUserInputAutomatic.inputLastName(inputScanner);
                String firstName = HandleUserInputAutomatic.inputFirstName(inputScanner);
                if (devMindEventList.check(lastName, firstName) >= 0) {
                    if (devMindEventList.waitlist_no() > 0 && devMindEventList.check(lastName, firstName) < maxParticipants) {
                        HandleUserInputAutomatic.confirmationMessage(devMindEventList.waitlist().get(0).getLastName(), devMindEventList.waitlist().get(0).getFirstName());
                    }
                    devMindEventList.remove(lastName, firstName);
                    HandleUserInputAutomatic.confirmationDelete();
                } else {
                    System.out.println("Eroare: Persoana nu este inscrisa la eveniment.");
                }
            }
            case 2 -> {
                String email = HandleUserInputAutomatic.inputEmail(inputScanner);
                if (devMindEventList.check(email, option) >= 0) {
                    if (devMindEventList.waitlist_no() > 0 && devMindEventList.check(email, option) < maxParticipants) {
                        HandleUserInputAutomatic.confirmationMessage(devMindEventList.waitlist().get(0).getLastName(), devMindEventList.waitlist().get(0).getFirstName());
                    }
                    devMindEventList.remove(email, option);
                    HandleUserInputAutomatic.confirmationDelete();
                } else {
                    System.out.println("Eroare: Persoana nu este inscrisa la eveniment.");
                }
            }
            case 3 -> {
                String phoneNumber = HandleUserInputAutomatic.inputPhoneNumber(inputScanner);
                if (devMindEventList.check(phoneNumber, option) >= 0) {
                    if (devMindEventList.waitlist_no() > 0 && devMindEventList.check(phoneNumber, option) < maxParticipants) {
                        HandleUserInputAutomatic.confirmationMessage(devMindEventList.waitlist().get(0).getLastName(), devMindEventList.waitlist().get(0).getFirstName());
                    }
                    devMindEventList.remove(phoneNumber, option);
                    HandleUserInputAutomatic.confirmationDelete();
                } else {
                    System.out.println("Eroare: Persoana nu este inscrisa la eveniment.");
                }
            }
        }
    }

    public static void update() {
        HandleUserInputAutomatic.inputUpdate();
        int indexToUpdate = check();
        if (indexToUpdate > 0) {
            int option = Integer.valueOf(HandleUserInputAutomatic.fieldToUpdate(inputScanner));
            switch (option) {
                case 1 -> {
                    String lastName = HandleUserInputAutomatic.inputLastName(inputScanner);
                    if (indexToUpdate >= 0) {
                        devMindEventList.update(indexToUpdate, option, lastName);
                        System.out.println("Numele de familie modificat cu succes!");
                    }
                  //  return;
                }
                case 2 -> {
                    String firstName = HandleUserInputAutomatic.inputFirstName(inputScanner);
                    if (indexToUpdate >= 0) {
                        devMindEventList.update(indexToUpdate, option, firstName);
                        System.out.println("Prenumele modificat cu succes!");
                    }
                  //  return;
                }
                case 3 -> {
                    String email = HandleUserInputAutomatic.inputEmail(inputScanner);
                    if (indexToUpdate >= 0) {
                        devMindEventList.update(indexToUpdate, option, email);
                        System.out.println("Email modificat cu succes!");
                    }
                  //  return;
                }
                case 4 -> {
                    String phoneNumber = HandleUserInputAutomatic.inputPhoneNumber(inputScanner);
                    if (indexToUpdate >= 0) {
                        devMindEventList.update(indexToUpdate, option, phoneNumber);
                        System.out.println("Numarul de telefon modificat cu succes!");
                    }
                   // return;
                }
            }
        }
    }

    public static void guests() {
        ArrayList<Guest> guestList = new ArrayList<>(devMindEventList.guests());
        if (guestList.size() == 0) {
            System.out.println("Niciun participants inscris...");
        } else {
            devMindEventList.printListsParticipants(guestList);
        }
    }

    public static void waitlist() {
        ArrayList<Guest> waittList = new ArrayList<>(devMindEventList.waitlist());
        if (waittList.size() == 0) {
            System.out.println("Lista de asteptare este goala.");
        } else {
            devMindEventList.printListsParticipants(waittList);
        }
    }

    public static void available() {
        System.out.println("Numarul de locuri ramase: " + devMindEventList.available());
    }

    public static void guests_no() {
        System.out.println("Numarul de participanti: " + devMindEventList.guests_no());
    }

    public static void waitlist_no() {
        System.out.println("Dimensiunea listei de asteptare: " + devMindEventList.waitlist_no());
    }

    public static void subscribe_no() {
        System.out.println("Numarul total de persoane: " + devMindEventList.subscribe_no());
    }

    public static void search() {
        String searchCriteria = HandleUserInputAutomatic.inputSearch(inputScanner);
        System.out.println(devMindEventList.search(searchCriteria));
    }

    public static void quit() {
        System.out.println("Aplicatia se inchide...");
    }

    public static void main(String[] args) {
        maxParticipants = HandleUserInputAutomatic.inputMaxParticipants(inputScanner);
        HandleUserInputAutomatic.nextLine(inputScanner);
        devMindEventList = new GuestsList(maxParticipants);

        while (true) {
            String command = HandleUserInputAutomatic.waitCommand(inputScanner);
            System.out.println(command);
            switch (command) {
                case "help" -> help();
                case "add" -> add();
                case "check" -> check();
                case "remove" -> remove();
                case "update" -> update();
                case "guests" -> guests();
                case "waitlist" -> waitlist();
                case "available" -> available();
                case "guests_no" -> guests_no();
                case "waitlist_no" -> waitlist_no();
                case "subscribe_no" -> subscribe_no();
                case "search" -> search();
                case "quit" -> {
                    quit();
                    return;
                }
                default -> HandleUserInput.unknownCommand();
            }
            System.out.println();
        }
    }
}
