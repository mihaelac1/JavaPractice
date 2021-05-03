package JavaPracticeGitHub.P1_SistemGestiuneInscrieri;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleUserInput {

    private static Scanner inputScanner = new Scanner(System.in);

    public static void nextLine(){
        System.out.println(inputScanner.nextLine());
    }
    public static int inputMaxParticipants(){
        System.out.println("Bun venit! Introduceti numarul de locuri disponibile: ");
        int maxParticipants = -1;
        boolean nOk = true;

        while(nOk) {
            try {
                maxParticipants = inputScanner.nextInt();
                nOk = false;
            } catch (InputMismatchException e) {
                inputScanner.nextLine();
                System.out.println("Nu ai introdus o valoare intreaga. Te rog sa reincerci.");
            }
        }

        while(maxParticipants < 1){
            System.out.println("Numarul de locuri disponibile nu este valid. \nVa rugam, introduceti din nou noumarul de locuri dispobibile.");
            maxParticipants = inputScanner.nextInt();
        }
        return maxParticipants;
    }

    public static String login() {
        while (true) {
            System.out.println("Alege modul de autentificare, tastand:\n" +
                    "\t\"1\" - Nume si prenume\n" +
                    "\t\"2\" - Email\n" +
                    "\t\"3\" - Numar de telefon (format \"+40733386463\")");
            boolean nOk = true;
            String option ="";
            while(nOk){
                try{
                    option = inputScanner.nextLine();
                    nOk = false;
                }catch(InputMismatchException e){
                    System.out.println("Va rugam introduceti o comanda valida!");
                }
            }

            if (option.equals("1") || option.equals("2") || option.equals("3")) {
                return option;
            }else{
                unknownCommand();
            }
        }
    }

    public static String inputFirstName(){
        System.out.println("Introduceti prenumele: ");
        String firstName = inputScanner.nextLine();
        while(!CheckValidFields.checkNameValid(firstName)){
            System.out.println("Va rugam introduceti un prenume valid:");
            firstName = inputScanner.nextLine();
        }
        return firstName.trim();
    }

    public static String inputLastName(){
        System.out.println("Introduceti numele de familie: ");
        String lastName = inputScanner.nextLine();
        while(!CheckValidFields.checkNameValid(lastName)){
            System.out.println("Va rugam introduceti un nume de familie valid:");
            lastName = inputScanner.nextLine();
        }
        return lastName.trim();
    }

    public static String inputEmail(){
        System.out.println("Introduceti email: ");
        String email = inputScanner.nextLine();
        while(!CheckValidFields.checkEmailValid(email)){
            System.out.println("Va rugam introduceti un email valid:");
            email = inputScanner.nextLine();
        }
        return email.trim();
    }

    public static String inputPhoneNumber(){
        System.out.println("Introduceti numarul de telefon (format \"+40733386463\"): ");
        String phoneNumber = inputScanner.nextLine();
        while(!CheckValidFields.checkPhoneNumberValid(phoneNumber)){
            System.out.println("Va rugam introduceti un numar de telefon valid (format \"+40733386463\"):");
            phoneNumber = inputScanner.nextLine();
        }
        phoneNumber = phoneNumber.replaceFirst ("^0*", "");
        return phoneNumber.trim();
    }

    public static String fieldToUpdate(){
        while (true) {
            System.out.println("Alege campul de actualizat, tastand:\n" +
                    "\"1\" - Nume\n" +
                    "\"2\" - Prenume\n" +
                    "\"3\" - Email\n" +
                    "\"4\" - Numar de telefon (format \"+40733386463\")");
            String option = inputScanner.nextLine();
            if (option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4")) {
                return option;
            }else{
                unknownCommand();
            }
        }
    }

    public static void help(){
        System.out.println("help - Afiseaza aceasta lista de comenzi\n" +
                "add - Adauga o noua persoana (inscriere)\n" +
                "check - Verifica daca o persoana este inscrisa la eveniment\n" +
                "remove - Sterge o persoana existenta din lista\n" +
                "update - Actualizeaza detaliile unei persoane\n" +
                "guests - Lista de persoane care participa la eveniment\n" +
                "waitlist - Persoanele din lista de asteptare\n" +
                "available - Numarul de locuri libere\n" +
                "guests_no - Numarul de persoane care participa la eveniment\n" +
                "waitlist_no - Numarul de persoane din lista de asteptare\n" +
                "subscribe_no - Numarul total de persoane inscrise\n" +
                "search - Cauta toti invitatii conform sirului de caractere introdus\n" +
                "quit - Inchide aplicatia");
    }

    public static String waitCommand(){
        System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
        String command = inputScanner.nextLine();
        return command.trim();
    }

    public static void unknownCommand(){
        System.out.println("Comanda introdusa nu este valida. \n Incercati inca o data.");
    }

    public static String inputSearch(){
        System.out.println("Introduceti sirul de caractere dupa care vreti sa facem cautarea: ");
        String searchCriteria = inputScanner.nextLine();
        return searchCriteria;
    }

    public static void inputAdd(){
        System.out.println("Se adauga o noua persoana: ");
    }

    public static void inputDelete(){
        System.out.println("Se sterge o persoana existenta din lista…");
    }

    public static void confirmationMessage(String lastName, String firstName){
        System.out.println("[" + lastName + " " + firstName + "] Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");

    }

    public static void confirmationDelete(){
        System.out.println("Stergerea persoanei s-a realizat cu succes.");
    }

    public static void inputUpdate(){
        System.out.println("Se actualizeaza detaliile unei persoane…");
    }

}
