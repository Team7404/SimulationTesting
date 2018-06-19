
public class SimulatorFlyWheel {

	double position_;
	double velocity_;

	double kDt;
	double simTime_;
	
	double kP;
	double kD;

	public SimulatorFlyWheel(double kDt, double simTime_, double initPos_, double initVel_,double kP,double kD) {
		this.kDt = kDt;
		this.simTime_ = simTime_;
		this.position_ = initPos_;
		this.velocity_ = initVel_;
		this.kP = kP;
		this.kD = kD;
	}

	public void run() {

		FlyWheel e = new FlyWheel();
		this.position_ = 0;
		this.velocity_ = 0.0;
		double currentTime_ = 0.0;
		
		
		while (currentTime_ < simTime_) {

			ControllerFlyWheel c = new ControllerFlyWheel(kP, kD);
			
			double input = c.calculate(velEncoder(2,4096), velEncoder(this.velocity_, 4096));

			this.position_ += this.velocity_ * kDt;
			this.velocity_ += e.getAcceleration(input, velocity_)* kDt; // 
			System.out.println(currentTime_+ "\t" + this.position_ + "\t" + this.velocity_ + "\t" + input+ "\t" + e.getAcceleration(input, velocity_));
			

			currentTime_ += kDt;
		}
	}
	
	public double posEncoder(double meters, double ticks) {
		return meters / (FlyWheel.kr * 2.0 * Math.PI) * 4096;
	}
	public double velEncoder(double metersps, double ticks) {
		return metersps / (FlyWheel.kr * 2.0 * Math.PI) * 4096 / 10;
	}
	

}