package demo;

public class Restaurant extends Business{
    private int rating;
    
    public void displayRestaurant() {
        // Attempted accesses
        System.out.println();       // OK
        name = "Gyro Hero";         // OK    ("protected" above made this possible)
        //address = "5 Fifth St";    // ERROR
    }
    
    // Other class members ...
}