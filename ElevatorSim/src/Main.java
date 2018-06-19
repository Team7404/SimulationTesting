import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		
		SimulatorElevator sim1 = new SimulatorElevator(.01, 2,2.0,0.0,0.05,15);
		sim1.run();
		
		//SimulatorFlyWheel sim = new SimulatorFlyWheel(.01, 2,0.0,0.0,1,10);
		//sim.run();
		
	}
	
	
}
