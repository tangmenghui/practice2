package com.soft1841.pra.four;

public class Book implements Comparable<Book>{
    private String name;
    private  String author;
    private  Double Price;
    public Book(){
    }

    public Book(String name, String author, Double price) {
        this.name = name;
        this.author = author;
        Price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
    @Override
    public int compareTo(Book book) {
        return (int) (this.getPrice() - book.getPrice());
    }
}
