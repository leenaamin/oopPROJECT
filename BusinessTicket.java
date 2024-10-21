package flightbooking;
/**
 *@author wajn
 * BusinessTicket inheritance from ticket its subclass 
 * All Implemented Interfaces:bookTicket 
 */

public class BusinessTicket extends ticket {
     /**
     * attributs
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
     * @param seatType
     * @param additionalAmenitiesFees
     */
    public BusinessTicket(String SeatType, double basePrice, double additionalAmenitiesFees ){
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
    public BusinessTicket(int NumID, Flights DetailsF, Passenger DetailsP, String seatType, double additionalAmenitiesFees) {
        super( NumID,DetailsF, DetailsP);
        this.seatType = seatType;
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
public  ticket clone (ticket id ,Flights F){
 ticket t= new BusinessTicket(SeatType , getBasePrice(), additionalAmenitiesFees);
  t.DetailsF=F;
 t.NumID=(int)(Math.random()*(101));
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
