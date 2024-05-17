package com.pluralsight;

public abstract class SalesContract extends Contract {
    protected double salesTax = .05;
    protected int recordFee = 100;
    protected int processFee;
    protected boolean financed = false;
    protected double numberOfMonths;



    public SalesContract(String date, String customerName, String customerEmail, String vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);
    }

    public double getSalesTax() {
        return salesTax;
    }

    public int getRecordFee() {
        return recordFee;
    }

    public int getProcessFee() {
        if (price < 10000) {
            return 295;
        } else {
            return 495;
        }
    }

    public boolean isFinanced() {
        return financed;
    }

    public void setFinanced(boolean financed) {
        this.financed = financed;
    }

    public double getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(double numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        if (numberOfMonths <= 24)  {



// Should I make a new int for the price of the vehicle??
        } else if (price >= 10000) {


        } else return 0;
    }

}
