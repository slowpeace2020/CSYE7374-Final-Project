package edu.neu.csye7374.ticket_facade;

import edu.neu.csye7374.processing.ConcertTicketProcessing;
import edu.neu.csye7374.processing.MovieTicketProcessing;
import edu.neu.csye7374.processing.TicketProcessingTemplate;
import edu.neu.csye7374.ticket_command.BookTicketCommand;
import edu.neu.csye7374.ticket_command.Command;
import edu.neu.csye7374.ticket_decorator.EarlyAccessTicketDecorator;
import edu.neu.csye7374.ticket_decorator.TicketInsuranceDecorator;
import edu.neu.csye7374.ticket_model.Ticket;
import edu.neu.csye7374.ticket_model.TicketFactory;
import edu.neu.csye7374.ticket_state.BookedState;
import edu.neu.csye7374.ticket_state.TicketState;
import edu.neu.csye7374.ticket_strategy.DiscountPricingStrategy;
import edu.neu.csye7374.ticket_strategy.PricingStrategy;
import edu.neu.csye7374.ticket_strategy.VIPPricingStrategy;

public class TicketBookingFacade {
//    private PaymentGatewayAdapter paymentAdapter;
//    private NotificationService notificationService;

    public TicketBookingFacade() {
//        this.paymentAdapter = new PaymentGatewayAdapter(new ExternalPaymentGateway());
//        this.notificationService = new NotificationService();
    }

    public void bookTicket(String ticketType,boolean oneClick) {
        if(oneClick){
            //Handling tickets using template method pattern
            TicketProcessingTemplate ticketProcessing = new MovieTicketProcessing();
            ticketProcessing.processTicket();
            return;
        }

        // Create movie ticket using factory pattern
        Ticket ticket = TicketFactory.getTicket(ticketType);

        // Use prototype mode to copy the ticket (if needed)
        Ticket clonedTicket = (Ticket) (ticket).clone();

        // Decorate the ticket with early access
        Ticket earlyAccessTicketDecorator = new EarlyAccessTicketDecorator(ticket);
        earlyAccessTicketDecorator.printTicketInfo();
        System.out.println("add early Access Ticket price: "+earlyAccessTicketDecorator.getPrice());
        // Further decorate with Insurance package
        Ticket ticketInsuranceDecorator = new TicketInsuranceDecorator(earlyAccessTicketDecorator);
        ticketInsuranceDecorator.printTicketInfo();
        System.out.println("add Insurance ticket price: "+ticketInsuranceDecorator.getPrice());

        ticket.setPrice(ticketInsuranceDecorator.getPrice());

        //Calculate fares using strategy design mode
        PricingStrategy pricingStrategy= new VIPPricingStrategy();
        PricingStrategy pricingStrategy1= new DiscountPricingStrategy();
        ticket.setPrice(pricingStrategy.calculatePrice(ticket));
        ticket.setPrice(pricingStrategy1.calculatePrice(ticket));


        // Create a command to book the ticket
        Command bookTicket = new BookTicketCommand(ticket);
        // Execute the command
        bookTicket.execute();

        // Update the status of a ticket using status design
        // Booking the ticket
        TicketState bookedState = new BookedState();
        ticket.setState(bookedState);
        ticket.handleState();
    }
}

