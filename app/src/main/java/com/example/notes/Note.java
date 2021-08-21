package com.example.notes;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")
public class Note {
    @PrimaryKey(autoGenerate = true)
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
    //
    @Ignore
    public Note(String title, String description, int dayOfweek, int prority) {
        this.title = title;
        this.description = description;
        this.dayOfweek = dayOfweek;
        this.prority = prority;
    }

    //
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

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDayOfweek(int dayOfweek) {
        this.dayOfweek = dayOfweek;
    }

    public void setPrority(int prority) {
        this.prority = prority;
    }
}
