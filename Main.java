package attendance_05_26;

public class Main {
	public static void main (String [] args) {
		
		
		ToyotaVIOS toyotaVIOS = new ToyotaVIOS("");
		
		// Call the drive() methods on the FandangoYacht
		toyotaVIOS.drive();
		
		// Set the speed, color, price of the ToyotaVIOS instance using the setter method
		toyotaVIOS.setSpeed(170);
		toyotaVIOS.setTireType("195/50 R16 Alloy");
		toyotaVIOS.setColor("white");
		toyotaVIOS.setPrice(250000);
		
		System.out.println("The Toyota VIOS has a speed of " + toyotaVIOS.getSpeed() + "kmph, a " + toyotaVIOS.getColor() + " color, stylish " +
		toyotaVIOS.getTireType() + " tires, and a price of " + toyotaVIOS.getPrice() + ".\n");
		
		// Call the stop() method on the ToyotaVIOS
		toyotaVIOS.stop();
		
		FandangoYacht fandangoYacht = new FandangoYacht("");
	
		// Call the floatOnWater() methods on the FandangoYacht
		fandangoYacht.floatOnWater();
		
		// Set the speed, color, price of the FandangoYacht instance using the setter method
		fandangoYacht.setSpeed(13);
		fandangoYacht.setColor("silver");
		fandangoYacht.setMainSailColor("white");
		fandangoYacht.setPrice(7800000);

		//Print the information using the getter methods
		System.out.println("The FandangoYacht has a speed of " + fandangoYacht.getSpeed() + " km/h, a " + fandangoYacht.getColor() + 
		"-colored exterior, a " + fandangoYacht.getMainSailColor() + " main sail, and a price of " + fandangoYacht.getPrice() + ".\n");
		
		
		fandangoYacht.stop(); 
		
		
		U2SpyPlane u2SpyPlane = new U2SpyPlane(32);
		
		// Call the fly() methods on the U2SpyPlane
		u2SpyPlane.fly(); 
		
		// Set the speed, color, price of the U2SpyPlane instance using the setter method
		u2SpyPlane.setSpeed(40); 
		u2SpyPlane.setColor("black");
		u2SpyPlane.setPrice(35000000);
		u2SpyPlane.setWingSpan(32);
			
		//Print the information using the getter methods
		System.out.println("The U2SpyPlane has a speed of " + u2SpyPlane.getSpeed() + ", a " + u2SpyPlane.getWingSpan() 
		+ " meters, a " + u2SpyPlane.getColor() + " color, and a price of " + u2SpyPlane.getPrice() + ".\n");
		
		
		// Call the stop() method on the U2SpyPlane
		u2SpyPlane.stop(); 
	
		
	}

}
