package com.vikram.springAssign2;

public class Icici {
    private String name;
    private int interestRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Icici [name=" + name + ", interestRate=" + interestRate + "]";
    }
}

