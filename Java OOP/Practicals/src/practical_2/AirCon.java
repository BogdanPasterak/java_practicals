package practical_2;

public class AirCon extends Radiator {
	
	@Override
	public String toString() {
		return "AirCon: " + ((!running) ? "Not " : "") + "Running";
	}
}
