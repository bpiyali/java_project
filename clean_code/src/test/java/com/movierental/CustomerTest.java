package com.movierental;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;

    @Before
    public void setup() {
        customer = new Customer("Piyali B");

        customer.addRental(new Rental(new Movie("MI-1", Movie.REGULAR), 3));
        customer.addRental(new Rental(new Movie("Baby's Day Out", Movie.CHILDRENS), 2));
        customer.addRental(new Rental(new Movie("Avengers", Movie.NEW_RELEASE), 4));

    }

    @Test
    public void shouldGenerateTextStatement() {
        assertEquals("Rental Record for Piyali B\n" +
                "\tMI-1\t3.5\n" +
                "\tBaby's Day Out\t1.5\n" +
                "\tAvengers\t12.0\n" +
                "Amount owed is 17.0\n" +
                "You earned 4 frequent renter points", customer.statement());
    }

    @Test
    public void shouldGenerateHtmlStatement() {
        assertEquals("<h1>Rental Record for <b>Piyali B</b></h1><br/>" +
                "MI-1 3.5<br/>" +
                "Baby's Day Out 1.5<br/>" +
                "Avengers 12.0<br/>" +
                "Amount owed is <b>17.0</b><br/>" +
                "You earned <b>4</b> frequent renter points", customer.htmlStatement());
    }

    /*@Test
    public void singleLoopVsMultiple() {
        for (int j = 0; j < 100; j++) {

            //single loop
            int x = 0, y = 0, z = 0;
            long l = System.currentTimeMillis();
            for (int i = 0; i < 100000000; i++) {
                x++;
                y++;
                z++;
            }
            l = System.currentTimeMillis() - l;


            //multiple loops doing the same thing
            int a = 0, b = 0, c = 0;
            long m = System.currentTimeMillis();
            for (int i = 0; i < 100000000; i++) {
                a++;
            }
            for (int i = 0; i < 100000000; i++) {
                b++;
            }
            for (int i = 0; i < 100000000; i++) {
                c++;
            }
            m = System.currentTimeMillis() - m;
            System.out.println(String.format("%d,%d", l, m));

        }
    }
*/
}