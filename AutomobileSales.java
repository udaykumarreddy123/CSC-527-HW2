import java.util.ArrayList;
import java.util.Collections;

public class AutomobileSales {

    public static void main(String[] args) {

        ArrayList<Vehicle> list=new ArrayList<Vehicle>();


        Vehicle v1=new  Vehicle(1243, "Nissan Murano", true, 4000, 5);
        Vehicle v2=new  Vehicle(4344, "Nissan Murano", true, 48000, 5);
        Vehicle v3=new  Vehicle(6566, "Nissan Murano", true, 4000, 5);
        Vehicle v4=new  Vehicle(8655, "Nissan Murano", true, 5500, 5);
        Vehicle v5=new  Vehicle(3555, "Nissan Murano", true, 7000, 5);

        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);



        Scanner in=new Scanner(System.in);

        while(true){

            System.out.println("============>Select Below Operation<==================");
            System.out.println("               1.Add Vehicle");
            System.out.println("               2.Remove Vehicle");
            System.out.println("               3.Find Chepeast Vehicle");
            System.out.println("               4.Find Most Expansive");
            System.out.println("               5.print AveragePrice Of All Vehicle");

            String grade=in.next();

            switch(grade.charAt(0)) {
                case '1' :
                    System.out.print("Enter Enginenumber::");
                    int v_make=in.nextInt();
                    System.out.print("Enter Model::");
                    String v_model=in.next();
                    System.out.print("Enter price:::");
                    int v_price=in.nextInt();
                    Vehicle vv=new Vehicle(v_make,v_model,true,v_price,5);
                    list.add(vv);
                    vv.printVehicle();
                    System.out.println("**********New Vehicle Added Successfully************** ");
                    break;
                case '2' :
                    System.out.println("List Of Vehicles ");
                    Iterator<Vehicle> arit = list.iterator();
                    System.out.print("Enter Enginenumber to remove:: ");
                    int v_make_1=in.nextInt();
                    int i=0;
                    int z=0;
                    while (arit.hasNext()) {

                        Vehicle vz=(Vehicle)arit.next();
                        //vz.printVehicle();
                        if(vz.getMake()==v_make_1){
                            z=i;
                        }
                        i++;
                    }

                    list.remove(z);
                    Iterator<Vehicle> arit2 = list.iterator();
                    while (arit2.hasNext()) {

                        Vehicle vz=(Vehicle)arit2.next();
                        vz.printVehicle();

                    }
                    break;
                case '3' :
                    ArrayList arrayList = new ArrayList();
                    Iterator<Vehicle> arit3 = list.iterator();
                    while (arit3.hasNext()) {

                        Vehicle vz=(Vehicle)arit3.next();
                        vz.printVehicle();
                        arrayList.add((Integer)vz.getRetailPrice());

                    }
                    Object obj = Collections.min(arrayList);
                    System.out.println("Chepeast Vehicle : " + obj);

                    break;
                case '4' :
                    ArrayList arrayList1 = new ArrayList();
                    Iterator<Vehicle> arit4 = list.iterator();
                    while (arit4.hasNext()) {

                        Vehicle vz=(Vehicle)arit4.next();
                        vz.printVehicle();
                        final boolean add = arrayList1.add((Integer) vz.getRetailPrice());
                    }
                    Object obj1 = Collections.max(arrayList1);
                    System.out.println("Most Expansive Vehicle: " + obj1);
                    break;

                default :
                    System.out.println("Invalid grade");
            }

        }


    }


}