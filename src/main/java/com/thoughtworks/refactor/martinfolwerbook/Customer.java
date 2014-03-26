package com.thoughtworks.refactor.martinfolwerbook;

//Single Responsibility SRP
//naming
//DRY

class Customer {

    private Rentals rentals = new Rentals();
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public double getTotalRentalsCharge(){
        return rentals.getTotalCharge();
    }

    public int getFrequentRenterPoints(){
        return rentals.getFrequentRenterPoints();
    }

    public String rentalsSummary() {
        return new CustomerRentalsSummary().rentalsSummary(rentals, name);
    }

}
