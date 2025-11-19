package org.example;

public class Account {
    private String firstName;
    private String lastName;
    private int accNumb;
    private double balance;
    private int password;

    public Account() {}

    public Account(String firstName, String lastName, int accNumb, double balance, int password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.accNumb = accNumb;
        this.balance = balance;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccNumb() {
        return accNumb;
    }

    public void setAccNumb(int accNumb) {
        this.accNumb = accNumb;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
