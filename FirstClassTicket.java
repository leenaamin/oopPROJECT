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
    private double price;

    
    /**
     * Default constructor
     */
    public FirstClassTicket() {
        super();
    }

    /**
     * Parameterized constructor
     * @param seatType
     * @param price
     */
    public FirstClassTicket(String seatType, double price) {
        this.seatType = seatType;
        this.price = price;
    }
    
     /**
     * Parameterized constructor
     * @param NumID
     * @param DetailsF
     * @param DetailsP
     * @param seatType
     * @param price
     */
    public FirstClassTicket(int NumID, Flight DetailsF, Passenger DetailsP, String seatType, double price) {
        super(NumID, DetailsF, DetailsP);
        this.seatType = seatType;
        this.price = price;
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
     * A settor method to set the value of the price attribute
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * A getter method to return the value of the price attribute 
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * This method implements the method that is in the book ticket interface 
     * it returns the price of the seat
     * @return price
     */
    @Override
    public double GetSeatPrice() {
        return price;
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
        Ticket t = new FirstClassTicket(seatType, price);
        t.DetailsF = f;
        t.NumID = (int) (Math.random() * (101));
        return t;
    }
    
    /**
     * This method ovverides the method in the ticket class
     * @return a string representation of the ticket's information
     */
    @Override 
    public String toString()
    {
        return (super.toString() + "\nSeat Type: " + seatType + "\nPrice: " + price + "SAR \nIt includes Wi-Fi, "
                + "Overhead TV, Prayer Area, and Fresh meals \nBaggage Info: 1 piece luggage 7 kilos(Per Person)");
    }

}
