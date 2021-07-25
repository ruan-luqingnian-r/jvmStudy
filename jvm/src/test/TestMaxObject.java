package test;

/**
 * @Author: ruan
 * Date: 2021/7/25 10:07
 * @Description: 对象主要被分配在新生代中
 * 但对于一些大对象则被直接分配在老年代中
 */
public class TestMaxObject {

    public static void main(String[] args) {
        byte[] bytes = new byte[1024 * 1024 * 10];
    }
}
