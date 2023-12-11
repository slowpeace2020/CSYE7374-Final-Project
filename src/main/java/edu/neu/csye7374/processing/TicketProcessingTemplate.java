package edu.neu.csye7374.processing;

public abstract class TicketProcessingTemplate {
    // Template Method, defines the steps for handling ticketing
    public final void processTicket() {
        stepOne();
        stepTwo();
        stepThree();
        finalizeTicket();
    }

    abstract void stepOne();
    abstract void stepTwo();
    abstract void stepThree();

    // The final step can be generic or overridden by subclasses
    void finalizeTicket() {
        System.out.println("Finalizing ticket process.");
    }
}

