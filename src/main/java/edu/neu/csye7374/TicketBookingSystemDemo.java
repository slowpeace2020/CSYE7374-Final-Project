package edu.neu.csye7374;

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
    public static void main(String[] args) {


//        // 使用观察者模式通知用户（模拟）
//        Customer customer = new Customer();
//        TicketSubject ticketSubject = new TicketSubject();
//        ticketSubject.attach(customer);
//        ticketSubject.notifyObservers();
//

//
//        // Streamline the ticket booking and payment process using facade mode
        TicketBookingFacade bookingFacade = new TicketBookingFacade();
        bookingFacade.bookTicket("movie",false);

//        // 使用适配器模式处理支付
//        PaymentGatewayAdapter paymentAdapter = new PaymentGatewayAdapter(new ExternalPaymentGateway());
//        paymentAdapter.processPayment(paymentDetails);

        System.out.println("Ticket booked and payment processed.");
    }
}

