package test;

/**
 * @Author: ruan
 * Date: 2021/7/24 10:14
 * @Description: 引用计数器
 */
public class ReferenceCountingGC {

    public Object instance = null;

    public static void main(String[] args) {
        //创建两个对象
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        //循环引用
        objA.instance = objB;
        objB.instance = objA;
        objA = null;
        objB = null;
        System.gc();
    }
}
