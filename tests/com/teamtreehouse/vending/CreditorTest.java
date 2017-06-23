package com.teamtreehouse.vending;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by James Beem on 6/23/2017.
 */
public class CreditorTest {

    @Test
    public void addingFundsIncrementsAvailableFunds() throws Exception {
        Creditor creditor = new Creditor();

        creditor.addFunds(25);
        creditor.addFunds(25);

        assertEquals(50, creditor.getAvailableFunds());

    }



}