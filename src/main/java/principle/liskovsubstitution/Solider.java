package principle.liskovsubstitution;

public class Solider {
	
	private Gun gun;
	
	public void setGun(Gun gun) {
		this.gun=gun;
	}
	
	public void killEnemy() {
		System.out.println("........士兵开始杀敌人.........");
		gun.shoot();
	}
}