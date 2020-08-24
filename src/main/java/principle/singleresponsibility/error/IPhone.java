package principle.singleresponsibility.error;

/**
 *<p>原始设计:所有功能都在IPhone接口中</p>
 * 
 * @ClassName: IPhone
 * @Description: 电话接口
 * @author: YueHs
 * @date: 2020年4月4日 下午2:17:11
 * @since: JDk 1.8
 */
public interface IPhone {
        
    //打电话
    void ringUp();

    //接电话
    void receiveUp();

    //上网
    void surfInternet();

    //屏幕大小
    int setScrenSize();
    
	 //运行内存
    String setRam();

    //手机存储内存
    String setRom();

    //CPU主频
    String setCpu();
}