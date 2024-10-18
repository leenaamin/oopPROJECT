package flightbooking;
/**
 *@author wajn
 * BusinessTicket inheritance from ticket its subclass 
 * All Implemented Interfaces:BookTicket 
 * this class is subclass from ticket and Each ticket will have its own category and each category has a different price for each flight so in this class 
we Override method GetSeatPrice and clone also to string 
 */

public class BusinessTicket extends ticket {
     /**
     * attributs
     */
private String SeatType;
 private double Price;
     /**
     * default constructors BusinessTicket 
     */
    public BusinessTicket() {
          
    }
     /**
     * constructors BusinessTicket
     * @param SeatType 
     * @param Price 
     */
    public BusinessTicket(String SeatType,double Price ){
    this.SeatType=SeatType;
    this.Price=Price;
    }
   /** constructors BusinessTicket
     * @param NumID 
     * @param DetailsF 
     * @param DetailsP
     */
    public BusinessTicket(int NumID, Flights DetailsF, Passenger DetailsP) {
        super( NumID,DetailsF, DetailsP);
    } 
      /**
     * Getter And Setter
     * @param SeatType 
     * @param Price 
     */
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
     /**
     * implements BookTicket  
     * @return Price 
     */
      @Override
       public double GetSeatPrice(){

         return Price ;
       }
     /** method clone Override   
     * @param  id  ticket 
     * @param F 
     * @return t 
     */
    @Override     
public  ticket clone (ticket id ,Flights F){
 ticket t= new BusinessTicket(SeatType , Price);
  t.DetailsF=F;
 t.NumID=(int)(Math.random()*(101));
 return t;
 }
     /**
     * method toString Override    
     * @return   String For seat type information 
     * will display string of this object
     */
    @Override
    public String toString() {
        return  "SeatType is : " + SeatType +","+" Price ="+Price+" Rial"+"\n*Power-Wi-Fi&USB  *On-Demand TV  *Prayer Area *fresh meals \n Baggage Info: 1 Piece + 7 Kilos (Per Person)" ;
    }
    
}
