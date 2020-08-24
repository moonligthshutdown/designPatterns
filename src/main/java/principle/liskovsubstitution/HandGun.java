package principle.liskovsubstitution;

/**
 * @ClassName: HandGun
 * @Description: 手枪
 * @author: YueHs
 * @date: 2020年4月4日 下午2:58:09
 * @since: JDK 1.8
 */
public class HandGun extends Gun {

	@Override
	public void shoot() {
		System.out.println("手枪射击");
	}
}
