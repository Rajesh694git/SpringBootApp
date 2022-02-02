package com.example.springapplication.Infrastructure;

public class FurniturePojo {

    private String type;
    private String companyName;
    private Long rate;

    public FurniturePojo(String type, String company, Long rate){
        this.type = type;
        this.companyName = company;
        this.rate = rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public Long getRate() {
        return rate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getType() {
        return type;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return type+" : "+ companyName+" : "+rate;
    }

}
