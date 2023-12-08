package edu.neu.csye7374;

import edu.neu.csye7374.ticket_command.BookTicketCommand;
import edu.neu.csye7374.ticket_command.Command;
import edu.neu.csye7374.ticket_decorator.EarlyAccessTicketDecorator;
import edu.neu.csye7374.ticket_decorator.TicketDrinksDecorator;
import edu.neu.csye7374.ticket_decorator.TicketInsuranceDecorator;
import edu.neu.csye7374.ticket_model.Ticket;
import edu.neu.csye7374.ticket_model.TicketFactory;
import edu.neu.csye7374.ticket_state.BookedState;
import edu.neu.csye7374.ticket_state.TicketState;

public class TicketBookingSystemDemo {
    public static void main(String[] args) {
        // 使用工厂模式创建电影票
        Ticket ticket = TicketFactory.getTicket("movie");

        // 使用原型模式复制票（如果需要）
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

        // 使用命令模式处理票务预订
        // Create a command to book the ticket
        Command bookTicket = new BookTicketCommand(ticket);
        // Execute the command
        bookTicket.execute();
        // 使用状态模式更新票的状态
        // Booking the ticket
        TicketState bookedState = new BookedState();
        ticket.setState(bookedState);
        ticket.handleState();

//        // 使用策略模式计算票价
//        PricingStrategy pricingStrategy = new RegularPricingStrategy();
//        double price = pricingStrategy.calculatePrice();
//
//        // 使用观察者模式通知用户（模拟）
//        Customer customer = new Customer();
//        TicketSubject ticketSubject = new TicketSubject();
//        ticketSubject.attach(customer);
//        ticketSubject.notifyObservers();
//
//        // 使用模板方法模式处理票务
//        TicketProcessingTemplate ticketProcessing = new ConcertTicketProcessing();
//        ticketProcessing.processTicket();
//
//        // 使用门面模式简化票务预订和支付流程
//        TicketBookingFacade bookingFacade = new TicketBookingFacade();
//        PaymentDetails paymentDetails = new PaymentDetails();
//        bookingFacade.bookTicket("movie", paymentDetails);
//
//        // 使用适配器模式处理支付
//        PaymentGatewayAdapter paymentAdapter = new PaymentGatewayAdapter(new ExternalPaymentGateway());
//        paymentAdapter.processPayment(paymentDetails);

        System.out.println("Ticket booked and payment processed.");
    }
}

