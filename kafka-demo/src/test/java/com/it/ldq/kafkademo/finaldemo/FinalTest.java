package com.it.ldq.kafkademo.finaldemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: ldq
 * @Date: 2020/3/11
 * @Description:
 * @Version: 1.0
 */
public class FinalTest {
    private static final int a = 1;
    private static final String b = "123";
    private static final Map map = new HashMap();
    static {
        map.put(1,2);
        map.put(2,2);
        map.put(3,3);
    }

    public static void main(String[] args) {
        //a=2;
       // b = "7";
        map.put(1,89); //对象的引用不可以在修改 但是其里面的值还可以改
        System.out.println(map);
    }
}
