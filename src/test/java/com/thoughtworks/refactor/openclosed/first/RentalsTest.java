package com.thoughtworks.refactor.openclosed.first;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RentalsTest {

    @Test
    public void testName() throws Exception {
        Rentals rentals = new Rentals();
        Movie regularMovie = new Movie("Matrix", Movie.REGULAR);
        Movie newReleaseMovie = new Movie("Shrek", Movie.NEW_RELEASE);

        rentals.add(new Rental(newReleaseMovie, 2));
        rentals.add(new Rental(regularMovie, 3));

        Assertions.assertThat(rentals.getTotalCharge()).isEqualTo(9.5);
    }
}
