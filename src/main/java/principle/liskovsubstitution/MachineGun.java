package principle.liskovsubstitution;

public class MachineGun extends Gun {

	@Override
	public void shoot() {
		System.out.println("机枪扫射");
	}

}
