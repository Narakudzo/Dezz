package ru.mirea.ikbo0819.pr1.book;

import java.lang.*;

public class TestBook {
    public static void main(String[] args){
        book b1 = new book("IT","Stephen King");
        book b2 = new book( "long walk", "Stephen King");
        book b3= new book();
        b3.setAuthor("Leo Tolstoy");
        b3.setName("War and peace");
        System.out.println(b1);
        b1.NameBA();
        b2.NameBA();
        b3.NameBA();

    }
}
