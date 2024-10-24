package flightbooking;

/**
 *The EconomyTicket class extends a Ticket class ,EconomyTicket class have  one Attribute of the type String for the seat type,one Attribute of the type double for the price
 * two constructors a defult one and a parametriz one 
 * a GetSeatPrice method to return the seat price 
 * a clone method for EconomyTicket object assigns it a random ID and associates it with the provided Flights object
 * @author leeno
 */
public class EconomyTicket extends Ticket {
     /**
      SeatType attribute of EconomyTicket class
     */
 public String SeatType;
    /**
      Price  attribute of EconomyTicket calss
     */
 public double Price;
     /**
      default constructors for EconomyTicket class
     */
 public EconomyTicket(){

}
  
    /**
      @param Price 
     */
public EconomyTicket(String SeatType,double Price ){
    this.SeatType="Economy";
    this.Price=Price;
 }

  
  
  /** constructors for EconomyTicket calss
      @param NumID 
      @param DetailsFlight 
      @param PassengDetails
     */
    public EconomyTicket ( int NumID, Flights DetailsFlight, Passenger PassengDetails) {
        super(NumID ,DetailsFlight, PassengDetails);
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
 public  Ticket clone (Ticket id ,Flights F){
 Ticket t= new EconomyTicket(SeatType , Price);
 t.DetailsF=F;
 t.NumID= (int)(Math.random()*(101));
 return t;
 }
 
 
    /**
      method toString Override    
      @return   String For seat type information 
      will display string of this object
     */
    @Override
    public String toString() {
        return  "SeatType is : " + SeatType +","+" Price: "+Price+" SR"+"\n*Wi-Fi  *Overhead TV  *Prayer Area *fresh meals \n Baggage Info: 1 Piece + 7 Kilos (Per Person)" ;
    }

    }
