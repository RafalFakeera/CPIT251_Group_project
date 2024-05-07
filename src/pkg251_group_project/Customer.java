
package pkg251_group_project;

import java.util.*;

public class Customer {
    private String customerId;
    private int cancelNumber;
    private List<String> purchasedProducts;
    private LinkedList <VolunteerOpportunity> enrolledVolunteer;
    private List<String> bookedEvents;
    private List<String> creditCardDetails;
    private List<Event> favoriteEvents;
    private List<String> cart;

    public Customer(String customerId) {
        this.customerId = customerId;
        this.cancelNumber = 0;
        this.purchasedProducts = new ArrayList<>();
        this.enrolledVolunteer = new LinkedList<>();
        this.bookedEvents = new ArrayList<>();
        this.creditCardDetails = new ArrayList<>();
        this.favoriteEvents = new LinkedList<>();
        this.cart = new ArrayList<>();
    }

    // Methods
    public void cancelEnrollment(VolunteerOpportunity volunteer) {
        enrolledVolunteer.remove(volunteer);
    }

    public void cancelBooking(String event) {
        bookedEvents.remove(event);
    }

    public void returnProduct(String product) {
        purchasedProducts.remove(product);
    }

    public void addCreditCard(String creditCard) {
        creditCardDetails.add(creditCard);
    }

    public void addToFavorite(Event event) {
    favoriteEvents.add(event);
}

    public void removeFromFavorite(Event event) {
        favoriteEvents.remove(event);
    }

    public void addToCart(String product) {
        cart.add(product);
    }

    public void removeFromCart(String product) {
        cart.remove(product);
    }

    public void book(String event) {
        bookedEvents.add(event);
    }

    public void enroll(VolunteerOpportunity volunteer) {
        enrolledVolunteer.add(volunteer);
    }

    public void purchase(String product) {
        purchasedProducts.add(product);
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getCancelNumber() {
        return cancelNumber;
    }

    public void setCancelNumber(int cancelNumber) {
        this.cancelNumber = cancelNumber;
    }

    public List<String> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(List<String> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public LinkedList<VolunteerOpportunity> getEnrolledVolunteer() {
        return enrolledVolunteer;
    }

    public void setEnrolledVolunteer(LinkedList<VolunteerOpportunity> enrolledVolunteer) {
        this.enrolledVolunteer = enrolledVolunteer;
    }

    public List<String> getBookedEvents() {
        return bookedEvents;
    }

    public void setBookedEvents(List<String> bookedEvents) {
        this.bookedEvents = bookedEvents;
    }

    public List<String> getCreditCardDetails() {
        return creditCardDetails;
    }

    public void setCreditCardDetails(List<String> creditCardDetails) {
        this.creditCardDetails = creditCardDetails;
    }

    public List<Event> getFavoriteEvents() {
        return favoriteEvents;
    }

    public void setFavoriteEvents(List<Event> favoriteEvents) {
        this.favoriteEvents = favoriteEvents;
    }

    public List<String> getCart() {
        return cart;
    }

    public void setCart(List<String> cart) {
        this.cart = cart;
    }
}
