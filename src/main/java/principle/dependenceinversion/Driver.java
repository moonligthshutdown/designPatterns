package principle.dependenceinversion;

public class Driver implements IDriver {

	public void driver(ICar car) {
		car.run();
	}

}
