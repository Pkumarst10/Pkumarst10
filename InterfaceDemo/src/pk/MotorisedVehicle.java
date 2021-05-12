package pk;

public class MotorisedVehicle {
	public void checkMotor() {
		System.out.println("The motor is in good condition");
		}
	public static void main(String arg[]) {
	MotorisedVehicle mv=new MotorisedVehicle();
	mv.checkMotor();
	Car c=new Car();
	c.brake();
	Train t=new Train();
	t.turnLeft();
	}
}