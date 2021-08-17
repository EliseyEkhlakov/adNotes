package com.example.notes;

public class Note {
    private String title;
    private String description;
    private String dayOfweek;
    private int prority;

    public Note(String title, String description, String dayOfweek, int prority) {
        this.title = title;
        this.description = description;
        this.dayOfweek = dayOfweek;
        this.prority = prority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDayOfweek() {
        return dayOfweek;
    }

    public int getPrority() {
        return prority;
    }
}
