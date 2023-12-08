package edu.neu.csye7374.ticket_command;

import edu.neu.csye7374.ticket_model.Ticket;
import edu.neu.csye7374.ticket_state.BookedState;

public class BookTicketCommand implements Command {
    private Ticket ticket;

    public BookTicketCommand(Ticket ticket) {
        this.ticket = ticket;
    }

    public void execute() {
        // Check if the ticket is available for booking
        if (ticket.isAvailable()) {
            // Process the booking
            processBooking(ticket);
            // Update the ticket's state to booked
            ticket.setState(new BookedState());
            // Optionally, send a booking confirmation
            sendBookingConfirmation(ticket);
            System.out.println("Ticket booked successfully: " + ticket.getTitle());
        } else {
            System.out.println("Ticket booking failed, ticket is not available.");
        }
    }

    private void processBooking(Ticket ticket) {
        // Implement the booking logic, e.g., deducting the amount from the user's account
        System.out.println("Processing payment for the ticket.");
    }

    private void sendBookingConfirmation(Ticket ticket) {
        // Implement the logic to send booking confirmation, e.g., via email or SMS
        System.out.println("Sending booking confirmation for " + ticket.getTitle());
    }
}

