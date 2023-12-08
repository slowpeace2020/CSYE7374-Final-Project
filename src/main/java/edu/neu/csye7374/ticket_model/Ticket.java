package edu.neu.csye7374.ticket_model;

import edu.neu.csye7374.customer_observer.Customer;
import edu.neu.csye7374.ticket_state.AvailableState;
import edu.neu.csye7374.ticket_state.TicketState;

public abstract class Ticket implements Cloneable{
    protected String title;
    protected String eventDate;
    protected double price;
    private TicketState state;
    private Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Ticket() {
    }

    public Ticket(String title, String eventDate, double price) {
        this.title = title;
        this.eventDate = eventDate;
        this.price = price;
        this.state = new AvailableState(); // Default state
    }

    public void handleState() {
        state.handleState(this);
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return state instanceof AvailableState;
    }

    public abstract void printTicketInfo();

    @Override
    public Ticket clone() {
        try {
            return (Ticket) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }
}

