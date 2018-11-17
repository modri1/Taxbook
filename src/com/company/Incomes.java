package com.company;

public class Incomes {
    private String incomeName;
    private double grossIncome;
    private double vatIncome;
    public Incomes(String incomeName, double grossIncome, double vatIncome) {
        this.incomeName = incomeName;
        this.grossIncome = grossIncome;
        this.vatIncome = vatIncome;
    }
    public String getIncomeName() {
        return incomeName;
    }
    public void setIncomeName() {
        this.incomeName = incomeName;
    }
    public double getGrossIncome() {
        return grossIncome;
    }
    public void setGrossIncome(int grossIncome) {
        this.grossIncome = grossIncome;
    }
    public double getVatIncome() {
        return vatIncome;
    }
    public void setVatIncome(int vatIncome) {
        this.vatIncome = vatIncome;
    }
}
