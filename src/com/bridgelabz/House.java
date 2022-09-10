package com.bridgelabz;

public class House {
    private String houseName;
    private String houseColour;
    private int price;

    public House(String houseName, String houseColour, int price) {
        this.houseName = houseName;
        this.houseColour = houseColour;
        this.price = price;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseColour() {
        return houseColour;
    }

    public void setHouseColour(String houseColour) {
        this.houseColour = houseColour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseName='" + houseName + '\'' +
                ", houseColour='" + houseColour + '\'' +
                ", price=" + price +
                '}';
    }
}
