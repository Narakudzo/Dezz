package ru.mirea.ikbo0819.pr2.Author;

import java.lang.*;
public class Author{
    private String name;
    private String email;
    private char gender;

    public Author(String n,String e,char g){
        name = n;
        email = e;
        gender = g;
    }
    public Author(){
        name = "Ivan Ivanov";
        email = "";
        gender = 'M';
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return  this.name + " (" + this.gender + ") at " + this.email ;
    }
}
