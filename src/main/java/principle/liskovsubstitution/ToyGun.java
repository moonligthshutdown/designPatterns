package principle.liskovsubstitution;

public class ToyGun extends Gun{

	@Override
	public void shoot() {
		System.out.println("射击失败,士兵阵亡");
	}

}
