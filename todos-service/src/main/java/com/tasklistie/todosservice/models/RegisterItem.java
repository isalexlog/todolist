package com.tasklistie.todosservice.models;

public class RegisterItem {

    private int taskID;
    private String text;
    private boolean done;

    public RegisterItem(int taskID, String text, boolean done) {
        this.taskID = taskID;
        this.text = text;
        this.done = done;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
