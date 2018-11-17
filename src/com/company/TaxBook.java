package com.company;

public class TaxBook {
    private Expenses[] expenses;
    private Incomes[] incomes;
    public TaxBook() {
        this.expenses = new Expenses[100];
        this.incomes = new Incomes[100];
    }
    public Expenses[] getExpenses() {
        return expenses;
    }
    public Incomes[] getIncomes() {
        return incomes;
    }
    public void print(String string) {
        System.out.println(string);
    }
    public void taxAndVatDue() {
        double sumIncomesGross = 0;
        double sumIncomesVat = 0;
        double sumExpensesGross = 0;
        double sumExpensesVat = 0;
        double calculatedTaxDue = 0;
        double calculatedVatDue = 0;
        for (int i = 0; i < incomes.length; i++) {
            if(getIncomes()[i] == null){
                continue;
            }
            sumIncomesGross += getIncomes()[i].getGrossIncome();
            sumIncomesVat += getIncomes()[i].getVatIncome();
        }
        for (int i = 0; i < expenses.length; i++) {
            if(getExpenses()[i] == null){
                continue;
            }
            sumExpensesGross += getExpenses()[i].getGrossExpense();
            sumExpensesVat += getExpenses()[i].getVatExpense();
        }
        calculatedTaxDue = ((sumIncomesGross - sumIncomesVat) - (sumExpensesGross - sumExpensesVat)) * 0.18;
        calculatedVatDue = sumIncomesVat - sumExpensesVat;
        print("Podatek należny to: " + calculatedTaxDue + ", VAT: " + calculatedVatDue);
    }
}


