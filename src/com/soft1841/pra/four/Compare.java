package com.soft1841.pra.four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Compare {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("幸存者","秦明",25.0));
        list.add(new Book("六十秘方","零度",25.0));
        list.add(new Book("说话心理学","张庆",39.0));
        list.add(new Book("他像北方的风","海曙",12.0));
        Collections.sort(list);
        for (Book book: list
             ) {
            System.out.println("书名："+book.getName()+"，作者"+book.getAuthor()+",价格："+book.getPrice());

        }
        }
    }
