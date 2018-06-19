
public class FlyWheel {
	
	// Stall Torque in N m
	  static final double kStallTorque = .071;
	  // Stall Current in Amps
	  static final double kStallCurrent = 134;
	  // Free Speed in RPM
	  static final double kFreeSpeed = 18730;
	  // Free Current in Amps
	  static final double kFreeCurrent = 0.70;
	  // Mass of the Elevator
	  static final double kMass = 5;

	  // Number of motors
	  static final double kNumMotors = 2.0;
	  // Resistance of the motor
	  static final double kResistance = 12.0 / kStallCurrent;
	  // Motor velocity constant
	  static final double Kv = ((kFreeSpeed / 60.0 * 2.0 * Math.PI) /
	             (12.0 - kResistance * kFreeCurrent));
	  // Torque constant
	  static final double Kt = (kNumMotors * kStallTorque) / kStallCurrent;
	  // Gear ratio
	  static final double kG =3;
	  // Radius of pulley
	  static final double kr = 2 * (0.0254 );//   /  Math.PI / 2.0);

	

	public FlyWheel(){
		
	}
	
	public double getAcceleration(double voltage,double velocity) {
		return  -Kt * kG * kG / (Kv * kResistance * kr * kr * kMass) * velocity +
		           kG * Kt / (kResistance * kr * kMass) * voltage;
	}
	
}
