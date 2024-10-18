

/**
  @author leeno
 */
public class EconomyTicket {
     /**
     * SeatType attribute of EconomicTicket 
     */
 public String SeatType;
    /**
     * Price of attribute EconomicTicket 
     */
 public double Price;
     /**
     * default constructors EconomicTicket
     */
 public EconomyTicket(){

}
    /**
     * constructors EconomicTicket
     * @param SeatType
     * @param Price 
     */
public EconomyTicket(String SeatType,double Price ){
    this.SeatType="Economic";
    this.Price=Price;
 }
  /** constructors EconomicTicket
     * @param NumID 
     * @param DetailsFlight 
     * @param PassengDetails
     */
    public EconomyTicket ( int NumID,Flights DetailsFlight, Passenger PassengDetails) {
        super(NumID ,DetailsFlight, PassengDetails);
    }
     @Override
    // implements BookTicket 
     /**
     * implements BookTicket  
     * @return Price 
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
 public  ticket clone (ticket id ,Flights F){
 ticket t= new EconomyTicket(SeatType , Price);
 t.DetailsFlight=F;
 t.NumID= (int)(Math.random()*(101));
 return t;
 }
    /**
     * method toString Override    
     * @return   String For seat type information 
     * will display string of this object
     */
    @Override
    public String toString() {
        return  "SeatType is : " + SeatType +","+" Price ="+Price+" Rial"+"\n*Wi-Fi  *Overhead TV  *Prayer Area *fresh meals \n Baggage Info: 1 Piece + 7 Kilos (Per Person)" ;
    }

    }
    

