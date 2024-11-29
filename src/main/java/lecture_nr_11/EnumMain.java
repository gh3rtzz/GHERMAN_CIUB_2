package lecture_nr_11;

import java.util.Arrays;
import java.util.Collections;

public class EnumMain {

    public static void main(String[] args) {

        LukoilFuel fuel1 = LukoilFuel.PETROL_95_ECTO;

        System.out.println(fuel1);

        if(fuel1 == LukoilFuel.PETROL_95_ECTO){
            System.out.println("true");
        }

        GasStation gs1 = new GasStation(1, "str. Puskin 45", new LukoilFuel[]{
                LukoilFuel.PETROL_95_STANDARD, LukoilFuel.PETROL_95_ECTO, LukoilFuel.DIESEL_51_STANDARD
        });
        GasStation gs2 = new GasStation(2, "str. Dacia 60", new LukoilFuel[]{
                LukoilFuel.PETROL_95_STANDARD, LukoilFuel.PETROL_100_ECTO, LukoilFuel.DIESEL_51_STANDARD,
                LukoilFuel.DIESEL_51_STANDARD_W, LukoilFuel.DIESEL_55_ECTO
        });

        gs1.printAllGasStationFuelTypes();

        GasStation[] gasStations = new GasStation[]{
                gs1, gs2
        };

        //Print all gas stations that have 100 ECTO fuel

        for(int i = 0; i != gasStations.length; i++){
            for(int fuels = 0; fuels != gasStations[i].fuelTypes.length; fuels++){
                if(gasStations[i].fuelTypes[fuels] == LukoilFuel.PETROL_100_ECTO){
                    System.out.println(gasStations[i].id);
                }
            }
        }

        System.out.println("---------------");
        //Print all gas stations that have 51 standard diesel
        for(int i = 0; i != gasStations.length; i++){
            if(Arrays.asList(gasStations[i].fuelTypes).contains(LukoilFuel.DIESEL_51_STANDARD)){
                System.out.println(gasStations[i].address);
            }
        }

        System.out.println("----------------");
        for(int i = 0; i != gasStations.length; i++){
            if(gasStations[i].containsFuelType(LukoilFuel.PETROL_95_STANDARD)){
                System.out.println(gasStations[i].address);
            }
        }

        LukoilFuel[] allFuels = LukoilFuel.values();

        for(int i = 0; i != allFuels.length; i++){
            System.out.println("FUEL: " + allFuels[i] + "\tPRICE: " + allFuels[i].price);
        }

        LukoilFuel.PETROL_100_ECTO.isVaporizedFuel();
    }
}
