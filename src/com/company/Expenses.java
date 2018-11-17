package com.company;

public class Expenses {
    private String nameExpense;
    private double grossExpense;
    private double vatExpense;
    public Expenses(String nameExpense, double grossExpense, double vatExpense) {
        this.nameExpense = nameExpense;
        this.grossExpense = grossExpense;
        this.vatExpense = vatExpense;
    }
    public String getNameExpense() {
        return nameExpense;
    }
    public double getGrossExpense() {
        return grossExpense;
    }
    public double getVatExpense() {
        return vatExpense;
    }
    public void setNameExpense() {
        this.nameExpense = nameExpense;
    }
    public void setGrossExpense() {
        this.grossExpense = grossExpense;
    }
    public void setVatExpense() {
        this.vatExpense = vatExpense;
    }
}