package com.soft1841.pra.five;

/**
 * String,StringBuffer,StringBuilder的比较
 * @author Moe
 * 2019.3.16
 */

public class StringTest {
    private  static int time = 40000;

    public static void main(String[] args) {
        testString();
        testStringBuffer();
        teatStringBuilder();

    }
    public static void testString() {
        String s = "";
        //获取以毫秒为单位的当前开始时间
        long begin = System.currentTimeMillis();
        //调用40000的String的拼接操作，每次都会生成新的String对象
        for (int i = 0;i< time;i++){
            s+="java";
        }
        long over = System.currentTimeMillis();
        System.out.println("操作String类型使用的时间为：" + (over - begin) +
                "毫秒");
    }
    public static void testStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        long begin = System.currentTimeMillis();
        for (int i = 0;i<time;i++){
            stringBuffer.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作StringBuffer类型使用的时间为：" + (over - begin) +
                "毫秒");
    }

    public static void teatStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        long begin = System.currentTimeMillis();
        for (int i = 0 ;i<time;i++){
            stringBuilder.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作StringBuilder类型使用的时间为：" + (over - begin) +
                "毫秒");
    }
}
