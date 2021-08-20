package com.example.notes;

public class Note {
    private int id;
    private String title;
    private String description;
    private int dayOfweek;
    private int prority;

    public Note(int id, String title, String description, int dayOfweek, int prority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dayOfweek = dayOfweek;
        this.prority = prority;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDayOfweek() {
        return dayOfweek;
    }

    public int getPrority() {
        return prority;
    }

    public static String getDayAsString(int position){
        switch (position){
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            default:
                return "Воскресенье";
        }
    }
}
