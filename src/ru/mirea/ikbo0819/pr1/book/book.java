package ru.mirea.ikbo0819.pr1.book;

import java.lang.*;
public class book{
    private String name;
    private String author;
    private int pages;

    public book (String n,String a){
        name = n;
        author = a;
    }
    public book(){
        name = "Dead_Zone";
        author = "Stephen King";
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public String getAuthor(String author){
        return author;
    }
    public void NameBA(){
        System.out.println("the "+name+" was written by "+author);
    }
}



