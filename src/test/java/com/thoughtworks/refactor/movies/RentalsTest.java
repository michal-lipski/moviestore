package com.thoughtworks.refactor.movies;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RentalsTest {

    @Test
    public void testName() throws Exception {
        Rentals rentals = new Rentals();
        Movie newReleaseMovie = new Movie("Matrix", new NewReleasePrice());
        Movie childrenMovie = new Movie("Shrek", new ChildrenMoviePrice());

        rentals.add(new Rental(newReleaseMovie, 2));
        rentals.add(new Rental(childrenMovie, 3));

        Assertions.assertThat(rentals.getTotalCharge()).isEqualTo(7.5);
    }
}
