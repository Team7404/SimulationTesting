
public class ControllerFlyWheel {
	
	public double kP;
	public double kD;
	
	public ControllerFlyWheel(double kP, double kD) {
		this.kD = kD;
		this.kP = kP;
	}
	
	public double calculate(double goal_, double velocity_) {

		double verror = goal_-velocity_;
		
		
		double vC = (verror * kD) / 1023.0 * 12.0;
		 
		
		return Math.min(12, Math.max(-12,vC ));
		
	}
	
	
}
