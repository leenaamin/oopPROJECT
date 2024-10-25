
/**
 *@author wajn
 * BusinessTicket inheritance from ticket its subclass 
 * All Implemented Interfaces:bookTicket 
 */

public class BusinessTicket extends Ticket {
     /**
     * attributes
     */
private String SeatType;
private double additionalAmenitiesFees;
     /**
     * default constructors BusinessTicket 
     */
    public BusinessTicket() {
       super();
    }
       /**
     * Parameterized constructor
     * @param SeatType
     * @param additionalAmenitiesFees
     */
    public BusinessTicket(int NumID ,String SeatType, double basePrice, double additionalAmenitiesFees ){
    this.NumID = NumID ;
    this.SeatType=SeatType;
    this.additionalAmenitiesFees = additionalAmenitiesFees;
    setBasePrice(basePrice);
    }
   /** constructors BusinessTicket
     * @param NumID 
     * @param DetailsF 
     * @param DetailsP
     * @param seatType
     * @param additionalAmenitiesFees
     */
    public BusinessTicket(int NumID, Flight DetailsF, Passenger DetailsP, String seatType, double additionalAmenitiesFees) {
        super( NumID,DetailsF, DetailsP);
        this.SeatType = seatType;
        this.additionalAmenitiesFees = additionalAmenitiesFees;
    } 
      /**
     * Getter And Setter
     * @param SeatType 
     * @param additionalAmenitiesFees 
     */
  public void setSeatType(String SeatType) {
        this.SeatType = SeatType;
    }
     public String getSeatType() {
        return SeatType;
    }
  public void setAdditionalAmenitiesFees(double additionalAmenitiesFees) {
        this.additionalAmenitiesFees = additionalAmenitiesFees;
    }
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
     /** method clone Override   
     * @param  id  ticket 
     * @param F 
     * @return t 
     */
    @Override     
public  Ticket clone (Ticket id ,Flight F){
 Ticket t= new BusinessTicket(NumID, SeatType , getBasePrice(), additionalAmenitiesFees);
  t.DetailsF=F;
 t.NumID = NumID ;
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
    
    
    if (obj == null || !(obj instanceof BusinessTicket)) return false;
    
    
    BusinessTicket other = (BusinessTicket) obj;
    
    
    return (this.SeatType.equals(other.SeatType) &&
           this.additionalAmenitiesFees == other.additionalAmenitiesFees);
    
}
    
    /**
     * This method overrides the method in the ticket class
     * @return a string representation of the ticket's information
     */
    @Override 
    public String toString()
    {
        return (super.toString() + "\nSeat Type: " + SeatType + "\nPrice: " + GetSeatPrice() + "SAR \nIt includes Wi-Fi, "
                + "Overhead TV, Prayer Area, amenity kit, and Fresh meals \nBaggage Info: 2 piece luggage 32 kilos(Per Person)");
    }
    
}
