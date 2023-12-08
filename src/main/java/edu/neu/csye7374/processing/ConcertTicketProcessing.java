package edu.neu.csye7374.processing;

public class ConcertTicketProcessing extends TicketProcessingTemplate {
    @Override
    void stepOne() {
        System.out.println("Concert Ticket Step 1: Choose a concert.");
    }

    @Override
    void stepTwo() {
        System.out.println("Concert Ticket Step 2: Select seats.");
    }

    @Override
    void stepThree() {
        System.out.println("Concert Ticket Step 3: Make a payment.");
    }

    @Override
    void finalizeTicket() {
        System.out.println("Concert Ticket: Printing and sending the ticket.");
    }
}

