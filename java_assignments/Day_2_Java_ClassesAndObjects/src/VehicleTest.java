import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

public class VehicleTest{
	private Vehicle vehicle;
	@Before
	public void setUp() {
		vehicle = new Vehicle();
		vehicle.setSpeed(130);
		vehicle.setDirectionInDegrees(8);
		vehicle.setName("Jahnavi");
		vehicle.setVehicleIdNumber(4567);
	}
	@Test
	public void checkingDetailsOfVehicle(){
		assertEquals("Vehicle [speed=130, directionInDegrees=8.0, name=Jahnavi, vehicleIdNumber=4567]",vehicle.toString());
	}
	@Test
	public void checkingHighestVehicleIdNumber(){
		assertEquals(1000,vehicle.displayinghighestVehicleIdNumber());
	}
	@Test
	public void changeSpeedTest(){
		assertEquals(140,vehicle.changeSpeed(10));
	}
	@Test
	public void stopTest(){
		assertEquals(0,vehicle.stop());
	}
	
	@Test
	public void changeDirectionTest(){
		assertEquals("southEast",vehicle.changeDirection(90,true));
	}
}