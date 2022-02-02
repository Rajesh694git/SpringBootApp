package com.example.springapplication.Infrastructure;

import java.util.List;

public class InfraService {

    private InfraPojo infraPojo;

    public InfraService(InfraPojo infraPojo){
        this.infraPojo = infraPojo;
    }

    public void setupInfra(){

        infraPojo.addElectronicsPojo(new ElectronicsPojo("Monitor","DELL-32 inch",40000L));
        infraPojo.addFurniturePojo(new FurniturePojo("Chair", "Nilkamal", 3000L));

    }

    public void displayInfra(){
        infraPojo.displayInfra();
    }

}
