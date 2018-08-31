package com.example.bike;

public class Terms {

    private String dateOfRental;
    private String dateOfReturn;

    public Terms(String dateOfRental, String dateOfReturn) {
        this.dateOfRental = dateOfRental;
        this.dateOfReturn = dateOfReturn;
    }


    public String getDateOfRental() {
        return dateOfRental;
    }

    public void setDateOfRental(String dateOfRental) {
        this.dateOfRental = dateOfRental;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
}
