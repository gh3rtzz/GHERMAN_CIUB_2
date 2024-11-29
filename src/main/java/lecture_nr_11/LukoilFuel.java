package lecture_nr_11;

public enum LukoilFuel {

    PETROL_95_STANDARD(24.30f, 0f, false),
    PETROL_95_ECTO(25.40f, 0f, false),
    PETROL_100_ECTO(27.00f, 10f, false),
    DIESEL_51_STANDARD(22.30f, 0f, false),
    DIESEL_51_STANDARD_W(23.10f, 0f, false),
    DIESEL_55_ECTO(26.60f, 5f, false),
    DIESEL_55_ECTO_W(26.80f, 10f, false),
    PROPANE(18.50f, 0f, true),
    TEST(30f, false);

    float price;
    float ethanolPercent;
    boolean isVaporizedFuel;

    LukoilFuel(float price, float ethanolPercent, boolean isVaporizedFuel) {
        this.price = price;
        this.ethanolPercent = ethanolPercent;
        this.isVaporizedFuel = isVaporizedFuel;
    }

    //OVERLOADED CONSTRUCTOR
    LukoilFuel(float price, boolean isVaporizedFuel) {
        this.price = price;
        this.isVaporizedFuel = isVaporizedFuel;
    }

    public boolean isVaporizedFuel(){
        return this.isVaporizedFuel == true;
    }
}
