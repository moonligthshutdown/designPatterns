package principle.liskovsubstitution;

public class RifleGun extends Gun{

	@Override
	public void shoot() {
		System.out.println("步枪射击");
	}

}
