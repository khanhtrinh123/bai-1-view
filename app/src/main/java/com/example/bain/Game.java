package com.example.bain;

public class Game {
    String  name;
    String  theloai;

    public Game(String name, String theloai) {
        this.name = name;
        this.theloai = theloai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }
}
