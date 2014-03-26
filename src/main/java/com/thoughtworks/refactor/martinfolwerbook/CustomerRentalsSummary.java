package com.thoughtworks.refactor.martinfolwerbook;

public class CustomerRentalsSummary {

    public String rentalsSummary(Rentals rentals, String customerName) {
        SummaryReport summary = new SummaryReport();

        summary.add(rentalHeader(customerName));
        summary.add(rentalsDescriptions(rentals));
        summary.add(rentalFooterLine(rentals));

        return summary.asString();
    }

    private String rentalHeader(String customerName) {
        return "Rental Record for " + customerName + "\n";
    }

    private String rentalsDescriptions(Rentals rentals) {
        return rentals.getDescription();
    }

    private String rentalFooterLine(Rentals rentals) {
        return "Amount owed is " + rentals.getTotalCharge() + "\n";
    }

}
