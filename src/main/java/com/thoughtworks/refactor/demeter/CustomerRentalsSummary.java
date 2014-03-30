package com.thoughtworks.refactor.demeter;

public class CustomerRentalsSummary {

    public String rentalsSummary(Rentals rentals, String customerName) {
        SummaryReport summary = new SummaryReport();

        summary.add(rentalHeader(customerName));
        summary.add(rentalsDescriptions(rentals));
        summary.add(rentalFooterLine(rentals));

        return summary.asString();
    }

    String rentalHeader(String customerName) {
        return "Rental Record for " + customerName + "\n";
    }

    String rentalsDescriptions(Rentals rentals) {
        return rentals.getDescription();
    }

    String rentalFooterLine(Rentals rentals) {
        return "Amount owed is " + rentals.getTotalCharge() + "\n";
    }

}
