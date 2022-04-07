package demo;

public class Business{
    protected String name;    // Member accessible by self and derived classes
    private String address;   // Member accessible only by self
    
    public void printMembers() { // Member accessible by anyone
        System.out.println(this.name + " " + this.address);
    }
   
}