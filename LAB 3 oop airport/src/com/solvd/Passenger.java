package com.solvd;

public class Passenger extends Person {
    private String seatClass;  // economy , business, first-class
    private int numberOfCheckedBags;
    private boolean mealOrdered;

    public Passenger(String fName, String lName, int years, String seatClass, int numberOfCheckedBags, boolean mealOrdered) {
        super(fName, lName, years);
        this.seatClass = seatClass;
        this.numberOfCheckedBags = numberOfCheckedBags;
        this.mealOrdered = mealOrdered;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public int getNumberOfCheckedBags() {
        return numberOfCheckedBags;
    }

    public void setNumberOfCheckedBags(int numberOfCheckedBags) {
        this.numberOfCheckedBags = numberOfCheckedBags;
    }

    public boolean isMealOrdered() {
        return mealOrdered;
    }

    public void setMealOrdered(boolean mealOrdered) {
        this.mealOrdered = mealOrdered;
    }
}

