public class Car extends Vehicle
{

    protected boolean isConvertible;

    public Car()
    {

    }
    public Car(int mk, String mdl, boolean fourwd, int rprice, int mpg, boolean isConvertible)
    {
        super( mk, mdl, fourwd, rprice, mpg);
        this.isConvertible = isConvertible;
    }

    public void printVehicle()
    {
        System.out.println(make+"  "+model);
        if(getFourWheelDrive()==true)
            System.out.println("4WD");
        else
            System.out.println("Not a 4WD");
        System.out.println("$"+getRetailPrice());
        System.out.println(getMilesPerGallon()+"MPG");


    }
}
