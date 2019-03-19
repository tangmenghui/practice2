package com.soft1841.pra.six;

import java.util.ArrayList;
import java.util.List;

public class ListBookTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"计算机网络基础",22.45));
        list.add(new Book(2,"传统文化与沟通交流",18.60));
        list.add(new Book(3,"数据库技术及应用",45.37));
        list.add(new Book(4,"思想道德修养与法律基础",25.36));
        System.out.println(list);
        list.add(2,new Book(5,"高数",35.76));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(2,new Book(7,"高职英语",25.13));
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(new Book(8,"传统文化与沟通交流",10.12));
        System.out.println(list);
        System.out.println(list.indexOf("传统文化与沟通交流"));
        System.out.println(list.lastIndexOf("传统文化与沟通交流"));
    }
}
