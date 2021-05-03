package JavaPracticeGitHub.P1_SistemGestiuneInscrieri;

import java.util.*;

public class Guest {
    //Fields
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;

    //Constructor
    public Guest(String lastName, String firstName, String email, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  "Nume: " + this.lastName + " " + this.firstName +
                ", Email: " + this.email + ", Telefon: " + this.phoneNumber + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(lastName, guest.lastName) && Objects.equals(firstName, guest.firstName) && Objects.equals(email, guest.email) && Objects.equals(phoneNumber, guest.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, email, phoneNumber);
    }
}
