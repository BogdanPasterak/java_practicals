package practical_2;

public class SmartHome {
	
	private double temperature;
	private Radiator radiator1, radiator2;
	private AirCon airCon;
	private AirVent airVent;
	
	public SmartHome(double temperature) {
		radiator1 = new Radiator();
		radiator2 = new Radiator();
		airCon = new AirCon();
		airVent = new AirVent();
		this.temperature = temperature;
		this.setTemperature(temperature);
	}
	
	public void setTemperature(double tempIn) {
		
		temperature = tempIn;
		if ( tempIn <= 10 ) {
			radiator1.turnOn();
			radiator2.turnOn();
			airCon.turnOff();
			airVent.close();
		} else if ( tempIn <= 20 ) {
			radiator1.turnOff();
			radiator2.turnOff();
			airCon.turnOn();
			airVent.halfOpen();
		} else {
			radiator1.turnOff();
			radiator2.turnOff();
			airCon.turnOn();
			airVent.open();
		}
	}
	
	@Override
	public String toString() {
		return	"Temperature: " + temperature + "\n" +
				"#1 " + radiator1 + "\n" +
				"#2 " + radiator2 + "\n" +
				airCon + "\n" + airVent;
	}

}
