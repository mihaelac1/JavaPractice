package JavaPracticeGitHub.P1_SistemGestiuneInscrieri;

import java.util.*;

public class GuestsList {
    private final int maxParticipants;
    //only one list for waitlist and guest
    private ArrayList<Guest> allParticipantsList;

    public GuestsList(int maxParticipants) {
        this.maxParticipants = maxParticipants;
        this.allParticipantsList = new ArrayList<Guest>();
    }

    // return -1 - the guest is already in the list,
    // 0 - guest added in guest list, x - guest is added in waitlist
    public int add(Guest newGuest) {
        for (Guest guests : this.allParticipantsList) {
            if (guests.equals(newGuest)) {
                return -1;
            }
        }
        this.allParticipantsList.add(newGuest);

        if (this.allParticipantsList.size() < this.maxParticipants) {
            return 0;
        }
        return this.allParticipantsList.size() - this.maxParticipants;
    }

    //return the index of guest by first and last name login -
    public int check(String lastName, String firstName) {
        return returnIndex(lastName, firstName);
    }

    //return the index of guest by phone or email login,
    //I have used option for checking if the login is done by phone or by email
    public int check(String phoneOrEmail, int option) {
       return (returnIndex(phoneOrEmail, option));
    }

    public int returnIndex(String lastName, String firstName) {
        int index = -1;
        for (Guest guests : allParticipantsList) {
            index++;
            if (guests.getLastName().equalsIgnoreCase(lastName) && guests.getFirstName().equalsIgnoreCase(firstName)) {
                return index;
            }
        }
        return -1;
    }

    public int returnIndex(String emailOrPhoneNumber, int option) {
        int index = -1;
        for (Guest guests : allParticipantsList) {
            index++;
            switch(option){
                case 2 -> {if (guests.getEmail().equalsIgnoreCase(emailOrPhoneNumber)) {
                    return index;
                }}
                case 3 -> {if (guests.getPhoneNumber().equalsIgnoreCase(emailOrPhoneNumber)) {
                    return index;
                }
                }
            }
        }
        return -1;
    }

    //remove the guest by finding the index depending on the authentication method
    public boolean remove(String lastName, String firstName) {
        if(check(lastName, firstName) >= 0) {
            allParticipantsList.remove(returnIndex(lastName, firstName));
            return true;
        }

        return false;
    }

    public boolean remove(String phoneOrEmail, int option) {
        if(check(phoneOrEmail, option) >= 0) {
            allParticipantsList.remove(returnIndex(phoneOrEmail, option));
            return true;
        }
        return false;
    }

    //update the fields of guest using the index done by check method in main, option - done in main
    public void updateFirstName(int index, String newFirstName){
        allParticipantsList.get(index).setFirstName(newFirstName);
    }

    public void updateLastName(int index, String newLastName){
        allParticipantsList.get(index).setLastName(newLastName);
    }

    public void updateEmail(int index, String newEmail){
        allParticipantsList.get(index).setEmail(newEmail);
    }

    public void updatePhoneNumber(int index, String newPhoneNumber){
        allParticipantsList.get(index).setPhoneNumber(newPhoneNumber);
    }

    public boolean update(int index, int option, String toUpdate){
        switch(option){
            case 1 -> {updateLastName(index, toUpdate); return true;}
            case 2 -> {updateFirstName(index, toUpdate); return true;}
            case 3 -> {updateEmail(index, toUpdate); return true;}
            case 4 -> {updatePhoneNumber(index, toUpdate); return true;}
        }
        return false;
    }

    //return the guest list
    public ArrayList<Guest> guests() {
        ArrayList<Guest> partipantsList = new ArrayList<>();
        for (int i = 0; i < Math.min(this.allParticipantsList.size(), this.maxParticipants); i++) {
            partipantsList.add(allParticipantsList.get(i));
        }
        return partipantsList;

    }

    //return the waitlist
    public ArrayList<Guest> waitlist() {
        ArrayList<Guest> waitingList = new ArrayList<>();
        if (this.allParticipantsList.size() <= this.maxParticipants) {
            return waitingList;
        }
        if (this.allParticipantsList.size() > this.maxParticipants) {
            for (int i = this.maxParticipants; i < this.allParticipantsList.size(); i++) {
                waitingList.add(this.allParticipantsList.get(i));
            }
        }
        return waitingList;
    }

    //return available places in list of guest
    public int available() {
        if (this.allParticipantsList.size() >= this.maxParticipants) {
            return 0;
        }
        return this.maxParticipants - this.allParticipantsList.size();
    }

    //return number of guest in guest list
    public int guests_no() {
        if (this.allParticipantsList.size() >= this.maxParticipants) {
            return this.maxParticipants;
        }
        return this.allParticipantsList.size();
    }

    //return number of guest in waitlist
    public int waitlist_no() {
        if (this.allParticipantsList.size() >= this.maxParticipants) {
            return this.allParticipantsList.size() - this.maxParticipants;
        }
        return 0;
    }

    //return the number of guest in both list
    public int subscribe_no() {
        return this.allParticipantsList.size();
    }

    //search function that return an array of strings in order to have the output :
    //Contact "index" contains the criteria in the specific field.
    public ArrayList<String> search(String criteria) {
        ArrayList<String> participantsFound = new ArrayList<>();
        int index = 1;
        for (Guest guests : this.allParticipantsList) {
            if (guests.getFirstName().toLowerCase().contains(criteria.toLowerCase())) {
                participantsFound.add("Contact " + index + " contine: firstName = " + guests.getFirstName() + "\n");
            }
            if (guests.getLastName().toLowerCase().contains(criteria.toLowerCase())) {
                participantsFound.add("Contact " + index + " contine: lastName = " + guests.getLastName() + "\n");
            }
            if (guests.getEmail().toLowerCase().contains(criteria.toLowerCase())) {
                participantsFound.add("Contact " + index + " contine: email = " + guests.getEmail() + "\n");
            }
            if (guests.getPhoneNumber().toLowerCase().contains(criteria.toLowerCase())) {
                participantsFound.add("Contact " + index + " contine: phoneNumber = " + guests.getPhoneNumber() + "\n");
            }
            index++;
        }
        return participantsFound;

    }

    //used for printing the guest list or the waitlist with the number of ordre.
    public void printListsParticipants(ArrayList<Guest> listToPrint){
        ArrayList<String> myList = new ArrayList<>();
        int index = 1;
        for(Guest guest : listToPrint){
            System.out.print(index + ". " + guest.toString());
            index++;
        }
    }

    @Override
    public String toString() {
        return "GuestsList{" +
                "maxParticipants=" + maxParticipants +
                ", allParticipantsList=" + allParticipantsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuestsList that = (GuestsList) o;
        return maxParticipants == that.maxParticipants && Objects.equals(allParticipantsList, that.allParticipantsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxParticipants, allParticipantsList);
    }
}
