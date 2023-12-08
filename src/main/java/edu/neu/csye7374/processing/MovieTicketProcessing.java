package edu.neu.csye7374.processing;

public class MovieTicketProcessing extends TicketProcessingTemplate {
    @Override
    void stepOne() {
        System.out.println("Movie Ticket Step 1: Choose a movie.");
    }

    @Override
    void stepTwo() {
        System.out.println("Movie Ticket Step 2: Select seats.");
    }

    @Override
    void stepThree() {
        System.out.println("Movie Ticket Step 3: Make a payment.");
    }

    @Override
    void finalizeTicket() {
        System.out.println("Movie Ticket: Printing and sending the ticket.");
    }
}

