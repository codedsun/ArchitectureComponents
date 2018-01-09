package com.suneetsrivastava.architecturecomponents.Data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import java.util.Date;

/**
 * Created by suneetsrivastava on 09/01/18.
 */

@Entity(tableName = "todoitem")
public class DatabaseModel {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String task;
    private String tag;
    private int tagColor;
    private int priority;
    @TypeConverters(DateConverter.class)
    private Date date;
    private boolean isTaskDone;

    DatabaseModel(String task, String tag, int tagColor, int priority, Date date){
        this.task = task;
        this.tag = tag;
        this.tagColor = tagColor;
        this.priority = priority;
        this.date = date;
        isTaskDone = false;

    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public String getTag() {
        return tag;
    }

    public int getTagColor() {
        return tagColor;
    }

    public int getPriority() {
        return priority;
    }

    public Date getDate() {
        return date;
    }

    public boolean isTaskDone() {
        return isTaskDone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaskDone(boolean taskDone) {
        isTaskDone = taskDone;
    }
}
