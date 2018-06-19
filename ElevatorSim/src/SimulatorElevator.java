
public class SimulatorElevator {

	double position_;
	double velocity_;

	double kDt;
	double simTime_;
	
	double kP;
	double kD;

	public SimulatorElevator(double kDt, double simTime_, double initPos_, double initVel_,double kP,double kD) {
		this.kDt = kDt;
		this.simTime_ = simTime_;
		this.position_ = initPos_;
		this.velocity_ = initVel_;
		this.kP = kP;
		this.kD = kD;
	}

	public void run() {

		Elevator e = new Elevator();
		this.position_ = 1;
		this.velocity_ = 0.0;
		double currentTime_ = 0.0;
		
		
		while (currentTime_ < simTime_) {

			ControllerElevator c = new ControllerElevator(kP, kD);
			
			double input = c.calculate(0, posEncoder(this.position_, 4096), velEncoder(this.velocity_, 4096));

			this.position_ += this.velocity_ * kDt;
			this.velocity_ += (e.getAcceleration(input, velocity_) )* kDt;
			System.out.println(currentTime_+ "\t" + this.position_ + "\t" + this.velocity_ + "\t" + input+ "\t" + e.getAcceleration(input, velocity_));
			

			currentTime_ += kDt;
		}
	}
	
	public double posEncoder(double meters, double ticks) {
		return meters / (Elevator.kr * 2.0 * Math.PI) * 4096;
	}
	public double velEncoder(double metersps, double ticks) {
		return metersps / (Elevator.kr * 2.0 * Math.PI) * 4096 / 10;
	}
	

}