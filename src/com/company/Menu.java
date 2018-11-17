package com.company;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private String userChoice;
    TaxBook taxBook = new TaxBook();
    public Menu() {
        this.scanner = new Scanner(System.in);
    }
    public void mainMenu() {
        print("Kalkulator podatkowy !!!");
        do {
            print("Menu");
            print("1 - przychód");
            print("2 - koszty");
            print("3 - pokaż wszystkie rachunki");
            print("4 - oblicz należny podatek");
            print("5 - wyjscie z programu");
            print("Wybierz opcje: ");
            userChoice = scanner.nextLine();
            switch (userChoice) {
                case "1": {
                    addIncome(collectIncome());
                    break;
                }
                case "2": {
                    addExpense(collectExpence());
                    break;
                }
                case "3": {
                    showAllReceipts();
                    break;
                }
                case "4": {
                    taxBook.taxAndVatDue();
                    break;
                }
            }
        } while (!userChoice.equals("5"));
    }
    public Incomes collectIncome() {
        print("Podaj nazwę dochodu: ");
        String incomeName = scanner.nextLine();
        print("Podaj przychód brutto: ");
        String grossIncome = scanner.nextLine();
        print("Podaj kwotę VAT");
        String vatIncome = scanner.nextLine();
        Incomes income = new Incomes(incomeName, Double.parseDouble(grossIncome), Double.parseDouble(vatIncome));
        return income;
    }
    public void addIncome(Incomes income) {
        for (int i = 0; i < taxBook.getIncomes().length; i++) {
            if (taxBook.getIncomes()[i] == null) {
                taxBook.getIncomes()[i] = income;
                break;
            }
        }
    }
    public Expenses collectExpence() {
        print("Podaj nazwę wydatku: ");
        String expenseName = scanner.nextLine();
        print("Pdaj koszt brutto: ");
        String expenseGross = scanner.nextLine();
        print("Podaj kwote VAT");
        String expenseVat = scanner.nextLine();
        Expenses expense = new Expenses(expenseName, Double.parseDouble(expenseGross), Double.parseDouble(expenseVat));
        return expense;
    }
    public void addExpense(Expenses expense) {
        for (int i = 0; i < taxBook.getExpenses().length; i++) {
            if (taxBook.getExpenses()[i] == null) {
                taxBook.getExpenses()[i] = expense;
                break;
            }
        }
    }
    public void showAllReceipts() {
        for (Incomes i : taxBook.getIncomes()) {
            if (i == null) {
                continue;
            } else {
                print("Dochód: " + i.getIncomeName() + ", kwota brutto: " + i.getGrossIncome()+ ", VAT: " + i.getVatIncome());
            }
        }
        for (Expenses i : taxBook.getExpenses()) {
            if (i == null) {
                continue;
            } else {
                print("Koszt: " + i.getNameExpense() + ", kwota brutto: " + i.getGrossExpense() + ", VAT: " + i.getVatExpense());
            }
        }
    }
    public void print(String string) {
        System.out.println(string);
    }
}
