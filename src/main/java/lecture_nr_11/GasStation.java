package lecture_nr_11;

import java.util.Arrays;

public class GasStation {

    int id;
    String address;
    LukoilFuel[] fuelTypes;

    public GasStation(int id, String address, LukoilFuel[] fuelTypes) {
        this.id = id;
        this.address = address;
        this.fuelTypes = fuelTypes;
    }

    public void printAllGasStationFuelTypes(){

        System.out.println("Gas station id: " + id);
        System.out.println("Gas station address: " + address);
        System.out.println("Fuel types:");
        for(int i = 0; i != fuelTypes.length; i++){
            System.out.println(fuelTypes[i]);
        }
    }

    public boolean containsFuelType(LukoilFuel fuelType){

        return Arrays.asList(fuelTypes).contains(fuelType);
    }
}
