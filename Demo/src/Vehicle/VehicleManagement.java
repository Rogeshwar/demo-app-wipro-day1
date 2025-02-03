
public class VehicleManagement {
	public static void main(String[]args) {
		Vehicles car=new Car();
		Vehicles motorcycle=new Motorcycle();
		System.out.println("Car");
		vehicletestdrive(car);
		System.out.println("Motorcycle");
		vehicletestdrive(motorcycle);
	}

	private static void vehicletestdrive(Vehicles v) {
		v.startengine();
		
	}
	
}
