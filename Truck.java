public class Vehicle {

    protected int make;
    protected String model;
    protected boolean fourWD;
    protected int rPrice;
    protected int milesPerGallon;

    public Vehicle()
    {

    }

    public Vehicle(int mk, String mdl, boolean fourwd, int rprice, int mpg)
    {
        make = mk;
        model = mdl;
        fourWD = fourwd;
        rPrice = rprice;
        milesPerGallon = mpg;
    }

    public int getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public boolean getFourWheelDrive()
    {
        return fourWD;
    }

    public int getRetailPrice()
    {
        return rPrice;
    }

    public int getMilesPerGallon()
    {
        return milesPerGallon;
    }
    void printVehicle()
    {
        System.out.println(getMake()+" "+getModel()+"  "+getFourWheelDrive()+"  "+getRetailPrice()+"  "+getMilesPerGallon());
    }
}

