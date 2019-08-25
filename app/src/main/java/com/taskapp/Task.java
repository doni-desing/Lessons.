package com.taskapp;

import java.io.Serializable;

public class Task implements Serializable {
    private String title;
    private String deck;

    public Task(String title, String deck) {
        this.title = title;
        this.deck = deck;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }
}
