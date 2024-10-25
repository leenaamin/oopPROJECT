/**
 *
 * @author mayaralsaedi
 This class extends the Ticket class
 It generates the information of a passenger that chooses to purchase a first class flight Ticket
 */
public class FirstClassTicket extends Ticket {

    /**
     * The seat type of the first class Ticket
     */
    private String seatType;

    /**
     * The price of the the first class Ticket
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
     * @param NumID
     * @param seatType
     * @param basePrice
     * @param additionalAmenitiesFees
     */
    public FirstClassTicket(int NumID ,String seatType, double basePrice, double additionalAmenitiesFees) {
        this.NumID = NumID ;
        this.seatType = seatType;
        this.additionalAmenitiesFees = additionalAmenitiesFees;
        setBasePrice(basePrice);
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
     * A setter method to set the value of the seat type attribute
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
     * This method implements the method that is in the book Ticket interface 
 it returns the price of the seat
     * @return the price of the Ticket
     */
    @Override
    public double GetSeatPrice() {
       return (getBasePrice() + additionalAmenitiesFees);
    }
    
        
    
    /**
     * This method overrides the abstract method in the Ticket class
 It creates a new copy of the Ticket for each passenger so it can change the information of the Ticket for each passenger
     * @param id
     * @param f
     * @return t
     */
    @Override
    public Ticket clone(Ticket id, Flight f) {
        Ticket t = new FirstClassTicket(NumID, seatType, getBasePrice(), additionalAmenitiesFees);
        t.DetailsF = f;
        t.NumID = NumID ;
        return t;
    }
  
    /**
     * This method overrides the equals method in the Ticket class
 It checks if two tickets are equal to each other or not
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
     * This method overrides the method in the Ticket class
     * @return a string representation of the Ticket's information
     */
    @Override 
    public String toString()
    {
        return (super.toString() + "\nSeat Type: " + seatType + "\nPrice: " + GetSeatPrice() + "SAR \nIt includes Wi-Fi, "
                + "Overhead TV, Prayer Area, and Fresh meals \nBaggage Info: 1 piece luggage 7 kilos(Per Person)");
    }

}
