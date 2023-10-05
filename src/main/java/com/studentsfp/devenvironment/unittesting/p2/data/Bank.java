package com.studentsfp.devenvironment.unittesting.p2.data;

/**
 * com.studentsfp.devenvironment.unittesting.p2.data
 * Class Bank
 * 18/12/2020
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class Bank {
    private int accountCode;
    private int[] savings;
    private String location;
    public int[] getSavings() {
        return savings;
    }

    public void setSavings(int[] savings) {
        this.savings = savings;
    }


    public Bank(int savings) {
    }

    // Constructor de la clase banco
    public Bank(int accountCode, int[] savings, String location) {
        this.accountCode = accountCode;
        this.savings = savings;
        this.location = location;
    }

    // getter
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

