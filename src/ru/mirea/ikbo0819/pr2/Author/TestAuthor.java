package ru.mirea.ikbo0819.pr2.Author;

import java.lang.*;
public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Anna Inanova","ivAnna@someonehere.com",'F');
        Author a2 = new Author( "Leo King", "kiLeo@someonehere.com",'M');
        Author a3 = new Author();
        a3.setEmail("iVanIV@someonehere.com");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
