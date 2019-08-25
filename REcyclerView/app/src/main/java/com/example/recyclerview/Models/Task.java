package com.example.recyclerview.Models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    public String title;
    public String descrition;
    public Date start;
    public Date end;
    public boolean status;
    public String owner;

    public Task(String title, String descrition, Date start, Date end, boolean status, String owner) {
        this.title = title;
        this.descrition = descrition;
        this.end = end;
    }

    private String dateToString() {
        return dateToString(start);
    }

    private String dateToString() {
        return (String) (end);
    }

    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
    String dateStr = dateFormat.format(task.end);
}

