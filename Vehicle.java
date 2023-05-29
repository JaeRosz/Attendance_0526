package attendance_05_26;

class Vehicle {
	
	private int speed;
	private String color;
	private int price;
	
	public void stop() {
		System.out.println("Vehicle stopped");
	}
	
	//Implement Getter Setter of speed, color, and price
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

}
