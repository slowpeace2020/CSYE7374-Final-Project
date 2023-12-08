package edu.neu.csye7374.ticket_model;

import edu.neu.csye7374.logger.Logger;

public class TicketFactory {
    public static Ticket getTicket(String type) {
        Logger logger = Logger.getInstance();
        if ("movie".equals(type.toLowerCase())) {
            logger.log("Creating a Movie Ticket");
            return new MovieTicket("Avengers", "2023-12-08", 20.00);
        } else if ("concert".equals(type.toLowerCase())) {
            logger.log("Creating a Concert Ticket");
            return new ConcertTicket("Coldplay Live", "2023-12-15", 50.00);
        }
        return null;
    }
}

