/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flightbooking;

/**
 *
 * @author mayaralsaedi
 * This class extends the ticket class
 * It generates the information of a passenger that chooses to purchase a first class flight ticket
 */
public class FirstClassTicket extends Ticket {

    /**
     * The seat type of the first class ticket
     */
    private String seatType;

    /**
     * The price of the the first class ticket
     */
    private double additionalAmenitiesFees;

    
    /**
     * Default constructor
     */
    public FirstClassTicket() {
        super();
    }

    /**
     * Parameterized constructor
     * @param seatType
     * @param additionalAmenitiesFees
     */
    public FirstClassTicket(String seatType, double additionalAmenitiesFees) {
        this.seatType = seatType;
        this.additionalAmenitiesFees = additionalAmenitiesFees;
    }
    
     /**
     * Parameterized constructor
     * @param NumID
     * @param DetailsF
     * @param DetailsP
     * @param seatType
     * @param additionalAmenitiesFees
     */
    public FirstClassTicket(int NumID, Flight DetailsF, Passenger DetailsP, String seatType, double additionalAmenitiesFees) {
        super(NumID, DetailsF, DetailsP);
        this.seatType = seatType;
        this.additionalAmenitiesFees = additionalAmenitiesFees;
    }
  
    /**
     * A settor method to set the value of the seat type attribute
     * @param seatType
     */
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    /**
     * A getter method to return the value of the seat type attribute 
     * @return seatType
     */
    public String getSeatType() {
        return seatType;
    }

     /**
     * A settor method to set the value of the additionalAmenitiesFees attribute
     * @param additionalAmenitiesFees
     */
    public void setAdditionalAmenitiesFees(double additionalAmenitiesFees) {
        this.additionalAmenitiesFees = additionalAmenitiesFees;
    }

    /**
     * A getter method to return the value of the price attribute 
     * @return additionalAmenitiesFees
     */
    public double getAdditionalAmenitiesFees() {
        return additionalAmenitiesFees;
    }

    /**
     * This method implements the method that is in the book ticket interface 
     * it returns the price of the seat
     * @return the price of the ticket
     */
    @Override
    public double GetSeatPrice() {
        return (getBasePrice() + additionalAmenitiesFees);
    }

    /**
     * This method overrides the abstract method in the ticket class
     * It creates a new copy of the ticket for each passenger so it can change the information of the ticket for each passenger
     * @param id
     * @param f
     * @return t
     */
    @Override
    public Ticket clone(Ticket id, Flight f) {
        Ticket t = new FirstClassTicket(seatType, additionalAmenitiesFees);
        t.DetailsF = f;
        t.NumID = (int) (Math.random() * (101));
        return t;
    }
  
    /**
     * This method overrides the equals method in the ticket class
     * It checks if two tickets are equal to each other or not
     * @return true if the two objects are equal to each other and false if they are not
     */
@Override
public boolean equals(Object obj)
{
    if (this == obj) return true;
    
    
    if (obj == null || !(obj instanceof FirstClassTicket)) return false;
    
    
    FirstClassTicket other = (FirstClassTicket) obj;
    
    
    return (this.seatType.equals(other.seatType) &&
           this.additionalAmenitiesFees == other.additionalAmenitiesFees);
    
}
    
    /**
     * This method overrides the method in the ticket class
     * @return a string representation of the ticket's information
     */
    @Override 
    public String toString()
    {
        return (super.toString() + "\nSeat Type: " + seatType + "\nPrice: " + GetSeatPrice() + "SAR \nIt includes Wi-Fi, "
                + "Overhead TV, Prayer Area, and Fresh meals \nBaggage Info: 1 piece luggage 7 kilos(Per Person)");
    }

}
