package edu.neu.csye7374.ticket_state;

import edu.neu.csye7374.ticket_model.Ticket;

public interface TicketState {
    void handleState(Ticket ticket);
}

