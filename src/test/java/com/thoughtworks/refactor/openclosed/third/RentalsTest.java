package com.thoughtworks.refactor.openclosed.third;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RentalsTest {

    @Test
    public void testName() throws Exception {
        Rentals rentals = new Rentals();
        Movie regularMovie = new Movie("Matrix", new RegularPrice());
        Movie newReleaseMovie = new Movie("Shrek", new NewReleasePrice());

        rentals.add(new Rental(newReleaseMovie, 2));
        rentals.add(new Rental(regularMovie, 3));

        Assertions.assertThat(rentals.getTotalCharge()).isEqualTo(9.5);
    }
}
