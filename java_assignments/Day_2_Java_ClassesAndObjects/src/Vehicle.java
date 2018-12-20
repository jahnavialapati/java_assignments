public class Vehicle{
	private int speed;
	private String name;
	private static int highestVehicleIdNumber=1000;
	private int vehicleIdNumber;
	private static final boolean turnLeft=false;
	private static final boolean turnRight=true;
	private String directionArray[]={"north","northEast","east","southEast","south","southWest","west","northWest"};
	private String direction="";
	private double directionInDegrees;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getDirectionInDegrees() {
		return directionInDegrees;
	}

	public void setDirectionInDegrees(double directionInDegrees) {
		this.directionInDegrees = directionInDegrees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVehicleIdNumber() {
		return vehicleIdNumber;
	}

	public void setVehicleIdNumber(int vehicleIdNumber) {
		this.vehicleIdNumber = vehicleIdNumber;
	}
	
	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", directionInDegrees="+ directionInDegrees + ", name=" + name + ", vehicleIdNumber="+ vehicleIdNumber + "]";
	}

	public Vehicle() {

	}

	public Vehicle(String name){
		this.name=name;
	}

	public int changeSpeed(int currentSpeed){
		if(currentSpeed>0 && currentSpeed<=180){
			 speed=currentSpeed+speed;
		}
		return speed;
	}

	public int displayinghighestVehicleIdNumber(){
		return highestVehicleIdNumber;
	}

	public int stop(){
		int speed=0;
		return speed;
	}

	public String changeDirection(double degrees,boolean trueorfalse){
		if(trueorfalse){
			if((directionInDegrees+degrees)<=360){
				directionInDegrees=directionInDegrees+degrees;
				if(directionInDegrees==0 || directionInDegrees==360)
					direction=directionArray[0];
				if(directionInDegrees>0 && directionInDegrees<90)
					direction=directionArray[1];
				if(directionInDegrees==90)
					direction=directionArray[2];
				if(directionInDegrees>90 && directionInDegrees<180)
					direction=directionArray[3];
				if(directionInDegrees==180)
					direction=directionArray[4];
				if(directionInDegrees>180 && directionInDegrees<270)
					direction=directionArray[5];
				if(directionInDegrees==270)
					direction=directionArray[6];
				if(directionInDegrees>270 && directionInDegrees<360)
					direction=directionArray[7];
			}
		}
		else{
			if((directionInDegrees-degrees)>=-360){
				directionInDegrees=directionInDegrees-degrees;
				if(directionInDegrees==0 || directionInDegrees==-360)
					direction=directionArray[0];
				if(directionInDegrees<-0 && directionInDegrees>-90)
					direction=directionArray[7];
				if(directionInDegrees==-90)
					direction=directionArray[6];
				if(directionInDegrees<-90 && directionInDegrees>-180)
					direction=directionArray[5];
				if(directionInDegrees==-180)
					direction=directionArray[4];
				if(directionInDegrees<-180 && directionInDegrees>-270)
					direction=directionArray[3];
				if(directionInDegrees==-270)
					direction=directionArray[2];
				if(directionInDegrees<-270 && directionInDegrees>-360)
					direction=directionArray[1];
			}
		}
		return direction;
		}
}