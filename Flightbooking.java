
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 Members: 
leader: Ghada Alotibi
 Student ID:
-Wehad AlWuthaynani
Student ID:
-Mayar
Student ID: 445003256
-Layan saleh
Student ID: 44511056
-Wajn
Student ID:
-Leena
Student ID:44510682
 */
public class Flightbooking {
 // Name of Infinty company  
    public static String Name;    
    //    Address of our company  
    public static String Address;
//    phone of our company  
    public static int phone;
//   AllFlifht is ArrayList of Flight
    public static ArrayList<Flight> AllFlifht;
 
    public static void main(String[] args) {
        AllFlifht = new ArrayList<Flight>();
        Flight f = new Flight(101, "Jeddah ", "1:20 am", "5/1/2025", "Cairo", "3:10 am", "5/1/2025");
        f.addTicket(new EconomyTicket(100,"Economic", 450));
        f.addTicket(new BusinessTicket(110,"Business", 450, 600));
        f.addTicket(new FirstClassTicket(101,"FirstClass", 450, 900));
        Flight f2 = new Flight(102, "Riyadh ", "1:30 am", "7/1/2025", "Dubai", "3:50 am", "7/1/2025");
        f2.addTicket(new EconomyTicket(200,"Economic", 300));
        f2.addTicket(new BusinessTicket(220,"Business", 300, 600));
        f2.addTicket(new FirstClassTicket(202,"FirstClass", 300, 900));
        Flight f3 = new Flight(103, "Washinghton DC ", "15:00 pm", "7/1/2025", "New York", "19:40 pm", "7/1/2025");
        f3.addTicket(new EconomyTicket(300,"Economic", 320));
        f3.addTicket(new BusinessTicket(330,"Business", 320, 600));
        f3.addTicket(new FirstClassTicket(303,"FirstClass", 320, 900));
        Flight f4 = new Flight(104, "Moscow ", "00:50 am", "8/1/2025", "London", "7:20 am", "9/1/2025");
        f4.addTicket(new EconomyTicket(400,"Economic", 520));
        f4.addTicket(new BusinessTicket(440,"Business", 520, 600));
        f4.addTicket(new FirstClassTicket(404,"FirstClass", 520, 900));
        Flight f5 = new Flight(105, "Paris ", "4:00 am", "8/1/2025", "Geneva", "10:40 am", "8/1/2025");
        f5.addTicket(new EconomyTicket(500,"Economic", 310));
        f5.addTicket(new BusinessTicket(550,"Business", 310, 600));
        f5.addTicket(new FirstClassTicket(505,"FirstClass", 310, 900));
        Flight f6 = new Flight(106, "Rome ", "4:10 am", "11/1/2025", "Barcelona", "6:05 am", "11/1/2025");
        f6.addTicket(new EconomyTicket(600,"Economic", 430));
        f6.addTicket(new BusinessTicket(660,"Business", 430, 600));
        f6.addTicket(new FirstClassTicket(606,"FirstClass", 430, 900));
        Flight f7 = new Flight(107, "Jeddah ", "16:00 pm", "11/1/2025", "Istanbul", "19:55 am", "11/1/2025");
        f7.addTicket(new EconomyTicket(700,"Economic", 350));
        f7.addTicket(new BusinessTicket(770,"Business", 350, 600));
        f7.addTicket(new FirstClassTicket(707,"FirstClass", 350, 900));
        Flight f8 = new Flight(108, "Dammam ", "4:10 am", "14/1/2025", "Abu Dhabi", "6:55 am", "14/1/2025");
        f8.addTicket(new BusinessTicket(800,"Business", 350, 600));
        f8.addTicket(new FirstClassTicket(880,"FirstClass", 350, 900));
        f8.addTicket(new FirstClassTicket(808,"FirstClass", 530, 900));
        AllFlifht.add(f);
        AllFlifht.add(f2);
        AllFlifht.add(f3);
        AllFlifht.add(f4);
        AllFlifht.add(f5);
        AllFlifht.add(f6);
        AllFlifht.add(f7);
        AllFlifht.add(f8);
        Name = "Flightbooking";
        Address = "Makkah";
        phone = 57124567;
        System.out.println("Dear customer Welcome to on Airplane tickets reservation system\n ***** ");
        // login
        Scanner in = new Scanner(System.in);
        //INSTRUCTOIN for the user to input password 
        System.out.println(
                "1. A password must have at least eight characters.\n"
                + "2. A password consists of only letters and digits.\n"
                + "3. A password must contain at least two digits \n"
                + "Input a password (You are agreeing to the above Terms and Conditions): ");
        String pass = in.nextLine();
        System.out.println("Enter user");
        String uu = in.nextLine();
        //object from User class
        User u = new User();
        //whlie loop if user inpout incrrect password  
        while (u.Check(pass) != true) {
            System.out.println("Not a valid password: " + pass);
            System.out.println("try again");
            pass = in.nextLine();
        }//end loop
        //if Password correct
        System.out.println("Password is valid: " + pass);
        System.out.println("*******************");
        //display information User 
        System.out.println("Your username: " + uu + "\n" + "Your password: " + pass);
        System.out.println("Welcome to " + Name);
        System.out.println("*******************");
        //object from Passenger class
        Passenger p = new Passenger();
        Passenger p2 = new Passenger();
        int err = 0;
        //object From any subclass in the ticket to access the attribute to display the SeatNumber 
        Ticket passticketseat = new EconomyTicket();
        Ticket passticketseat1 = new FirstClassTicket();
        Ticket passticketseat2 = new BusinessTicket();
        boolean flag2 = false ;   

        int choice = 0;
        while (choice != 10) {
            System.out.println("These options will be repeated for you several times to book more than one ticket\n (so choose a number each time)");
            //exception 
            try{
           
            System.out.println("1- Reserve flight\n2- Calculate total price\n3- Print ticket \n4- Payment\n5- Exit");
            System.out.println("________");
            //to choice from list
            choice = in.nextInt();}
                     catch ( InputMismatchException e) {
                        System.out.println("InputMismatchException PLEASE type just a number not a string");
                        in.nextLine();
                        err++;
                    }
            switch (choice) {
                case 1:
                    System.out.println("________");
                    System.out.println("We'll show you available flights");
                    for (int i = 0; i < AllFlifht.size(); i++) {
                        System.out.println((i + 1) + "= " + AllFlifht.get(i) + " ");
                    }

                    System.out.println("Please enter your choice\n1-Flight 1 , 2-Flight 2 , 3-Flights 3 , 4- Flight 4 , 5-Flight 5 , 6-Flights 6,7-Flights 7 ,8-Flights");
                    try {
                        int fl = in.nextInt();
                        AllFlifht.get(fl - 1).displayticket();

                        System.out.println("Please enter your Ticket\n1-Economy , 2-Business , 3-First");
                       //to choice from list
                        int ti = in.nextInt();
                        Ticket passticket = AllFlifht.get(fl - 1).getTicket(ti - 1);
                        
                        int i, j, seatNum, c = 0;
                        char seatLetter = 'A';
                        int choice3 = 0;
                        String seatEnter;
                        boolean flag = true; // loops of running the program
                        System.out.println(" Assign Seats \n Note: It will not be booked into our system because it will come at the time of boarding\n (we only show you the seats you can see at that time so you know about them)");
                        System.out.println("Select your choice: ");
                        
                        //Set the value.
                        for (i = 0; i < passticketseat.SeatNumber.length; i++) {
                            for (j = 0; j < passticketseat.SeatNumber[i].length; j++) {
                                passticketseat.SeatNumber[i][j] = seatLetter++;
                            }
                            seatLetter = 'A'; // to reset the value to A for the new loop
                        }
                        //To display the list of seats
                        for (i = 0; i < passticketseat.SeatNumber.length; i++) {
                            System.out.print((i + 1) + " ");
                            for (j = 0; j < passticketseat.SeatNumber[i].length; j++) {
                                System.out.print(passticketseat.SeatNumber[i][j] + " ");
                            }
                            System.out.println();
                        }
                        //condition
                        
                                System.out.print("Please type the chosen seat(start with row and column, e.g:2B): ");
                                seatEnter = (in.next()).toUpperCase(); //covert to Upper case
                                seatNum = Integer.parseInt(seatEnter.charAt(0) + ""); //converts a String to an int
                                if (seatNum != 0) {
                                    seatLetter = seatEnter.charAt(1);
                                }
                                i++;
                                //if user enters wrong input, error message will appear.
                                if (seatLetter != 'A') {
                                    if (seatLetter != 'B') {
                                        if (seatLetter != 'C') {
                                            if (seatLetter != 'D') {
                                                if (seatLetter != 'E') {
                                                    if (seatLetter !='F') {
                                                        System.out.println("Invalid! Please enter the correct seat: ");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                             //continue to loop until the condition true
                            while (seatNum < 0 || seatNum > 10 || seatLetter < 'A' || seatLetter > 'F');
                            if (seatNum == 0) {
                                flag = false;
                            } else {
                                if (passticketseat.SeatNumber[seatNum - 1][seatLetter - 65] == 'X') {
                                    System.out.println("\n       ***Seat have been taken***.\n           Please choose another seat:\n");
                                } else {
                                    passticketseat.SeatNumber[seatNum - 1][seatLetter - 65] = 'X';
                                }
                            }
                     // To display updated lists of seats
                            for (i = 0; i < passticketseat.SeatNumber.length; i++) {
                                System.out.print((i + 1) + " ");
                                for (j = 0; j < passticketseat.SeatNumber[i].length; j++) {
                                    System.out.print(passticketseat.SeatNumber[i][j] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        //to ask the user about their info just once
                        if (flag2 == false ) {
                        System.out.println("Dear passenger,\n we will ask you once to enter your personal information, and if you wanted to reserve multiple flights \n it will be automatically linked to this information you about to enter"
                                +" \n enter your First name ");
                        String Firstname = in.next();
                        if (Passenger.namegenString(Firstname) == true) {
                            p.setFirstName(Firstname);
                        } else {
                            System.out.println("incorrect");
                            p2.Num++;
                        }
                        System.out.println("________________");
                        System.out.println("Enter your Last name ");
                        String Lastname = in.next();
                        if (Passenger.namegenString(Lastname) == true) {
                            p.setLastName(Lastname);
                        } else {
                            System.out.println("incorrect");
                            p2.Num++;
                        }
                        System.out.println("________________");

                        System.out.println("Enter your gender ( please write Female or  male) ");
                        String Gender = in.next().toUpperCase();
                        //conditin if user input other Female or  male and Contains String and is not empty or numbers
                        if (Passenger.namegenString(Gender) == true && (Gender.equals("FEMALE") || Gender.equals("MALE"))) {
                            p.setGender(Gender);
                        } else {
                            System.out.println("incorrect");
                            p2.Num++;
                        }
                        System.out.println("________________");
                        System.out.println("Enter your Age ( please write it as an integar and it Must be 18 or over) ");
                       int Age = in.nextInt();
                       //condition for Age 
                        if (Age >= 18) {
                            p.setAge(Age);
                        } else {
                            System.out.println("incorrect");
                            p2.Num++;
                        }
                        System.out.println("________________");
                     System.out.println("Enter your Passport Number ( Ex: SZ557907  ,It must include 8 digits)");
                    String Passportnumber = in.next();
                    //conditin for Passportnumber 
                        if ( (Passportnumber.length()!= 8)&&(Passenger.namegenString(Name)==true) ) {
                            System.out.println("incorrect");
                            p2.Num++;
                        } else {
                            p.setPassportNum(Passportnumber);
                        }
                      
                        flag2 = true ;
                        
                        }

                    p.reservTicket(passticket.clone(p.NumID, AllFlifht.get(fl - 1)));
                     System.out.println("________________\n");
                        
                        System.out.println("You Booked This Flight Successfully !!");
                        
                        System.out.println("________________\n");
                        
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("IndexOutOfBoundsException PLEASE REWRITE");
                        in.nextLine();
                        err++;
                    } catch (NumberFormatException e) {
                        System.out.println("NumberFormatException PLEASE type just a String not a number");
                        in.nextLine();
                        err++;
                    } catch (InputMismatchException e) {
                        System.out.println("InputMismatchException PLEASE type just a number not a string");
                        in.nextLine();
                        err++;
                    }
                    
                    
                    break;
                case 2:
                    System.out.println("________________");
                    //total price 
                    System.out.println("Total Price :" + p.GetSeatPrice());
                    break;
                case 3:
                    //if somthing wrrong do not print ticket else print ticket
                    if (p2.num() != 0 || err != 0) {
                        System.out.println("Sorry, the ticket cannot be copied You entered " + (p2.num() + err) + "input incorrect");
                    } else {
                        System.out.println(p);
                        System.out.println("Booked by " + Name + "\n" + "Telephone: " + phone + "\n" + "Address: " + Address);
                    }
                    break;
                case 4:
                    //for payment
                    String Creditcards = "";
                    String ccv = "";
                    int Month = 0;
                    String Year = "";
                    //while loop to information Credit cards 
                    while ((Creditcards.length() != 16) || (ccv.length() != 3) || (Month < 1 || Month > 12) || (Year.length() != 2) || (Passenger.namegenString(Creditcards) == true)) {
                        System.out.println("Enter your payment information to be able to withdraw the payment\n enter number of \n Credit cards(16 number)");
                        Creditcards = Creditcards = in.next();
                      
                        System.out.print("CCV(3 number):");
                        ccv = in.next();
                        System.out.println("month between 1 - 12 , year just last 2 number ex;if Year 2030 enter 30 )");
                        System.out.println("Month:");
                        Month = in.nextInt();
                        System.out.print("Year:");
                        Year = in.next();
                        System.out.println("Expiration Date:" + Month + "/" + Year);
                    }
                    if (Creditcards.length() == 16 && (ccv.length() == 3) && (Month >= 1 || Month <= 12) && Year.length() == 2 && Passenger.namegenString(Creditcards) == false) {
                        System.out.println("Accepted, we wish you a pleasant journey in" + Name);
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using our system, best wishes.");
                    //to end program 
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid");
                    
                    
            }
        }
    }
}
