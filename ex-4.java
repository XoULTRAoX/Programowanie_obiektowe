public class Main
{
	public static void main(String[] args) {
		Engine engine1 = new Engine("1.4 FSI",90);
		Vehicle vehicle1=new Vehicle("VW","Golf",5,engine1);
		System.out.println(vehicle1.vehicleInformation());
		Engine_Work e1 = new Engine_Work();
		e1.start();
	}
}
class Vehicle
{
    private String brand;
    private String model;
    private int doors;
    private Engine vehicleEngine;
    Vehicle(String bd,String md,int dr,Engine ac)
    {
        this.brand=bd;
        this.model=md;
        this.doors=dr;
        this.vehicleEngine=ac;
    }
    public String vehicleInformation()
    {
        String vehicles;
        vehicles=vehicleEngine.engInformation();
        String data=String.format("Vehicle brand: %s \rModel: %s \rDoors:  %d \r%s\n",this.brand,this.model,this.doors,vehicles);
        return data;
    } 
}
class Engine{
    private String name;
    private int horsepower;
    Engine(String nm, int hp)
    {
        this.horsepower=hp;
        this.name=nm;
    }
    public String engInformation()
    {   
        String data=String.format("Engine: %s \rHP: %d \r",this.name,this.horsepower);
        return data;
    }   
}
interface Engine_Start{
    boolean isRunning = true;
    public void start();
}
class Engine_Work implements Engine_Start {
   public void start() {
      System.out.println("Car is running: Brum-brum");
   }
}
