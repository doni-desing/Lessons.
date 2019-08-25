package com.geektech.recyclerview.Models;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Serializable {
    public String title;
    public String description;
    public Date start;
    public Date end;
    public boolean status;
    public String owner;

    public Task(String title, String description, Date start, Date end, boolean status, String owner) {
        this.title = title;
        this.description = description;
        this.start = start;
        this.end = end;
        this.status = status;
        this.owner = owner;
    }

    public String startDate() {
        return dateToString(start);
    }

    public String endDate() {
        return dateToString(end);
    }

    private String dateToString(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        String dateStr = dateFormat.format(date);
        return dateStr;
    }
}
