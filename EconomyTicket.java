/**
 *The EconomyTicket class extends a Ticket class ,EconomyTicket class have  one Attribute of the type String for the seat type,one Attribute of the type double for the price
 * two constructors a defult one and a parametriz one 
 * a GetSeatPrice method to return the seat price 
 * a clone method for EconomyTicket object assigns it a random ID and associates it with the provided Flights object
 * a toString method
 * @author leeno
 */
public class EconomyTicket extends Ticket {
     /**
      SeatType attribute of EconomyTicket class
     */
 private String SeatType;
    /**
      Price  attribute of EconomyTicket class
     */
 private double Price;
     /**
      default constructors for EconomyTicket class
     */
 public EconomyTicket(){

}
  
    /**
     * @param NumID
     * @param SeatType
      @param Price 
     */
public EconomyTicket(int NumID, String SeatType,double Price ){
    this.NumID = NumID ;
    this.SeatType="Economy";
    this.Price=Price;
 }

  
  
  /** constructors for EconomyTicket class
      @param NumID 
      @param DetailsFlight 
      @param PassengDetails
     */
    public EconomyTicket ( int NumID, Flight DetailsFlight, Passenger PassengDetails) {
        super(NumID ,DetailsFlight, PassengDetails);
    }

    public String getSeatType() {
        return SeatType;
    }

    public void setSeatType(String SeatType) {
        this.SeatType = SeatType;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
  

  
     @Override
    // implements BookTicket 
     /**
      implements BookTicket  
      @return Price 
     */
       public double GetSeatPrice(){

         return Price ;
       }

  
       
       /**
     * method clone Override   
     * @param  id  Ticket 
     * @param F 
     * @return t 
     */
 @Override
 public  Ticket clone (Ticket id ,Flight F){
  Ticket t= new EconomyTicket(NumID, SeatType , Price);
  t.DetailsF=F;
  t.NumID = NumID ;
 return t;
 }
 
 
    /**
      method toString Override    
      @return   String For seat type information 
      will display string of this object
     */
    @Override
    public String toString() {
        return super.toString() +  "\nSeatType is : " + SeatType +","+" Price: "+Price+" SR"+"\n*Wi-Fi  *Overhead TV  *Prayer Area *fresh meals \n Baggage Info: 1 Piece + 23 Kilos (Per Person)" ;
    }

    }
