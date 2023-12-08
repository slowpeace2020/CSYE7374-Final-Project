package edu.neu.csye7374.ticket_state;

import edu.neu.csye7374.ticket_model.Ticket;

public class AvailableState implements TicketState {
    public void handleState(Ticket ticket) {
        System.out.println("Ticket is available for booking.");
        // Additional logic for available state
    }
}


