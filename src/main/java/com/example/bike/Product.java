package com.example.bike;

public class Product {
    // co zawiera produkt

    //dla każdej zmiennej jakiego jest typu
    private String type; //typ roweru
    private String mark; //marka roweru


    public Product(String type, String mark) {
        this.type = type; //this.type to type u góry
        //type to nazwa z argumentu konstruktora
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
