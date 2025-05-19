package com.xworkz.ticketbooking.runner;
import com.xworkz.ticketbooking.things.TicketBookingDetails;
public class TicketBookingRunner {
    public static void main(String[] args) {
        TicketBookingDetails bookingDetails = new TicketBookingDetails();
        bookingDetails.name="racchu";
        bookingDetails.contactNumber = 9886632664l;
        bookingDetails.email = " racchu@gmail.com";
        bookingDetails.ticketPrice = 120;
        bookingDetails.numberOfSeats= 49;
        System.out.println("name is:"+bookingDetails.name);
        System.out.println("contactNumber:"+bookingDetails.contactNumber);
        System.out.println("email:"+bookingDetails.email);
        System.out.println("ticketPrice:"+bookingDetails.ticketPrice);
        System.out.println("numberOfSeats:"+bookingDetails.numberOfSeats);
    }
}
