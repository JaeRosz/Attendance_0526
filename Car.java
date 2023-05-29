package attendance_05_26;

class Car extends Vehicle {
	private String tireType;
	
	
	public void drive() {
		System.out.println("Car is driving");
	}
	
	//Implement Getter and Setter for tiretype
	
	public String getTireType() {
		return tireType;
	}
	
	public void setTireType(String tireType) {
		this.tireType = tireType;
	}

}


class ToyotaVIOS extends Car {
	public ToyotaVIOS (String tireType) {
		setTireType(tireType);
	}
	
	@Override
	public void drive() {
		System.out.println("Toyota VIOS is driving");
	}
}
