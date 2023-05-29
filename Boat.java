package attendance_05_26;

 class Boat extends Vehicle {
	 private String mainSailColor;
	 
	 public void floatOnWater() {
		 System.out.println("Boat is floating on water");
	 }
	 
	 public String getMainSailColor() {
		 return mainSailColor;
		 
	 }
	 
	 public void setMainSailColor(String mainSailColor) {
		 this.mainSailColor = mainSailColor;
	 }
 }
	 
class FandangoYacht extends Boat {
	public FandangoYacht(String mainSailColor) {
		setMainSailColor(mainSailColor);
	}
	
	@Override
	public void floatOnWater() {
		System.out.println();
		System.out.println("Fandago Yacht is floating on water");
	}
}

