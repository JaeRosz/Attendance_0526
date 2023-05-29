package attendance_05_26;

//Plane class extends the Vehicle class
class Plane extends Vehicle { 
	
	// Private variable specifically to Plane class
	private int wingSpan; 

	/* Method specific to plane class 
	and method of getter and setter for retrieving and setting the value */
	
	public void fly() {
		System.out.println("Plane is flying");
	}
	
	public int getWingSpan() {
		return wingSpan;
	}
	
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	
}

//U2SpyPlane class extends the Plane class
class U2SpyPlane extends Plane { 
	public U2SpyPlane(int wingSpan) {
		setWingSpan(wingSpan);
	}
	
	 
	@Override
	public void fly() {
		System.out.println();
		System.out.println("U-2 Spy Plane is flying");

	}
	
}
