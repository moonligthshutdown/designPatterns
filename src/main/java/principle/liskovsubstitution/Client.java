package principle.liskovsubstitution;

import java.util.HashMap;

public class Client {
	
	public static void main(String[] args) {
		//Solider soliderOne=new Solider();
		//soliderOne.setGun(new RifleGun());
		//soliderOne.killEnemy();
		
		//Father father=new Father();
		Son son=new Son();
		HashMap<String, String> map=new HashMap<String, String>();
		son.doSomething(map);
	}
}
