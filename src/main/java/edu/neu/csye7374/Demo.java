package edu.neu.csye7374;

import edu.neu.csye7374.ticket_model.Ticket;
import edu.neu.csye7374.ticket_model.TicketFactory;
import edu.neu.csye7374.ticket_strategy.PricingStrategy;
import edu.neu.csye7374.ticket_strategy.VIPPricingStrategy;

public class Demo {
    public static void demo(){
        System.out.println("hello");
        Ticket t1=TicketFactory.getTicket("movie");
        PricingStrategy pricingStrategy= new VIPPricingStrategy();

        System.out.println(pricingStrategy.calculatePrice(t1));

    }
}