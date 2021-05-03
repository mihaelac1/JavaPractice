package JavaPracticeGitHub.C26_HashTable;

import java.util.*;

public class RentedCars {

    private  List<String> rentedCarsByOwners = new ArrayList<>();

    public void setRentedCarsByOwners(List<String> rentedCarsByOwners) {
        this.rentedCarsByOwners = rentedCarsByOwners;
    }

    public void addRentedCars(String car) {
        this.rentedCarsByOwners.add(car);
    }

    public List<String> getRentedCarsByOwners() {
        return rentedCarsByOwners;
    }

    public int sizeArray(){
        return rentedCarsByOwners.size();
    }

    @Override
    public String toString() {
        return "RentedCars{" + rentedCarsByOwners + '}';
    }
}
