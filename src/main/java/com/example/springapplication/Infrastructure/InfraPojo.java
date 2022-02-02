package com.example.springapplication.Infrastructure;

import java.util.ArrayList;
import java.util.List;

public class InfraPojo {

    private List<FurniturePojo> furniturePojoList = new ArrayList<>();
    private List<ElectronicsPojo> electronicsPojoList = new ArrayList<>();

    public List<ElectronicsPojo> getElectronicsPojoList() {
        return electronicsPojoList;
    }

    public List<FurniturePojo> getFurniturePojoList() {
        return furniturePojoList;
    }

    public void addFurniturePojo(FurniturePojo furniturePojo){
        this.furniturePojoList.add(furniturePojo);
    }

    public void addElectronicsPojo(ElectronicsPojo electronicsPojo){
        this.electronicsPojoList.add(electronicsPojo);
    }

    public void displayInfra(){
        this.furniturePojoList.stream().forEach(element->System.out.println(element.toString()));
        this.electronicsPojoList.stream().forEach(element->System.out.println(element.toString()));
    }
}
