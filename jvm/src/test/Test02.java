package test;

/**
 * @Author: ruan
 * Date: 2021/7/23 9:14
 * @Description: java内存区域中的java虚拟机栈
 */
public class Test02 {
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
    }
}
