package Assignment_4_Q1;

public class Car {
	
	private boolean engine;
	private int numberOfDoor;
	private int wheels;
	private String Make;
	private String Model;
	private String carName;
	private double speed;
	
	Car(){
		wheels=4;
		engine=true;
		carName="Nissan";
		numberOfDoor=4;
	}
	public Car(int numberOfDoor, String carName, boolean engine) {
		super();
		this.numberOfDoor = numberOfDoor;
		this.carName =carName;
		this.engine=engine;
	}
	public boolean isEngine() {
		return engine;
	}
	public void setEngine(boolean engine) {
		this.engine = engine;
	}
	public int getNumberOfDoor() {
		return numberOfDoor;
	}
	public void setNumberOfDoor(int numberOfDoor) {
		this.numberOfDoor = numberOfDoor;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	//startEngine
	public void StartEngine(boolean turn){
	        if(turn){
	            this.engine = true;
	            System.out.println("Engine Start");
	        }System.out.println("Engine Turn-Off ");

	    }
	
	// check
	public double Accelerate(double acceleration,double maxspeed){
        if(this.speed > 0 && this.speed<maxspeed)
        {
            this.speed += speed;
        }else
        {
            System.out.println("Illegal speed limit");
            if(acceleration>0)
            {
                System.out.println("you still have " + acceleration + " to reach your maximum speed");
            }
        }
        return this.speed;
    }
    public void stopEngine(){
        engineMode();
    }
    public void startEngine(){
        engineMode();
    }
    private void engineMode() {
        System.out.println("your engine mode is");
        if(this.engine == true){
            System.out.println("ON");
        }else{
            System.out.println("OFF");
        }
    }

    public void setSpeed(int speed,int maxspeed) {
        if(this.speed+speed < maxspeed){
            this.speed += speed;
            System.out.println("Your speed now is "+ this.speed);
        }else{
            System.out.println("Speed out of limits");
        }

    }

    public double getSpeed() {
        return speed;
    }

    public void breakCar(double speed){
        if(this.speed > speed){
            this.speed -= speed;
            System.out.println("Car has slow down,your speed now is "+this.speed);
        }else if(this.speed-speed <= 0){
            System.out.println("your car has stopped ");
        }
    }
    
    public static void main(String[] args) {
    	
    }
        
 }
