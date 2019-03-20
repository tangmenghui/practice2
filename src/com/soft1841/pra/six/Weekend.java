package com.soft1841.pra.six;

import java.util.Scanner;

enum Weekend {
     // 定义一个枚举，用来记录一周的星期
     MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
     String weekend;
     // 定义一个变量，作为临时变量
     Weekend(String weekend) {
         // 定义枚举构造函数
         this.weekend = weekend;
     }
     public String getName() {
         // 获取枚举常量对应的值
         return weekend;
     }
     public static Weekend getWeek(String week) {
         // 定义一个静态方法，用来根据输入获取对应Week枚举值
         switch (week) {
             case "mon":
                 return Weekend.MONDAY;
             case "tues":
                 return Weekend.TUESDAY;
             case "wed":
                 return Weekend.WEDNESDAY;
             case "thur":
                 return Weekend.THURSDAY;
             case "fri":
                 return Weekend.FRIDAY;
             case "sat":
                 return Weekend.SATURDAY;
             case "sun":
                 return Weekend.SUNDAY;
             default:
                 return Weekend.MONDAY;
         }
     }
 }
class EnumSetTest {
    public static void main(String[] args) {
        System.out.println("**************中英文星期对照表**************");
        Weekend weekArray[] = Weekend.values();
        for (Weekend k : weekArray) {
            // 循环遍历枚举数组
            System.out.println(k + "-------" + k.getName());
        }
        System.out.print("\n输入要查询的英文星期单词的小写缩写：");
        Scanner sc = new Scanner(System.in);
        Weekend week = Weekend.getWeek(sc.next());
        // 根据输入获取枚举值
        switch (week) {
            case MONDAY:
                System.out.println("MONDAY————" + week.getName());
                // 获取枚举值的中文描述
                break;
            case TUESDAY:
                System.out.println("TUESDAY——" + week.getName());
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY——" + week.getName());
                break;
            case THURSDAY:
                System.out.println("THURSDAY——" + week.getName());
                break;
            case FRIDAY:
                System.out.println("FRIDAY——" + week.getName());
                break;
            case SATURDAY:
                System.out.println("SATURDAY——" + week.getName());
                break;
            case SUNDAY:
                System.out.println("SUNDAY——" + week.getName());
        }
        sc.close();
    }
}