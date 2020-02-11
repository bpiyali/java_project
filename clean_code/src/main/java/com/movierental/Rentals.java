package com.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {

    double totalAmount() {
        /*double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.amount();
        }
        return totalAmount;*/
        return stream().mapToDouble(rental -> rental.amount()).sum();
    }

    int totalFrequentRenterPoints() {
        /*int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.frequentRenterPoints();
        }
        return totalFrequentRenterPoints;*/
        return stream().mapToInt(rental -> rental.frequentRenterPoints()).sum();
    }
}
