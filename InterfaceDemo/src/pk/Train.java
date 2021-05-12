package pk;

public class Train implements IPublicTransport,IVehicle{

	public int getNumberOfPeople() {
		return 1;
	}
	public void drive() {
		
	}
	public void turnLeft() {
		System.out.println("The train is turningLeft");
	}
	public void brake() {
		 
	}
}