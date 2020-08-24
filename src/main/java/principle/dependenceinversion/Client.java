package principle.dependenceinversion;

public class Client {

	public static void main(String[] args) {
		IDriver driver=new Driver();
		ICar car=new BenzCar();
		
		driver.driver(car);		
	}
}
