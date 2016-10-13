public class Truck extends Vehicle
{
    protected boolean hasSideStep;
    protected int towCapacity;

    public Truck()
    {

    }

    public Truck(int mk, String mdl, boolean fourwd, int rprice, int mpg, boolean haSS, int tc)
    {
        super(mk, mdl, fourwd, rprice, mpg);
        hasSideStep = haSS;
        towCapacity = tc;
    }

    public  void  printVehicle()
    {
        System.out.println(make+"  "+model);
        if(getFourWheelDrive()==true)
            System.out.println("4WD");
        else
            System.out.println("Not a 4WD");
        System.out.println("$"+getRetailPrice());
        System.out.println(getMilesPerGallon()+"MPG");
        if(hasSideStep==true)
            System.out.println("Has Side Step");
        else
            System.out.println("No Side Step");
        System.out.println("Tow up to "+towCapacity+" tons");

    }

}

