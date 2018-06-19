
public class ControllerElevator {
	
	public double kP;
	public double kD;
	
	public ControllerElevator(double kP, double kD) {
		this.kD = kD;
		this.kP = kP;
	}
	
	public double calculate(double goal_, double position_, double velocity_) {

		double error = goal_-position_;
		double verror = 0-velocity_;
		
		double pC = (error * kP) / 1023.0 * 12.0;
		double vC = (verror/100 * kD) / 1023.0 * 12.0;
		 
		
		return Math.min(12, Math.max(-12,pC+vC));
		
	}
	
	
}
