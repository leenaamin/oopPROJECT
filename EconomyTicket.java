package flightbooking;

/**
 @author leeno
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
    public EconomyTicket ( int NumID, Flight DetailsFlight, Passenger PassengDetails) {
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
 public  ticket clone (Ticket id ,Flight F){
 Ticket t= new EconomyTicket(SeatType , Price);
 t.FlightsDetails=F;
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
    


