package test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: ruan
 * Date: 2021/7/23 9:39
 * @Description: java内存区域中的本地方法栈
 */
public class Test03 {
    //native方法调用cpu指令
    public native static void c();
    public static void a(){
        System.out.println("enter method a");
    }

    public static void b(){
        a();
        System.out.println("enter method b");
    }

    public static void main(String[] args) {
        b();
        System.out.println("enter method main");
        //CAS操作（compareAndSet）类似于数据库中的乐观锁
        //原子类
        AtomicInteger atomicInteger = new AtomicInteger(1);
        atomicInteger.compareAndSet(1,2);
    }
}
