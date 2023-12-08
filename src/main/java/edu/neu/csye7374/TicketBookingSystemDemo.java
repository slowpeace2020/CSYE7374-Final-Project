package edu.neu.csye7374;

import edu.neu.csye7374.ticket_model.Ticket;
import edu.neu.csye7374.ticket_model.TicketFactory;
import edu.neu.csye7374.ticket_state.BookedState;

public class TicketBookingSystemDemo {
    public static void main(String[] args) {
        // 使用工厂模式创建电影票
        Ticket ticket = TicketFactory.getTicket("movie");

        // 使用原型模式复制票（如果需要）
        Ticket clonedTicket = (Ticket) (ticket).clone();

        // Booking the ticket
        ticket.setState(new BookedState());
        ticket.handleState();

        // 使用装饰器模式增强票务功能（例如，添加额外服务）
//        TicketDecorator decoratedTicket = new PremiumTicketDecorator(ticket);
//
//        // 使用命令模式处理票务预订
//        Command bookTicketCommand = new BookTicketCommand(ticket);
//        bookTicketCommand.execute();
//
//        // 使用状态模式更新票的状态
//        TicketState bookedState = new BookedState();
//        bookedState.handleState();
//
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

