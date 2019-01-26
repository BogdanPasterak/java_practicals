package practical_2;

public class Radiator {

	protected boolean running;
	
	public Radiator() {
		running = false;
	}
	
	public void turnOn() {
		running = true;
	}
	
	public void turnOff() {
		running = false;
	}
	
	@Override
	public String toString() {
		return "Radiator: " + ((!running) ? "Not " : "") + "Running";
	}
}
