package edu.neu.csye7374.ticket_state;

import edu.neu.csye7374.ticket_model.Ticket;

public class BookedState implements TicketState {
    public void handleState(Ticket ticket) {
        System.out.println("Ticket has been booked.");
        // Additional logic for booked state
    }
}


