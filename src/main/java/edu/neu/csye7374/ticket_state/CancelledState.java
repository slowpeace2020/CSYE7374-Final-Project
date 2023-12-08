package edu.neu.csye7374.ticket_state;

import edu.neu.csye7374.ticket_model.Ticket;

public class CancelledState implements TicketState {
    public void handleState(Ticket ticket) {
        System.out.println("Ticket booking is cancelled.");
        // Additional logic for cancelled state
    }
}


