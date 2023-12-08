package edu.neu.csye7374;

import edu.neu.csye7374.customer_observer.Customer;
import edu.neu.csye7374.customer_observer.TicketSubject;
import edu.neu.csye7374.payment_adapter.ExternalPaymentGateway;
import edu.neu.csye7374.payment_adapter.PaymentGatewayAdapter;
import edu.neu.csye7374.ticket_command.BookTicketCommand;
import edu.neu.csye7374.ticket_command.Command;
import edu.neu.csye7374.ticket_decorator.EarlyAccessTicketDecorator;
import edu.neu.csye7374.ticket_decorator.TicketDrinksDecorator;
import edu.neu.csye7374.ticket_decorator.TicketInsuranceDecorator;
import edu.neu.csye7374.ticket_facade.TicketBookingFacade;
import edu.neu.csye7374.ticket_model.Ticket;
import edu.neu.csye7374.ticket_model.TicketFactory;
import edu.neu.csye7374.ticket_state.BookedState;
import edu.neu.csye7374.ticket_state.TicketState;
import edu.neu.csye7374.ticket_strategy.PricingStrategy;
import edu.neu.csye7374.ticket_strategy.RegularPricingStrategy;

public class TicketBookingSystemDemo {
    public static void demo() {

       // Streamline the ticket booking and payment process using facade mode
        TicketBookingFacade bookingFacade = new TicketBookingFacade();
        bookingFacade.bookTicket("movie",false);

        bookingFacade.bookTicket("concert",true);
        System.out.println("Ticket booked and payment processed.");
    }
}

