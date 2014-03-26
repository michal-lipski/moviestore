package com.thoughtworks.refactor.martinfolwerbook;

public abstract class Price {
    int frequentRenterPoints;
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        frequentRenterPoints = 1;
        calculateBonus(daysRented);
        return frequentRenterPoints;
    }

    private void calculateBonus(int daysRented) {
        if ((this.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
            frequentRenterPoints ++;
        }
    }
}
