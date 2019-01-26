package practical_2;

public class AirVent {

	private String status;
	
	public AirVent() {
		status = "Closed";
	}
	
	public void open() {
		status = "Open";
	}
	
	public void halfOpen() {
		status = "Half-Open";
	}
	
	public void close() {
		status = "Closed";
	}
	
	@Override
	public String toString() {
		return "AirVent: " + status;
	}
}
