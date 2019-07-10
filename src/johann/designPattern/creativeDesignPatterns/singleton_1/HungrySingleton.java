package johann.designPattern.creativeDesignPatterns.singleton_1;

/**
 * @ClassName HungrySingleton
 * @Description 饿汉式单例模式
 * @Author Johann
 * @Date 2019-7-10 15:35
 **/
public class HungrySingleton {

    /**
     * 类在首次加载的时候，就创建好了一个实例对象，且之后不再改变，因此线程是安全的，可用于多线程。
     **/
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return instance;
    }
}