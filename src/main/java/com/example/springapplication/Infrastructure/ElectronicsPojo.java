package com.example.springapplication.Infrastructure;

public class ElectronicsPojo {

    private String itemType;
    private String itemName;
    private Long rate;

    public ElectronicsPojo(String type, String name, Long rate) {
        this.itemType = type;
        this.itemName = name;
        this.rate = rate;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String toString(){
        return itemType+" : "+ itemName+" : "+rate;
    }

}
