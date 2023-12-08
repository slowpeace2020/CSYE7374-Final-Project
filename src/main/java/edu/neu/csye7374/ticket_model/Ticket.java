package edu.neu.csye7374.ticket_model;

public abstract class Ticket implements Cloneable{
    protected String title;
    protected String eventDate;
    protected double price;

    public Ticket() {
    }

    public Ticket(String title, String eventDate, double price) {
        this.title = title;
        this.eventDate = eventDate;
        this.price = price;
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

